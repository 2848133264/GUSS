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
		//System.out.println(X.Y.Z);  �ߵ�·���� ��static C Y = new C(); �ڷ���  String Z = "White";
		System.out.println(X.Y.Z);
		System.out.println(new X().Y.Z);
		//һ�����������static ���ε��࣬�������ⲿ�࣬���õ�ʱ�����ȵ����ڲ���Ա��
	}
	
}
