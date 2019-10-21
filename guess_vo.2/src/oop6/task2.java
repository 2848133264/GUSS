package oop6;

public class task2 {
	
	public static void main(String[] args) {
		//����
		PersonDirector psd =new PersonDirector();
		
		Person person  = psd.constructPerson(new ManBuilder());
		System.out.println(person.getBody()+"\n"+person.getFoot()+"\n"+person.getHead());
		
		/**
		 * ������⣺������ģʽʹ�÷�ʽ����> 
		 * ��һ��������һ��ʵ���࣬person������һЩ����˽�е�����,�ṩget set������
		 * �ڶ���������һ��personʵ����Ľ���ӿ��ࡣ
		 * ����������һ��ʵ����ʵ��person����Ľӿ��ࡣ
		 * ���Ĳ�������һ��personDirector �࣬����person�ࡣ
		 * ���岽�����ԡ�
		 */
	}

}
//PersonDirector
class PersonDirector{
	
	public Person  constructPerson(PersonBuilder pb){
		
		pb.buildBody();
		pb.buildFoot();
		pb.buildHead();
		
		return pb.buildPerson();	
	}
	
}
//manbuilder

class ManBuilder implements PersonBuilder{ // manbuilder ��ʵ����һ��ʵ���ࡣ
	
	Person person;//����һ��person����
	
	public ManBuilder() {
		// TODO Auto-generated constructor stub
		person =new Person();
	}
	//���廯person������ֵ��
	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		person.setBody("һ���˵�����");
	}

	@Override
	public void buildFoot() {
		// TODO Auto-generated method stub
		person.setFoot("һ���˵���");
	}

	@Override
	public void buildHead() {
		// TODO Auto-generated method stub
		person.setHead("һ���˵�ͷ");
	}

	@Override
	public Person buildPerson() {
		// TODO Auto-generated method stub
		
		//����һ��person
		return person;
		
	}
	
}

interface PersonBuilder{
	
	public void buildBody();
	public void buildFoot();
	public void buildHead();
	public Person buildPerson();
}
//������ģʽ

class Person{
	private String head;
	private String body;
	private String foot;
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getFoot() {
		return foot;
	}
	public void setFoot(String foot) {
		this.foot = foot;
	}
	
}