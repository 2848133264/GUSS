package oop5;

public class Test6 {
	public void methodA(String str, Integer... is) {
		System.out.println("жиди1...");
	}

	public void methodA(String str, String... strs) {
		System.out.println("жиди2...");
	}

	public static void main(String[] args) {
		Test6 test3 = new Test6();
		test3.methodA("China", 0);
		test3.methodA("China", "People","dafdfa");
//		test3.methodA("China");//
//		test3.methodA("China", null);
	}
}