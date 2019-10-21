package task;

import static java.util.Arrays.toString;

public class Test13 {
	public static void main(String[] args) {
		printArgs(1, 2, 3, 4, 5);
	}

	static void printArgs(Object ...args) {
		//System.out.println(toString(args));;
	}
	// Object 是所有子类的父类 ，Object 类中的 tostring 方法 冲突，不能传入参数。
}