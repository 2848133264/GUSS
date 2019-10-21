package task;

class Dog {
	public static void bark() {
		System.out.print("woof ");
	}
}

class Basenji extends Dog {
	public static void bark() {
		System.out.println("djfaf");
	}
}

public class Test11 {
	public static void main(String[] args) {
		Dog woofer = new Dog();
		Dog nipper = new Basenji();
		woofer.bark();
		nipper.bark();
	}
	// 静态方法没有重写的概念。
}