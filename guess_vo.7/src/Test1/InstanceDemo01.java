package Test1;

import Test612.Person;

public class InstanceDemo01 {
	public static void main(String[] args) {
		Class<?> c = null; // 指定泛型
		Class<?> c1 = null; // 指定泛型
		try { // 传入要实例化类的完整包.类名称
			c = Class.forName("Test612.Person");
			
			
			c1 =Class.forName("javax.swing.JFrame");
			Class<?> c3= c1.getSuperclass().getSuperclass();
			System.out.println(c3.getName());
		  
		
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Person per = null; // 声明Person对象
		try {
			per = (Person) c.newInstance();// 实例化Person对象
		} catch (Exception e) {
			e.printStackTrace();
		}
		per.setName("张无忌"); // 设置名
		per.setAge(30); // 设置年龄
		System.out.println(per); // 内容输出,调用toString()
	}
}