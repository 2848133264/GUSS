package Test612;

import java.io.InputStream;

public class classload {
	
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		
		//1.��ȡһ��ϵͳ�������
		ClassLoader classloader = ClassLoader.getSystemClassLoader();
		System.out.println(classloader);
		//2.��ȡϵͳ��������ĸ��������,����չ�������
		classloader = classloader.getParent();
		System.out.println(classloader);
		//3.��ȡ��չ��������ĸ��������,�������������
		classloader = classloader.getParent();
		System.out.println(classloader);
		//4.���Ե�ǰ�����ĸ�����������м���
		classloader =
		Class.forName("Test612.Person").getClassLoader();
		System.out.println(classloader);
		//5.����JDK�ṩ��Object�����ĸ������������
		classloader =
		Class.forName("java.lang.Object").getClassLoader();
		System.out.println(classloader);
		//*6.�������������һ����Ҫ������getResourceAsStream(String str):��ȡ��·���µ�ָ��
		//�ļ���������
		//InputStream in = null;
		//in = this.getClass().getClassLoader().getResourceAsStream("com\\test.properties");
		//System.out.println(in);
		
		
	}

}
