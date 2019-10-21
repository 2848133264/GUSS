package Test;

public class String_Test {
	public static void main(String[] args) {
		String s = "java";
		String string = "c";
		String string2 = "javac";
		String string3 = (s + string).intern();
		System.out.println(string2.equals(string3));

		System.out.println(string2 == string3);

		// intern() 方法返回字符串对象的规范化表示形式。
		//
		// 它遵循以下规则：对于任意两个字符串 s 和 t，当且仅当 s.equals(t) 为 true 时，s.intern() ==
		// t.intern() 才为 true。
		System.out.println("-----------------------------------------");
		String Str = new String("hello");

		System.out.print("返回值 :");
		System.out.println(Str.replace("ll","jj"));
		System.out.println(Str);
	
	}

}
