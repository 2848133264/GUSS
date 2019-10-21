package Test;

public class test1 {
//	单线程代码是按程序逻辑顺序执行。
	public static void main(String[] args) {
		
	Sample s = new Sample();
	s.method2("hello!");
	   }
	}

class Sample {
	public void method1(String str) {
		System.out.println(str);
	}

	public void method2(String str) {
		method1(str);
	}
}
