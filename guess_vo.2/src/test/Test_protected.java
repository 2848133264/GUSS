package test;

import oop3.Test_protectex;

public class Test_protected extends Test_protectex {
	
	public static void main(String[] args) {
		
		//测试 protected修饰的方法
		Test_protectex tt = new Test_protectex();
		
		Test_protected ttt = new Test_protected();
		ttt.method();
		// ttt.method2();不能被访问，
	}

}
