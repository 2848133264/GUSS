package oop5;

public class task05 {

	/**
	 *
	司机开着奔驰,以下类图能完成该：
	需求现在司机不仅能开奔驰,还能开宝马BMW,你怎么修改设计？
	司机不仅宝马奔驰能开,其他车也能开,你怎么满足需求？我们依赖的是实现还是抽象？
	 */
	//实现一个接口。
	public static void main(String[] args) {
		new Driver().benchi();
		new Driver().runBMW();
		new Driver().othercar();
	}
}
class Driver extends Car{
	
	void Driver(){
		
	}

	@Override
	public void runBMW() {
		// TODO Auto-generated method stub
		System.out.println("你可以驾驶 BMW");
	}

	@Override
	public void benchi() {
		// TODO Auto-generated method stub
		System.out.println("你可以驾驶 benchi");	
	}

	@Override
	public void othercar() {
		// TODO Auto-generated method stub
		System.out.println("你可以驾驶其他种类的车子。");
	}

	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("车子启动");
	}
}
abstract class Car implements TypeCar{
	abstract void run();
}
interface TypeCar{
	void runBMW();
	void benchi();
	void othercar();
}