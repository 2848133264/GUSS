package Test;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class Test1 extends JFrame{
	JTextField text;		// 文本框（要输入单行文本的区域）
	JPanel panel1,panel2;	// 两个面板，panel1是窗体北部的面板，窗体其他部分为panel2面板
	
	JButton button;	// 一个按钮，当按下此按钮时，响应MyEvent事件
	
	public Test1(){
		this.setBounds(300,200,400,300);	// 设置窗体大小
		this.setLayout(new BorderLayout());	// 设置窗体的布局方式
				
		text = new JTextField(15);		// 新建文本框
		button = new JButton("添加");	// 新建按钮	
		// 新建面板
		panel1 = new JPanel();
		panel2 = new JPanel();

		panel1.add(text);
		panel1.add(button);
		this.add(panel1,BorderLayout.NORTH);
		this.add(panel2);
		MyEvent();
		this.setVisible(true);		// 显示窗体
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// 设置窗体可关闭
	}
	
	public void MyEvent(){
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String str = text.getText();
				JButton test = new JButton(str);
				panel2.add(test);
				panel2.revalidate();
			}			
		});
	}
	// 主函数
	public static void main(String[] args){
		new Test1();
	}
}
