package oop5;

public class Test9 {
	
	
	public static int i = 1;
	
	static {
		i = 100;
		System.out.println("aaaaaaaaaaa");//存储在全局数据区。比构造方法更先加载。
		}
	// 顺序执行，覆盖这个    i
	public static void main(String[] args) {
		System.out.println(i);
		new Test9();//只初始化一次
	}
}