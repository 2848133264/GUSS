package oop4;

class Print { // ������Print
	public void fun1() { // ����fun1()����
		System.out.println("Print --> public void fun1(){}");
	}

	public void fun2() { // ����fun2()����
		this.fun1();
	}
}
class BlackPrint extends Print { // ����ͨ��extends�̳и���
	public void fun1() { // ��д�����е�fun1()����
		System.out.println("BlackPrint --> public void fun1(){}");
	}

	public void fun3() { // �����Լ�����ķ���
		System.out.println("BlackPrint --> public void fun3(){}");
	}
}

public class PolDemo01 {
	public static void main(String[] args) {
//		BlackPrint b = new BlackPrint(); // ��������ʵ��������
//		Print a = b; // ����������ת�͵Ĺ�ϵ������ --> ����
//		a.fun1(); // �˷�����������д��	
//		System.out.println("*************************************");
		
		/**
		 * �����ϵĳ������Ѿ��˽��˶�������Ϻ�����ת�͵Ļ���������Ǳ���������ѵ��ǣ�
		 * 
		    �ڽ��ж��������ת��֮ǰ���������ȷ�����������ת�Ͳſ��ԣ����򽫳��ֶ���ת���쳣
		 */
		Print a = new BlackPrint(); // ����������ת�͵Ĺ�ϵ������ --> ����
		BlackPrint b = (BlackPrint) a; // ��ʱ����������ת�͹�ϵ
		b.fun1(); // ���÷�������д�ķ���
		b.fun2(); // ���ø���ķ���
		b.fun3(); // ���������Լ�����ķ���
	}
}
