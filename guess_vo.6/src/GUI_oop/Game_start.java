package GUI_oop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Game_start extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton bt;
	private JButton bt1;
	private JTextField tname;
	private JPasswordField passwordField;

	public Game_start() {
		// TODO Auto-generated constructor stub
		this.setTitle("�������");
		this.setSize(350, 350);
		this.setLocationRelativeTo(null);
		this.setLocale(null);
		this.setLayout(null);
		// ������
		JLabel name = new JLabel("�û���:");
		name.setBounds(50, 60, 200, 150);
		tname = new JTextField(20);
		tname.setBounds(100, 120, 200, 30);

		JLabel passsword = new JLabel("��  ��:");
		passwordField = new JPasswordField();
		passsword.setBounds(50, 100, 200, 150);
		passwordField.setBounds(100, 160, 200, 30);

		// ��ť
		bt = new JButton("����");
		bt1 = new JButton("����");
		bt.setBounds(50, 200, 60, 40);

		bt1.setBounds(240, 200, 60, 40);

		// ��ӵ���
		this.add(bt);
		this.add(bt1);
		// �������
		this.add(passsword);
		this.add(passwordField);
		// ���name
		this.add(name);
		this.add(tname);
		this.setVisible(true);
		// ��Ӽ���
		registerListenner();

	}

	private void registerListenner() {
		bt.addActionListener(this);
		bt1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton jButton = (JButton) e.getSource();
		String username = tname.getText();// ��ȡ�û���
		String password = passwordField.getText();// �������
		if ("".equals(username) || "".equals(password)) {

			JOptionPane.showConfirmDialog(null, "���������룡");

		} else {
			if (jButton == bt) {// ���밴ť��
				
			   this.dispose();// �ͷŵ�ǰ�Ĵ���
			   StartUI startUI =new StartUI();//��ӵ���ʱ�Ĵ���
			   startUI.init();
				try {
				 Thread.sleep(5000);
				} catch (InterruptedException e2) {
				    e2.printStackTrace();
				}
				//startUI.setVisible(true);
				startUI.dispose();
				//������������� �Ϳ��Դ���������,���ص���ʱ����	   		   
				Game game = new Game(username);
				game.intit();
				
			}
			if (jButton == bt1) {// �������,������������Ϊ��
				this.tname.setText("");
				this.passwordField.setText("");
				;
			}

		}

	}
}
