package Test;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
public class Test1 extends JFrame{
	JTextField text;		// �ı���Ҫ���뵥���ı�������
	JPanel panel1,panel2;	// ������壬panel1�Ǵ��山������壬������������Ϊpanel2���
	
	JButton button;	// һ����ť�������´˰�ťʱ����ӦMyEvent�¼�
	
	public Test1(){
		this.setBounds(300,200,400,300);	// ���ô����С
		this.setLayout(new BorderLayout());	// ���ô���Ĳ��ַ�ʽ
				
		text = new JTextField(15);		// �½��ı���
		button = new JButton("���");	// �½���ť	
		// �½����
		panel1 = new JPanel();
		panel2 = new JPanel();

		panel1.add(text);
		panel1.add(button);
		this.add(panel1,BorderLayout.NORTH);
		this.add(panel2);
		MyEvent();
		this.setVisible(true);		// ��ʾ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		// ���ô���ɹر�
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
	// ������
	public static void main(String[] args){
		new Test1();
	}
}
