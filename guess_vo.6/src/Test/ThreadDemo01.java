package Test;

class MyThread extends Thread { // �̳�Thread��
	public void run() { // ��дThread���е�run()����
		for (int i = 0; i < 1000; i++) { // ѭ��10�����
			String name = Thread.currentThread().getName();
			System.out.println(name + "���߳�����,i = " + i);
		}
	}
};

public class ThreadDemo01 {
	public static void main(String args[]) {
		MyThread mt1 = new MyThread(); // ʵ��������
		MyThread mt2 = new MyThread(); // ʵ��������
		//mt1.run(); // �����߳�����,��û�п����߳�
		//mt2.run(); // �����߳�����
		mt1.start(); // ����start���������߳�
		mt2.start();
		
		// ���е��̶߳��ǽ������е�,�ң��ĸ��߳������� CPU ��Դ,�ĸ��߳̾�ִ�С�
		//�̵߳Ŀ���������run�ĵ��ã�����start ��ʼ ������
		
 }
}