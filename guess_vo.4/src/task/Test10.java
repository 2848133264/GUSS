package task;

public class Test10 {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Hello");
		
//		if(s.append("there").equals("False")){
//			System.out.println("yes");
//		}else{
//			System.out.println("�����");
//		}
		
		
		if ((s.length() > 5) && (s.append("there").equals("False"))){
			System.out.println("yes");
			
			/*
			 * s �ĳ���Ϊ 5 ������ǰ����false ������  Ҳ��     false    
			 * 
			 * false  && false  ����   false  ��������
			 */			
		}
		else {
			System.out.println("no");
			System.out.println(s.length());
		}
		System.out.println("value is " + s);
		
		// ����� && ����  �Ĺ����ǣ����ǰ����false ����֮����жϾͲ���ִ�С�
	}
}