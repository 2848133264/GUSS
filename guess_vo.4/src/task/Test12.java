package task;

public class Test12 {
	public static void changeStr(String str) {
		str = "welcome";
	    //改变的 值在当前的 范围内有效。
	}

	public static void main(String[] args) {
		String str = "1234";
		changeStr(str);
		System.out.println(str);
	}
}
//  字符串的特性，他是不可以改变的字符序列。