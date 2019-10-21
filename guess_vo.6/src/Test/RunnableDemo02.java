package Test;

class MyTicket implements Runnable { // 实现Runnable接口
	private int ticket = 5; // 一共5张票

	public void run() { // 重写run()方法
		for (int i = 0; i < 100; i++) { // 超出票数的循环
			if (ticket > 0) { // 判断是否有剩余票
				System.out.println(Thread.currentThread().getName()+"卖票：ticket=" + ticket--);
			}
		}
	}
};

public class RunnableDemo02 {
	public static void main(String args[]) {
		MyTicket my = new MyTicket();
		new Thread(my,"窗口一：").start(); // 启动三个线程
		new Thread(my,"窗口二：").start(); // 启动三个线程
		new Thread(my,"窗口三：").start(); // 启动三个线程
	}
};