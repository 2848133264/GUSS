package test;

import oop3.Test_protectex;

public class Test_protected extends Test_protectex {
	
	public static void main(String[] args) {
		
		//���� protected���εķ���
		Test_protectex tt = new Test_protectex();
		
		Test_protected ttt = new Test_protected();
		ttt.method();
		// ttt.method2();���ܱ����ʣ�
	}

}
