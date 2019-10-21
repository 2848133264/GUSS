package Test;

import java.awt.FlowLayout;
import java.util.Enumeration;
import java.util.EventListener;
import java.util.EventObject;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//�����¼�
class MyEvent extends EventObject{

	private Object source;
	private String name;
	public MyEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
		this.source = source;
	}
	public Object getSource() {
		return source;
	}
	public void setSource(Object source) {
		this.source = source;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
interface MyEventListenter extends EventListener{
	void doEvent(MyEvent event);
}
//mysource
class mySource{
	private Vector re = new Vector();
	private MyEventListenter myEventListenter;
	public mySource(){
		
	}
	//�¼�����
	public void addMyEventListenter(MyEventListenter myEventListenter){
		re.addElement(myEventListenter);
	}
	//���ü�����
	public void notifyMyEvent(MyEvent event ){
		Enumeration enumr = re.elements();
		while(enumr.hasMoreElements()){
			myEventListenter = (MyEventListenter)enumr.nextElement();
			myEventListenter.doEvent(event);
		}
	}
	public void removeMyEventListenter(MyEventListenter my){
		re.remove(my);
	}
}
//
public class Myactionevent extends JFrame implements MyEventListenter{

	
	Myactionevent(){
		
		mySource source =new mySource();
		this.setTitle("�������");
		this.setSize(350,350);
		this.setLocationRelativeTo(null);
		this.setLocale(null);
		this.setLayout(null);
		//������
		JLabel name =new JLabel("�û���:");
		name.setBounds(50, 60, 200, 150);
		JTextField tname = new JTextField(20);
		tname.setBounds(100, 120, 200, 30);
		
		JLabel passsword =new JLabel("��  ��:");
		JPasswordField passwordField =new JPasswordField();
		passsword.setBounds(50,100,200,150);
		passwordField.setBounds(100, 160, 200, 30);
		
		//��ť
		JButton bt =new JButton("����");
		JButton bt1 = new JButton("����");
		bt.setBounds(50, 200, 60, 40);
		
		bt1.setBounds(240, 200, 60, 40);
		
		//��ӵ���
		this.add(bt);
		this.add(bt1);
		//�������
		this.add(passsword);
		this.add(passwordField);
		//���name
		this.add(name);
		this.add(tname);
		this.setVisible(true);
		source.addMyEventListenter(this);
		
	}
	public static void main(String[] args) {
		new Myactionevent();
	}
	@Override
	public void doEvent(MyEvent event) {
		// TODO Auto-generated method stub
		System.out.println("�¼�����.............");
	}
}
