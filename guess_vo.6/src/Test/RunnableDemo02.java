package Test;

class MyTicket implements Runnable { // ʵ��Runnable�ӿ�
	private int ticket = 5; // һ��5��Ʊ

	public void run() { // ��дrun()����
		for (int i = 0; i < 100; i++) { // ����Ʊ����ѭ��
			if (ticket > 0) { // �ж��Ƿ���ʣ��Ʊ
				System.out.println(Thread.currentThread().getName()+"��Ʊ��ticket=" + ticket--);
			}
		}
	}
};

public class RunnableDemo02 {
	public static void main(String args[]) {
		MyTicket my = new MyTicket();
		new Thread(my,"����һ��").start(); // ���������߳�
		new Thread(my,"���ڶ���").start(); // ���������߳�
		new Thread(my,"��������").start(); // ���������߳�
	}
};