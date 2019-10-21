package oop4;

class Print { // 定义类Print
	public void fun1() { // 定义fun1()方法
		System.out.println("Print --> public void fun1(){}");
	}

	public void fun2() { // 定义fun2()方法
		this.fun1();
	}
}
class BlackPrint extends Print { // 子类通过extends继承父类
	public void fun1() { // 重写父类中的fun1()方法
		System.out.println("BlackPrint --> public void fun1(){}");
	}

	public void fun3() { // 子类自己定义的方法
		System.out.println("BlackPrint --> public void fun3(){}");
	}
}

public class PolDemo01 {
	public static void main(String[] args) {
//		BlackPrint b = new BlackPrint(); // 定义子类实例化对象
//		Print a = b; // 发生了向上转型的关系，子类 --> 父类
//		a.fun1(); // 此方法被子类重写过	
//		System.out.println("*************************************");
		
		/**
		 * 在以上的程序中已经了解了对象的向上和向下转型的基本概念，但是必须给你提醒的是，
		 * 
		    在进行对象的向下转型之前，必须首先发生对象向上转型才可以，否则将出现对象转换异常
		 */
		Print a = new BlackPrint(); // 发生了向上转型的关系，子类 --> 父类
		BlackPrint b = (BlackPrint) a; // 此时发生了向下转型关系
		b.fun1(); // 调用方法被重写的方法
		b.fun2(); // 调用父类的方法
		b.fun3(); // 调用子类自己定义的方法
	}
}
