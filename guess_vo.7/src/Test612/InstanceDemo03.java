package Test612;

import java.lang.reflect.Constructor;

public class InstanceDemo03 {
	public static void main(String[] args) {
		Class<?> c = null;
		try {// 声明Class对象
			c = Class.forName("Test612.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Person per = null; // 声明Person对象
		Constructor<?> cons[] = null;// 声明一个表示构造方法的数组
		cons = c.getConstructors();// 通过反射,取得全部构造
		try {
			// 向构造方法中传递参数,此方法使用可变参数接收,并实例化对象
			per = (Person) cons[0].newInstance("张无忌", 30);
		} catch (Exception e) { // 因为只有一个构造,所以数组下标为0
			e.printStackTrace();
		}
		System.out.println(per); // 输出对象
	}
}