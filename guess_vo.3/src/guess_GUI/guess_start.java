package guess_GUI;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class guess_start extends JFrame {

	guess_start() {
		/*
		 * ����һ����ʼ������ ����ѡ��ʼ���˳��İ�ť��
		 * 
		 */
		this.setTitle("��ȭ��Ϸ");
		this.setSize(550, 500);// ���ô�С
		this.setLayout(null);// �Լ�����
		this.setLocationRelativeTo(null);// ������ʾ

		// ���ͼ��
		String filepath = "img/icon.jpg";
		ImageIcon icon = new ImageIcon(filepath);
		this.setIconImage(icon.getImage());

		//����ͼ:ͨ�����һ��Jpanel ��ʵ�֡�
		//����ͼƬ��·���������·�����߾���·��������ͼƬ����"java��Ŀ��"���ļ��£�  
        String path = "img/5.jpg";  
        // ����ͼƬ  
        ImageIcon background = new ImageIcon(path);  
        // �ѱ���ͼƬ��ʾ��һ����ǩ����  
        JLabel label = new JLabel(background);  
        // �ѱ�ǩ�Ĵ�Сλ������ΪͼƬ�պ�����������  
        label.setBounds(0, 0, this.getWidth(), this.getHeight());  
        // �����ݴ���ת��ΪJPanel���������÷���setOpaque()��ʹ���ݴ���͸��  
        JPanel imagePanel = (JPanel) this.getContentPane();  
        imagePanel.setOpaque(false);  
        // �ѱ���ͼƬ��ӵ��ֲ㴰�����ײ���Ϊ����  
        this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
			
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);// �رհ�ť
		this.setVisible(true);// ��ʾ������
	}
	public static void main(String[] args) {
		new guess_start();
	}
}
