package oop5;

public class Test10 {
	public static void main(String[] args) {
		Father base = new Son();// 调用非静态方法
		base.notStatic();// 调用静态方法
		base.doTest();
	}
}

class Father {// 父类静态方法
	public static void doTest() {
		System.out.println("我是父类静态方法");
	}

	public void notStatic() { // 父类非静态方法
		System.out.println("我是父类非静态方法");
	}
}

class Son extends Father { // 子类同名、同参数的静态方法
	public static void doTest() {
		System.out.println("我是子类静态方法");
	}

	public void notStatic() {// 覆写父类的非静态方法
		System.out.println("我是子类非静态方法");
	}
}