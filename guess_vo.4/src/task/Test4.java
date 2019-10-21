package task;

//为什么显示剩余金额很奇怪？
public class Test4 {
	public static void main(String[] args) {
		Float totalMeoney = 20000.8f;
		Float ownMeoney = 17000.5f;
		Float leftMeoney = totalMeoney - ownMeoney;
		System.out.println("剩余金额:" + leftMeoney);
		//float 的精度在  6 ~ 7 数之间。
		//cast转换
		//类转换异常。
	}
}