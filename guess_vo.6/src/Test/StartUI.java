package Test;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class StartUI extends JFrame {
	private JButton button;

	public void init() {
		this.setSize(550, 500);
		button = new JButton("5");
		button.setFont(new Font("", Font.BOLD, 208));
		this.add(button);
		// 启动
		ButtonAction t = new ButtonAction();
		t.start();
		this.setUndecorated(true);// 隐藏最大化最小化那一栏
		this.setAlwaysOnTop(true);// 窗口始终在最顶上
		this.setDefaultCloseOperation(0);// 防止按Alt+F4关闭
		// 设置窗口出现的位置
		this.setLocationByPlatform(true);
		this.setLocation(410, 165);
		this.setLocationRelativeTo(null);// 设置居中
		this.setVisible(true);
	}
	public static void main(String[] args) {
		StartUI frm = new StartUI();
		frm.init();
		try {
		Thread.sleep(5000);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		System.exit(0);
		//如果不结束程序 就可以打开其他窗口,隐藏倒计时窗口
		}
	
	class ButtonAction extends Thread {
		int num = 5;

		@Override
		public void run() {
			while (num != 0) {
				try {
					button.setText(num + "");
					sleep(1000);
					num--;
				} catch (Exception e) {
				}
			}
		}
		
			
	}
}