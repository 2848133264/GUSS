package Test612;

public class Method_get_class {
	
	public static void main(String[] args) throws Exception {
		//p10
		//�Ƚϳ��õ����ֻ�ȡclass����
		Class<?> c1 =null;
		Class<?> c2 =null;
		Class<?> c3 =null;
		
		//��ʽһ��forName()
		c1 = Class.forName("Test612.Person");
		//��ʽ������.class
		c2 =Person.class;
		//��ʽ����ʵ������.getClass
		c3 =new Person().getClass();
		
		System.out.println("�����ƣ�" + c1.getName());//�������
		System.out.println("�����ƣ�" + c2.getName());//�������
		System.out.println("�����ƣ�" + c3.getName());//�������
		
	}

}
