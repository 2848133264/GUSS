package oop6;

public class task2 {
	
	public static void main(String[] args) {
		//测试
		PersonDirector psd =new PersonDirector();
		
		Person person  = psd.constructPerson(new ManBuilder());
		System.out.println(person.getBody()+"\n"+person.getFoot()+"\n"+person.getHead());
		
		/**
		 * 个人理解：建造者模式使用方式——> 
		 * 第一步：创建一个实体类，person（包含一些基本私有的属性,提供get set方法，
		 * 第二步：创建一个person实体类的建造接口类。
		 * 第三部：用一个实现类实现person建造的接口类。
		 * 第四步：创建一个personDirector 类，构建person类。
		 * 第五步：测试。
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

class ManBuilder implements PersonBuilder{ // manbuilder 其实就是一个实现类。
	
	Person person;//声明一个person对象。
	
	public ManBuilder() {
		// TODO Auto-generated constructor stub
		person =new Person();
	}
	//具体化person的属性值。
	@Override
	public void buildBody() {
		// TODO Auto-generated method stub
		person.setBody("一个人的身体");
	}

	@Override
	public void buildFoot() {
		// TODO Auto-generated method stub
		person.setFoot("一个人的腿");
	}

	@Override
	public void buildHead() {
		// TODO Auto-generated method stub
		person.setHead("一个人的头");
	}

	@Override
	public Person buildPerson() {
		// TODO Auto-generated method stub
		
		//返回一个person
		return person;
		
	}
	
}

interface PersonBuilder{
	
	public void buildBody();
	public void buildFoot();
	public void buildHead();
	public Person buildPerson();
}
//建造者模式

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