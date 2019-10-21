package Test1;

import java.lang.reflect.Constructor; // 导入反射操作包
import java.lang.reflect.InvocationTargetException;

import Test612.Person;

public class GetConstructorDemo01 {
	public static void main(String[] args) {
		Class<?> c1 = null; // 声明Class对象
		try {
			c1 = Class.forName("Test612.Person");// 实例化对象
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Constructor<?> con[] = c1.getConstructors();// 全部构造方法
		try {
			Person p = (Person)con[0].newInstance();
			p.setAge(50);
			p.setName("本币");
			System.out.println(p);
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < con.length; i++) {
			System.out.println("构造方法：" + con[i]);// 直接打印输出
		}
	}
}