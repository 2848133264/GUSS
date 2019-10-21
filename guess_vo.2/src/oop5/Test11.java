package oop5;

public class Test11 {
	public static void main(String[] args) {
		Son1 s = new Son1();
		s.test();
	}
}

class FatherA {// 父类
	FatherA() {
		new Other();
	}
}

class Son1 extends FatherA {// 子类
	public void test() {
		System.out.println("Hi, show me test");
	}
}

class Other {// 相关类
	public Other() {
		new Son1();
	}
}
/**
 * 
 * Exception in thread "main" java.lang.StackOverflowError
 */





