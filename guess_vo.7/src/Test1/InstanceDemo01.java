package Test1;

import Test612.Person;

public class InstanceDemo01 {
	public static void main(String[] args) {
		Class<?> c = null; // ָ������
		Class<?> c1 = null; // ָ������
		try { // ����Ҫʵ�������������.������
			c = Class.forName("Test612.Person");
			
			
			c1 =Class.forName("javax.swing.JFrame");
			Class<?> c3= c1.getSuperclass().getSuperclass();
			System.out.println(c3.getName());
		  
		
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Person per = null; // ����Person����
		try {
			per = (Person) c.newInstance();// ʵ����Person����
		} catch (Exception e) {
			e.printStackTrace();
		}
		per.setName("���޼�"); // ������
		per.setAge(30); // ��������
		System.out.println(per); // �������,����toString()
	}
}