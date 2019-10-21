package task01;

public class task05 {
	public static void main(String[] args) {

		/**
		 * 可变参数 在JDK 1.5（JAVA SE 5.0）之后产生了新的概念 —— 可变参数，
		 * 即：方法中可以接收的参数不再是固定的，而是随着需要传递的，可变参数的定义格式如下：
		 * 
		 * 返回值类型 方法名称(类型…参数名称){}
		 * 
		 * 说明： 1.可变参数：方法参数部分指定类型的参数个数是可变多个 2.声明方式：方法名（参数的类型名...参数名）
		 * 3.可变参数方法的使用与方法参数部分使用数组是一致的 4.方法的参数部分有可变形参，需要放在形参声明的最后
		 * 
		 * 
		 */
		System.out.print("不传递参数（fun()）：");
		fun(); // 不传递参数
		System.out.print("\n传递一个参数（fun(1)）：");
		fun(1); // 传递一个参数
		System.out.print("\n传递五个参数 (1, 2, 3, 4, 5, 6) ：");
		fun(1, 2, 3, 4, 5, 6); // 传递五个参数
	}

	public static void fun(int... arg) {
		
		// 可变参数，可以接收任意多个参数
		for (int i = 0; i < arg.length; i++) {
			System.out.print(arg[i] + "、");
		}

	}

}
