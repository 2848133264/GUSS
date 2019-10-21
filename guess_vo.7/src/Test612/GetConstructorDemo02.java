package Test612;

import java.lang.reflect.Constructor;

public class GetConstructorDemo02 {
	public static void main(String[] args) {
		Class<?> c1 = null; // 声明Class对象
		try {// 实例化Class对象
			c1 = Class.forName("Test612.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Constructor<?> con[] = c1.getConstructors();// 全部构造
		for (int i = 0; i < con.length; i++) {
			Class<?> p[] = con[i].getParameterTypes();// 的参数类型
			System.out.print("构造方法：");
			System.out.print(con[i].getModifiers() + " ");// 取出权限
			System.out.print(con[i].getName()); // 构造方法名称
			System.out.print("(");// 输出“(”
			for (int j = 0; j < p.length; j++) {// 打印参数类型
				System.out.print(p[j].getName() + " arg" + i);
				if (j < p.length - 1) { // 判断是否要输出“,”
					System.out.print(",");
				}
			}
			System.out.println("){}"); // 输出“){}”
		}
	}
}