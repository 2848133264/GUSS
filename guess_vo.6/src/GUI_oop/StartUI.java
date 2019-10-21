package GUI_oop;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class StartUI extends JFrame {
	private JButton button;
	private JLabel tips ;

	public void init() {
		// 添加图标
		String filepath = "img/icon.jpg";
		ImageIcon icon = new ImageIcon(filepath);
	    this.setIconImage(icon.getImage());
		this.setSize(550,520);
		this.setLayout(null);		
		button = new JButton("5");
		button.setBounds(150, 150, 200,200);
		button.setFont(new Font("", Font.BOLD, 208));
		//button.setBackground(Color.white);
		button.setBorder(null);
		this.add(button);
		//提示
		tips =new JLabel("游戏启动中，请稍后......");
		tips.setBounds(150, 350, 300,200);
		tips.setFont(new Font("",Font.BOLD,16));
		this.add(tips);
		// 启动
		ButtonAction t = new ButtonAction();
		t.start();
		
		this.setUndecorated(true);// 隐藏最大化最小化那一栏
	    this.setAlwaysOnTop(true);// 窗口始终在最顶上
		this.setDefaultCloseOperation(0);// 防止按Alt+F4关闭
		// 设置窗口出现的位置
		this.setLocationByPlatform(true);
		this.setLocationRelativeTo(null);// 设置居中
		this.setVisible(true);
	}
	class ButtonAction extends Thread {
		int num = 5;
		@Override
		public void run() {
			while (num != 0) {
				try {
					button.setText(num+"");
					sleep(1000);
					num--;
				} catch (Exception e) {
				}
			}
		}		
	}
//	public static void main(String[] args) {
//		StartUI frm = new StartUI();
//		frm.init();
//		try {
//		Thread.sleep(5000);
//		} catch (InterruptedException e) {
//		e.printStackTrace();
//		}
//		System.exit(0);
//		//如果不结束程序 就可以打开其他窗口,隐藏倒计时窗口
//		}
	

}