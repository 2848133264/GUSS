package Test612;

public class Method_get_class {
	
	public static void main(String[] args) throws Exception {
		//p10
		//比较常用的三种获取class对象
		Class<?> c1 =null;
		Class<?> c2 =null;
		Class<?> c3 =null;
		
		//方式一：forName()
		c1 = Class.forName("Test612.Person");
		//方式二：类.class
		c2 =Person.class;
		//方式三：实例对象.getClass
		c3 =new Person().getClass();
		
		System.out.println("类名称：" + c1.getName());//类的名称
		System.out.println("类名称：" + c2.getName());//类的名称
		System.out.println("类名称：" + c3.getName());//类的名称
		
	}

}
