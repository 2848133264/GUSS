package GUI_oop2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Game_start extends JFrame implements ActionListener{ 

	private JButton bt;
	private JButton bt1;
	private JTextField tname;
	private JPasswordField passwordField;
	public Game_start() {
		// TODO Auto-generated constructor stub
		this.setTitle("�������");
		this.setSize(350,350);
		this.setLocationRelativeTo(null);
		this.setLocale(null);
		this.setLayout(null);
		//������
		JLabel name =new JLabel("�û���:");
		name.setBounds(50, 60, 200, 150);
		tname = new JTextField(20);
		tname.setBounds(100, 120, 200, 30);
		
		JLabel passsword =new JLabel("��  ��:");
		passwordField =new JPasswordField();
		passsword.setBounds(50,100,200,150);
		passwordField.setBounds(100, 160, 200, 30);
		
		//��ť
		bt =new JButton("����");
		bt1 = new JButton("����");
		bt.setBounds(50, 200, 60, 40);
		
		bt1.setBounds(240, 200, 60, 40);
		
		//��ӵ���
		this.add(bt);
		this.add(bt1);
		//�������
		this.add(passsword);
		this.add(passwordField);
		//���name
		this.add(name);
		this.add(tname);
		this.setVisible(true);
		//��Ӽ���
		registerListenner();
		
	}
	private void registerListenner(){
		bt.addActionListener(this);
		bt1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton jButton =(JButton) e.getSource();
		if(jButton == bt){//���밴ť��
			Game game =new Game();
			//����ɹ�֮�����ݵ��ύ
		    String username= tname.getText();//��ȡ�û���
		    String password = passwordField.getText();//�������
		   // System.out.println(username + ','+ password);
		    game.user.name = username;
		    game.user.setPassword(password);
		    //��ʼ��Ϸ����
		    game.intit();
		}
		if(jButton == bt1){//�������,������������Ϊ��
			this.tname.setText("");
			this.passwordField.setText("");;
		}
	}
}
