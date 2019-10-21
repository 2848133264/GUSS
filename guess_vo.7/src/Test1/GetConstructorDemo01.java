package Test1;

import java.lang.reflect.Constructor; // ���뷴�������
import java.lang.reflect.InvocationTargetException;

import Test612.Person;

public class GetConstructorDemo01 {
	public static void main(String[] args) {
		Class<?> c1 = null; // ����Class����
		try {
			c1 = Class.forName("Test612.Person");// ʵ��������
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Constructor<?> con[] = c1.getConstructors();// ȫ�����췽��
		try {
			Person p = (Person)con[0].newInstance();
			p.setAge(50);
			p.setName("����");
			System.out.println(p);
			
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < con.length; i++) {
			System.out.println("���췽����" + con[i]);// ֱ�Ӵ�ӡ���
		}
	}
}