package task;

import java.io.Serializable;

//  instanceof�ж����ͣ��ֱ����ʲô��
public class Test5 {
	public static void main(String[] args) {
		Object hello = "hello";
		System.out.println(">>1:" + (hello instanceof Object));
		System.out.println(">>2:" + (hello instanceof String));
		Math math = (Math) hello;  // ����ת����ѧ����
		System.out.println(">>3:" + (math instanceof Math));
		System.out.println(">>4:" + (hello instanceof Comparable));
		System.out.println(">>5:" + (null instanceof Object));
		System.out.println(">>6:" + (hello instanceof Serializable));
		
//		Serializable  ���л�  null �������κζ���
	}
}