package Test;

public class String_Test {
	public static void main(String[] args) {
		String s = "java";
		String string = "c";
		String string2 = "javac";
		String string3 = (s + string).intern();
		System.out.println(string2.equals(string3));

		System.out.println(string2 == string3);

		// intern() ���������ַ�������Ĺ淶����ʾ��ʽ��
		//
		// ����ѭ���¹��򣺶������������ַ��� s �� t�����ҽ��� s.equals(t) Ϊ true ʱ��s.intern() ==
		// t.intern() ��Ϊ true��
		System.out.println("-----------------------------------------");
		String Str = new String("hello");

		System.out.print("����ֵ :");
		System.out.println(Str.replace("ll","jj"));
		System.out.println(Str);
	
	}

}
