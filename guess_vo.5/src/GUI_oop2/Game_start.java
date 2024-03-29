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
		this.setTitle("登入界面");
		this.setSize(350,350);
		this.setLocationRelativeTo(null);
		this.setLocale(null);
		this.setLayout(null);
		//添加面板
		JLabel name =new JLabel("用户名:");
		name.setBounds(50, 60, 200, 150);
		tname = new JTextField(20);
		tname.setBounds(100, 120, 200, 30);
		
		JLabel passsword =new JLabel("密  码:");
		passwordField =new JPasswordField();
		passsword.setBounds(50,100,200,150);
		passwordField.setBounds(100, 160, 200, 30);
		
		//按钮
		bt =new JButton("登入");
		bt1 = new JButton("重置");
		bt.setBounds(50, 200, 60, 40);
		
		bt1.setBounds(240, 200, 60, 40);
		
		//添加登入
		this.add(bt);
		this.add(bt1);
		//添加密码
		this.add(passsword);
		this.add(passwordField);
		//添加name
		this.add(name);
		this.add(tname);
		this.setVisible(true);
		//添加监听
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
		if(jButton == bt){//登入按钮，
			Game game =new Game();
			//登入成功之后，数据的提交
		    String username= tname.getText();//获取用户名
		    String password = passwordField.getText();//获得数据
		   // System.out.println(username + ','+ password);
		    game.user.name = username;
		    game.user.setPassword(password);
		    //开始游戏界面
		    game.intit();
		}
		if(jButton == bt1){//清除功能,设置它的内容为空
			this.tname.setText("");
			this.passwordField.setText("");;
		}
	}
}
