package oop4;

public class Person_task4 implements Runner {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("开始跑");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("持续在跑");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("停止跑");

	}
	public void dance(){
		System.out.println("我还会跳舞");
	}
	
	//测试
	public static void main(String[] args) {
		Person_task4 per =new Person_task4();
		
		per.start();
		per.run();
		per.stop();
		
		per.dance();
		
	}

}
