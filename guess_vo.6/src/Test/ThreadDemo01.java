package Test;

class MyThread extends Thread { // 继承Thread类
	public void run() { // 重写Thread类中的run()方法
		for (int i = 0; i < 1000; i++) { // 循环10次输出
			String name = Thread.currentThread().getName();
			System.out.println(name + "子线程运行,i = " + i);
		}
	}
};

public class ThreadDemo01 {
	public static void main(String args[]) {
		MyThread mt1 = new MyThread(); // 实例化对象
		MyThread mt2 = new MyThread(); // 实例化对象
		//mt1.run(); // 调用线程主体,并没有开启线程
		//mt2.run(); // 调用线程主体
		mt1.start(); // 调用start方法启动线程
		mt2.start();
		
		// 所有的线程都是交替运行的,且：哪个线程抢到了 CPU 资源,哪个线程就执行。
		//线程的开启不是用run的调用，而是start 开始 方法。
		
 }
}