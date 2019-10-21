package Test612;

import java.lang.reflect.Constructor;

public class InstanceDemo03 {
	public static void main(String[] args) {
		Class<?> c = null;
		try {// ����Class����
			c = Class.forName("Test612.Person");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Person per = null; // ����Person����
		Constructor<?> cons[] = null;// ����һ����ʾ���췽��������
		cons = c.getConstructors();// ͨ������,ȡ��ȫ������
		try {
			// ���췽���д��ݲ���,�˷���ʹ�ÿɱ��������,��ʵ��������
			per = (Person) cons[0].newInstance("���޼�", 30);
		} catch (Exception e) { // ��Ϊֻ��һ������,���������±�Ϊ0
			e.printStackTrace();
		}
		System.out.println(per); // �������
	}
}