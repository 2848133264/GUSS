package Test;

import javax.swing.JFrame;
import javax.swing.JTextField;

import task.MyKeyListerner;

public class My extends JFrame{

	My(){
		
		
		this.setSize(300,300);
		//设置一个输入框
		//JTextField text1 =new JTextField();
		//text1.setBounds(80, 20, 30, 20);
		//this.add(text1);
	    //text1.addKeyListener(new MyKeyListerner());
	    this.addKeyListener(new MyKeyListerner());//有所冲突。
	   this.setVisible(true);
	}
	public static void main(String[] args) {
		new My();
	}
}
