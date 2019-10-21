package task;

public class Test14 {
	public static void main(String[] args) {
		someMethod(1);
	}
	public static void someMethod(Integer i) {
		System.out.println("Integer 版本被调用");
	}
	
	public static void someMethod(int i) {
		System.out.println("int 版本被调用");
	}
//精度更高的先调用。
	
}