package guess_GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.RuleBasedCollator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class guess extends JFrame implements ActionListener{

	private static final long serialVersionUID = 5610708921603297306L;
	
	private JLabel  preqlbl;//�û���ȭ
	private JLabel comqlbl;//���Գ�ȭ
	private int perfist = 0;
	private int compfist = 0;
	private JButton jlbl, qlbl,blbl;//����,ʯͷ����
	private JLabel tiplbl;//�����ʾ��
	public guess() {
		// TODO Auto-generated constructor stub
		//����������
		this.setTitle("��ȭ��Ϸ");
		this.setSize(550, 500);
		//��������Ϊ�գ����Բ���
		this.setLayout(null);
		//���ͼ��		
		String filepath = "img/icon.jpg";
		ImageIcon icon = new ImageIcon(filepath);
		this.setIconImage(icon.getImage());
		//�������ͼƬ��
		String filepath1 = "img/m1.png";
		ImageIcon iconl = new ImageIcon(filepath1);
		JLabel imLabel = new JLabel();
		imLabel.setIcon(iconl);
		imLabel.setBounds(27, 40, 85, 80);
		this.add(imLabel);
		//���ȭͷͼƬ
		String filepath2 = "img/q.png";
		ImageIcon iconl1 = new ImageIcon(filepath2);
		 preqlbl = new JLabel();
		 preqlbl.setIcon(iconl1);
		 preqlbl.setBounds(125,46,50,50);
		this.add(preqlbl);
		//VSͼƬ
		String filepath3 = "img/vs1.png";
		ImageIcon iconl3 = new ImageIcon(filepath3);
		JLabel imLabel3 = new JLabel();
		imLabel3.setIcon(iconl3);
		imLabel3.setBounds(230,45,70,45);
		this.add(imLabel3);
		//�����
		String filepath4 = "img/b.png";
		ImageIcon iconl4 = new ImageIcon(filepath4);
		 comqlbl = new JLabel();
		 comqlbl.setIcon(iconl4);
		 comqlbl.setBounds(350,46,50,50);
		this.add(comqlbl);
		//�������
		String filepath5 = "img/m2.png";
		ImageIcon iconl5 = new ImageIcon(filepath5);
		JLabel imLabel5 = new JLabel();
		imLabel5.setIcon(iconl5);
		imLabel5.setBounds(420,40,85,80);
		this.add(imLabel5);
		//����
		String filepath6 = "img/j.png";
		ImageIcon iconl6 = new ImageIcon(filepath6);
		 jlbl = new JButton();
		 jlbl.setIcon(iconl6);
		 jlbl.setBounds(40,150,50,50);
		this.add(jlbl);
		//С��
		String filepath7 = "img/z.png";
		ImageIcon iconl7 = new ImageIcon(filepath7);
		tiplbl = new JLabel();
		tiplbl.setIcon(iconl7);
		tiplbl.setBounds(160,130,230,125);
		this.add(tiplbl);	
		//��
		String filepath8 = "img/b.png";
		ImageIcon iconl8 = new ImageIcon(filepath8);
		 blbl = new JButton();
		 blbl.setIcon(iconl8);
		 blbl.setBounds(40,260,50,50);
		this.add(blbl);
		//vs
		String filepath10 = "img/vs.png";
		ImageIcon iconl10 = new ImageIcon(filepath10);
		JLabel imLabel10 = new JLabel();
		imLabel10.setIcon(iconl10);
		imLabel10.setBounds(125,255,330,190);
		this.add(imLabel10);		
		//ȭͷ
		String filepath9 = "img/q.png";
		ImageIcon iconl9 = new ImageIcon(filepath9);
		qlbl = new JButton();
		qlbl.setIcon(iconl9);
		qlbl.setBounds(40,370,50,50);
		this.add(qlbl);
		
		//����
		registerListenner();
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);	
		this.setVisible(true);
	}
	private void registerListenner(){
		jlbl.addActionListener(this);
		qlbl.addActionListener(this);
		blbl.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new guess();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton) e.getSource();
		//�û���ȭ
		if(btn == jlbl){
			perfist = 1;
			preqlbl.setIcon(new ImageIcon("img/j.png"));
		}
		if(btn == qlbl){
			perfist = 2;
			preqlbl.setIcon(new ImageIcon("img/q.png"));
		}
		if(btn == blbl){
			perfist = 3;
			preqlbl.setIcon(new ImageIcon("img/b.png"));
		}
		//���Գ�ȭ
		compfist = (int) ((Math.random()*10)%3+1);
		//��������Ϊ 1��������� ��2 Ϊʯͷ�� 3�� ��
		if(compfist == 1){//����
			comqlbl.setIcon(new ImageIcon("img/j.png"));
		}
		if(compfist == 2){//ʯͷ
			comqlbl.setIcon(new ImageIcon("img/q.png"));
		}
		if (compfist == 3) {//��
			comqlbl.setIcon(new ImageIcon("img/b.png"));
		}
		
		//��ʾ���
		showresult(perfist,compfist);
		
		
	}
	 void showresult(int perfist, int compfist) {
		// TODO Auto-generated method stub
		if(perfist == compfist){//ƽ��
			tiplbl.setIcon(new ImageIcon("img/z.png"));
			this.add(tiplbl);
			// 1������  2ʯͷ��  3 ��
		}else if((perfist == 1&& compfist == 3)||
				(perfist == 2 && compfist == 1)||
				(perfist == 3 && compfist == 2)){
			//��ʾ���û�Ӯ��
			tiplbl.setIcon(new ImageIcon("img/h.png"));
		}else{
			//��ʾ���ǵ���Ӯ�ˣ������ˡ�
			tiplbl.setIcon(new ImageIcon("img/w.png"));
		}
	}
	
}
