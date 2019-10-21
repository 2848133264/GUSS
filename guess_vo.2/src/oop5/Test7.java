package oop5;

class Base {// 基类
	void fun(int price, int... discounts) {
		System.out.println("Base……fun");
	}
}

class Sub extends Base {// 子类,覆写父类方法
	void fun(int price, int discounts) {
		System.out.println("Sub……fun");
	}
}

public class Test7 {
	public static void main(String[] args) {
		Base base = new Sub();// 向上转型	
		base.fun(100, 50);	
		base.fun(100, null);
		//涉及对象的多态性，父类的，编译器能找到相对应的方法，动态绑定，之后转化成数组。		
		Sub sub = new Sub();// 不转型		
//		sub.fun(100,new int[]{50});   //数据不匹配
		sub.fun(100,50);   //数据不匹配

	}
}