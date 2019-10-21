package guess_GUI;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class guess_start extends JFrame {

	guess_start() {
		/*
		 * 制作一个初始化界面 可以选择开始，退出的按钮。
		 * 
		 */
		this.setTitle("猜拳游戏");
		this.setSize(550, 500);// 设置大小
		this.setLayout(null);// 自己布局
		this.setLocationRelativeTo(null);// 居中显示

		// 添加图标
		String filepath = "img/icon.jpg";
		ImageIcon icon = new ImageIcon(filepath);
		this.setIconImage(icon.getImage());

		//背景图:通过添加一个Jpanel 来实现。
		//背景图片的路径。（相对路径或者绝对路径。本例图片放于"java项目名"的文件下）  
        String path = "img/5.jpg";  
        // 背景图片  
        ImageIcon background = new ImageIcon(path);  
        // 把背景图片显示在一个标签里面  
        JLabel label = new JLabel(background);  
        // 把标签的大小位置设置为图片刚好填充整个面板  
        label.setBounds(0, 0, this.getWidth(), this.getHeight());  
        // 把内容窗格转化为JPanel，否则不能用方法setOpaque()来使内容窗格透明  
        JPanel imagePanel = (JPanel) this.getContentPane();  
        imagePanel.setOpaque(false);  
        // 把背景图片添加到分层窗格的最底层作为背景  
        this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
			
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);// 关闭按钮
		this.setVisible(true);// 显示出窗体
	}
	public static void main(String[] args) {
		new guess_start();
	}
}
