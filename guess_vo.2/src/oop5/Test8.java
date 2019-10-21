package oop5;

public class Test8 {
	public static void main(String[] args) {
		ImplInterface.ts.methodTS();// 调用接口的实现
	}
}// 被实现的接口

interface ITest {
	public void methodTS();
}// 在接口中存在实现代码

interface ImplInterface {
	public static final ITest ts = new ITest() {
		public void methodTS() {
			System.out.println("我在接口中实现了");
		}
	};
   
	
}