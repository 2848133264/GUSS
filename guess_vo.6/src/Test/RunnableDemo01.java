package Test;

class MyThread2 implements Runnable { // ʵ��Runnable�ӿ�
	private String name; // �����ж���һ������

	public MyThread2(String name) {// ͨ�����췽��������������
		this.name = name; // Ϊname���Ը�ֵ
	}

	public void run() {
		// ��дRunnable�ӿ��е�run()����
		for (int i = 0; i < 10; i++) { // ѭ�����10��
			System.out.println(name + "����,i = " + i);
		}
	}
};

public class RunnableDemo01 {
	public static void main(String args[]) {
		MyThread2 my1 = new MyThread2("�߳�һ");// ʵ����Runnable����
		MyThread2 my2 = new MyThread2("�̶߳�");// ʵ����Runnable����
		
		Thread t1 = new Thread(my1); // ʵ����Thread�����
		Thread t2 = new Thread(my2); // ʵ����Thread�����
		t1.start(); // �����߳�
		t2.start(); // �����߳�
	}
};