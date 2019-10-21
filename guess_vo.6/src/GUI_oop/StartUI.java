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
		// ���ͼ��
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
		//��ʾ
		tips =new JLabel("��Ϸ�����У����Ժ�......");
		tips.setBounds(150, 350, 300,200);
		tips.setFont(new Font("",Font.BOLD,16));
		this.add(tips);
		// ����
		ButtonAction t = new ButtonAction();
		t.start();
		
		this.setUndecorated(true);// ���������С����һ��
	    this.setAlwaysOnTop(true);// ����ʼ�������
		this.setDefaultCloseOperation(0);// ��ֹ��Alt+F4�ر�
		// ���ô��ڳ��ֵ�λ��
		this.setLocationByPlatform(true);
		this.setLocationRelativeTo(null);// ���þ���
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
//		//������������� �Ϳ��Դ���������,���ص���ʱ����
//		}
	

}