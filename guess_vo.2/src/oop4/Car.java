package oop4;

public class Car implements Runner {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("车开始启动");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("车子正在行驶");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("车子停车");

	}
	
	//自己本类中定义的方法
	public void fillFuel() {
		System.out.println("车子满油");
	}
	public void crack() {
		System.out.println("车子出故障");
	}
	
	//测试
	public static void main(String[] args) {
		
		Car car =new Car();
		
		car.fillFuel();//车子满油
		car.start();//车子开始启动
		car.run();//车子行驶
		car.stop();//车子停下
		car.crack();//车子出故障
		
	}
}
