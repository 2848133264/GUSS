package oop6;

public class task3 extends PowerAdapter {
	/**
	 * •使用适配器模式 实现 计算机电源适配器模拟
	 */

	//实现苹果电脑的适配器
	public void ApplePower() {
		System.out.println("我是苹果电源适配器。。。");
		
	}
	public static void main(String[] args) {
		task3 task3 =new task3();
		task3.ApplePower();
	}
}

interface power{
	public void HuipuPower();//华为电源适配器
	public void HuashuoPower();//华硕电脑适配器
	public void LianxiangPower();//联想电脑适配器
	public void ApplePower();//苹果电脑适配器
	
}
abstract class PowerAdapter implements power{
	
	public void HuipuPower() {}
	public void HuashuoPower() {}
	public void LianxiangPower() {}
	public void ApplePower() {}
	
	public void power(){
		System.out.println("充电中 。。。");
	}
}