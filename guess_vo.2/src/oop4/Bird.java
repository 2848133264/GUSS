package oop4;

public class Bird implements Runner {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("准备起飞");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("持续飞");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("停下来休息");
	}

	void fly(){
		System.out.println("我是小鸟 我会飞");
	}
	//测试
	
	public static void main(String[] args) {
		Bird b =new Bird();
		
		b.start();
		b.run();
		b.fly();
		b.stop();
		
	}
}
