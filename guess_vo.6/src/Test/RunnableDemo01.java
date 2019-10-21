package Test;

class MyThread2 implements Runnable { // 实现Runnable接口
	private String name; // 在类中定义一个属性

	public MyThread2(String name) {// 通过构造方法设置属性内容
		this.name = name; // 为name属性赋值
	}

	public void run() {
		// 重写Runnable接口中的run()方法
		for (int i = 0; i < 10; i++) { // 循环输出10次
			System.out.println(name + "运行,i = " + i);
		}
	}
};

public class RunnableDemo01 {
	public static void main(String args[]) {
		MyThread2 my1 = new MyThread2("线程一");// 实例化Runnable子类
		MyThread2 my2 = new MyThread2("线程二");// 实例化Runnable子类
		
		Thread t1 = new Thread(my1); // 实例化Thread类对象
		Thread t2 = new Thread(my2); // 实例化Thread类对象
		t1.start(); // 启动线程
		t2.start(); // 启动线程
	}
};