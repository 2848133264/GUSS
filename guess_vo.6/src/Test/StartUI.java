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
		// ����
		ButtonAction t = new ButtonAction();
		t.start();
		this.setUndecorated(true);// ���������С����һ��
		this.setAlwaysOnTop(true);// ����ʼ�������
		this.setDefaultCloseOperation(0);// ��ֹ��Alt+F4�ر�
		// ���ô��ڳ��ֵ�λ��
		this.setLocationByPlatform(true);
		this.setLocation(410, 165);
		this.setLocationRelativeTo(null);// ���þ���
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
		//������������� �Ϳ��Դ���������,���ص���ʱ����
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