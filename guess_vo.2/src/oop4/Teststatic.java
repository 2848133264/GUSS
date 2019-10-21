package oop4;

public class Teststatic {

	
	//main method
	public static void main(String[] args) {
		show();
		new Teststatic().show(2);
		new Teststatic().show(2, 3);
	}
	
	public static void show() {
		System.out.println("show method");
	}
	public  void show(int a) {
		System.out.println("show method + a" +a);
	}
	public void show(int a,int b) {
		System.out.println("show method + a" +(a+b));
	}
}
