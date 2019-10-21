package task;


class X {
	
	
	static C Y = new C();
	
	static class Y {
		 static String Z = "Black";
	}
}

class C {
	String Z = "White";
}

public class Test9 {
	public static void main(String[] args) {
		//System.out.println(X.Y.Z);  走的路线是 ：static C Y = new C(); 在访问  String Z = "White";
		System.out.println(X.Y.Z);
		System.out.println(new X().Y.Z);
		//一个类中如果有static 修饰的类，都当成外部类，调用的时候优先调用内部成员。
	}
	
}
