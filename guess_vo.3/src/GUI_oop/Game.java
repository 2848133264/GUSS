package GUI_oop;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Game extends JFrame implements ActionListener {

	private User user;
	private computer comp;
	private int count = 0;// ��¼����
	// ��ʼ��
	JLabel preqlbl;// �û���ȭ
	JLabel comqlbl;// ���Գ�ȭ
	int perfist = 0;
	int compfist = 0;
	JButton jlbl, qlbl, blbl;// ����,ʯͷ����
	JLabel tiplbl;// �����ʾ��

	//����һ����ť������������Ϸ
	JButton  overGame ;
	public void intit() {
		user = new User();
		comp = new computer();
		// ��Ϸ����
		// ����������
		// ����������
		this.setTitle("��ȭ��Ϸ");
		this.setSize(550, 500);
		// ��������Ϊ�գ����Բ���
		this.setLayout(null);
		
		////����һ����ť������������Ϸ
		overGame =new JButton("����");
		overGame.setBounds(440, 370, 60, 60);
		overGame.setBackground(Color.white);
		this.add(overGame);
		// ���ͼ��
		String filepath = "img/icon.jpg";
		ImageIcon icon = new ImageIcon(filepath);
		this.setIconImage(icon.getImage());
		// �������ͼƬ��
		String filepath1 = "img/m1.png";
		ImageIcon iconl = new ImageIcon(filepath1);
		JLabel imLabel = new JLabel();
		imLabel.setIcon(iconl);
		imLabel.setBounds(27, 40, 85, 80);
		this.add(imLabel);
		// ���ȭͷͼƬ
		String filepath2 = "img/q.png";
		ImageIcon iconl1 = new ImageIcon(filepath2);
		preqlbl = new JLabel();
		preqlbl.setIcon(iconl1);
		preqlbl.setBounds(125, 46, 50, 50);
		this.add(preqlbl);
		// VSͼƬ
		String filepath3 = "img/vs1.png";
		ImageIcon iconl3 = new ImageIcon(filepath3);
		JLabel imLabel3 = new JLabel();
		imLabel3.setIcon(iconl3);
		imLabel3.setBounds(230, 45, 70, 45);
		this.add(imLabel3);
		// �����
		String filepath4 = "img/b.png";
		ImageIcon iconl4 = new ImageIcon(filepath4);
		comqlbl = new JLabel();
		comqlbl.setIcon(iconl4);
		comqlbl.setBounds(350, 46, 50, 50);
		this.add(comqlbl);
		// �������
		String filepath5 = "img/m2.png";
		ImageIcon iconl5 = new ImageIcon(filepath5);
		JLabel imLabel5 = new JLabel();
		imLabel5.setIcon(iconl5);
		imLabel5.setBounds(420, 40, 85, 80);
		this.add(imLabel5);
		// ����
		String filepath6 = "img/j.png";
		ImageIcon iconl6 = new ImageIcon(filepath6);
		jlbl = new JButton();
		jlbl.setIcon(iconl6);
		jlbl.setBounds(40, 150, 50, 50);
		this.add(jlbl);
		// С��
		String filepath7 = "img/z.png";
		ImageIcon iconl7 = new ImageIcon(filepath7);
		tiplbl = new JLabel();
		tiplbl.setIcon(iconl7);
		tiplbl.setBounds(160, 130, 230, 125);
		this.add(tiplbl);
		// ��
		String filepath8 = "img/b.png";
		ImageIcon iconl8 = new ImageIcon(filepath8);
		blbl = new JButton();
		blbl.setIcon(iconl8);
		blbl.setBounds(40, 260, 50, 50);
		this.add(blbl);
		// vs
		String filepath10 = "img/vs.png";
		ImageIcon iconl10 = new ImageIcon(filepath10);
		JLabel imLabel10 = new JLabel();
		imLabel10.setIcon(iconl10);
		imLabel10.setBounds(125, 255, 330, 190);
		this.add(imLabel10);
		// ȭͷ
		String filepath9 = "img/q.png";
		ImageIcon iconl9 = new ImageIcon(filepath9);
		qlbl = new JButton();
		qlbl.setIcon(iconl9);
		qlbl.setBounds(40, 370, 50, 50);
		this.add(qlbl);
		//
		registerListenner();	
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	//ע�����
	private void registerListenner() {
		jlbl.addActionListener(this);
		qlbl.addActionListener(this);
		blbl.addActionListener(this);
		overGame.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton) e.getSource();
		perfist = user.punches(this, btn);
		// ���Գ�ȭ
		compfist = comp.punches(this);
		/*
		 * if (compfist == 1) {// ���� comqlbl.setIcon(new
		 * ImageIcon("img/j.png")); } if (compfist == 2) {// ʯͷ
		 * comqlbl.setIcon(new ImageIcon("img/q.png")); } if (compfist == 3) {//
		 * �� comqlbl.setIcon(new ImageIcon("img/b.png")); }
		 */
		
		// ���㵱ǰ�ı����Ľ��
		rule(perfist, compfist);
		// ��ʾ���
		// �����ť��ʱ�� ʵ�ֽ�����
		if (btn == overGame) {
			jFrame aFrame = new jFrame(showResult());
			// ��������
			aFrame.lister1(this);
		}

	}

	public int rule(int perFist, int compFist) {
		/*
		 * 1.���perFist == compFist ----> ƽ�� 2.��� perFist == 1 && compFist ==3 ||
		 * perFist == 2 && compFist== 1 || perFist == 3&& compFist == 2 �û�Ӯ
		 * 3.�������ʤ��
		 */
		if (perFist == compFist) {
			System.out.println("��֣��;֣���˧��");
			tiplbl.setIcon(new ImageIcon("img/z.png"));
			this.add(tiplbl);
		} else if ((perFist == 1 && compFist == 3) || (perFist == 2 && compFist == 1)
				|| (perFist == 3 && compFist == 2)) {
			tiplbl.setIcon(new ImageIcon("img/h.png"));
			System.out.println("��֣���ϲ����Ӯ�ˣ�");
			user.score++;
			return 1;
		} else {
			tiplbl.setIcon(new ImageIcon("img/w.png"));
			System.out.println("�����ˣ��ٽ�������");
			comp.score++;
			return 2;
		}
		return 0;
	}

	public String  showResult() {	
		String result ="";
		if (user.score == comp.score) {
			result = "ƽ��!      " + user.name + "  VS  " + comp.name + "   " + user.score + "  :    " + comp.score;
		} else if (user.score > comp.score) {
			result = "��ϲ�� ��ʤ !      " + user.name + "  VS  " + comp.name + "    " + user.score+ "  :    " + comp.score;
		} else {
			result = "������ !    " + user.name + "  VS  " + comp.name + "   " + user.score + "  :    " + comp.score;
		}
		return result ;
	}

}
