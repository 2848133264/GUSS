package task01;

public class task05 {
	public static void main(String[] args) {

		/**
		 * �ɱ���� ��JDK 1.5��JAVA SE 5.0��֮��������µĸ��� ���� �ɱ������
		 * ���������п��Խ��յĲ��������ǹ̶��ģ�����������Ҫ���ݵģ��ɱ�����Ķ����ʽ���£�
		 * 
		 * ����ֵ���� ��������(���͡���������){}
		 * 
		 * ˵���� 1.�ɱ������������������ָ�����͵Ĳ��������ǿɱ��� 2.������ʽ����������������������...��������
		 * 3.�ɱ����������ʹ���뷽����������ʹ��������һ�µ� 4.�����Ĳ��������пɱ��βΣ���Ҫ�����β����������
		 * 
		 * 
		 */
		System.out.print("�����ݲ�����fun()����");
		fun(); // �����ݲ���
		System.out.print("\n����һ��������fun(1)����");
		fun(1); // ����һ������
		System.out.print("\n����������� (1, 2, 3, 4, 5, 6) ��");
		fun(1, 2, 3, 4, 5, 6); // �����������
	}

	public static void fun(int... arg) {
		
		// �ɱ���������Խ�������������
		for (int i = 0; i < arg.length; i++) {
			System.out.print(arg[i] + "��");
		}

	}

}