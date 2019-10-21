package GUI_oop;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.AllPermission;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

import GUI_oop.IOutil;

public class jFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel label, aa,aa1;
	private JButton leave, continueGame;
	private JLabel lastsore ;
	
	public jFrame(String result) {
		this.setTitle("Gameover");
		this.setLayout(null);
		this.setSize(320, 220);
		this.setLocationRelativeTo(null);// ������ʾ��Ч����������������õĺ��� ����

		aa = new JLabel("���������");
		aa.setBounds(60, 20, 100, 40);
		aa.setForeground(Color.red);
		this.add(aa);
		aa1 = new JLabel("��  ��");
		aa1.setBounds(60, 46, 100, 40);
		aa1.setForeground(Color.red);
		this.add(aa1);
		//�ϴεĳɼ�
		lastsore =new JLabel();
		lastsore.setBounds(100, 46, 100, 40);
		
		lastsore.setText(IOutil.readData());//��ȡ����
		
		lastsore.setForeground(Color.red);
		this.add(lastsore);
		
		label = new JLabel();
		label.setBounds(60, 50, 260, 100);
		label.setText(result);
		label.setForeground(Color.red);
		this.add(label);
		// ����Ӽ�����ť���뿪������
		leave = new JButton("�뿪");
		continueGame = new JButton("����");
			
		continueGame.setBounds(30, 111, 60, 30);
		leave.setBounds(120, 111, 60, 30);
	
		this.add(leave);
		this.add(continueGame);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
		
			
	}
	public void lister1(Game game) {

		// �ֶ���Ӽ���
		leave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub	
				
				//List<Rank> list =new ArrayList<>();//�û�������Ϣ��
					String time = IOutil.sdf.format(new Date().getTime());//��ʽ��ʱ����ȷ
				//System.out.println(time);
				//������Ϣ�Ĳ���
				//Rank rank =new Rank(time, "%"+game.user.name+"%", game.user.score);			
				String data = time + "%"+game.user.name + "%"+game.user.score+"-";			
				System.out.println(data);	
				
				try {
					String nn = IOutil.Rankread();//�ϴε�����							
					IOutil.RankscoreWriter(data+nn);
					//System.out.println(IOutil.Rankread());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				IOutil.writeData("�û��ɼ���"+game.user.score+"��");
				
				System.exit(0);
			}
		});

		continueGame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// ���ʵ�ַ�����һ����Ϸ������ȥ��
				//���ǵ�ǰ��������廹�ǻ���ʾ�ڽ����ϡ�
				game.setVisible(true);
			
			}
		});
		

		
	}


}
