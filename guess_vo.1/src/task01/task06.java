package task01;

public class task06 {
	
	/**
	 * 
	foreach输出
   • 数组的输出，一般都会使用for循环输出，但在JDK1.5之后为了方便数组的输出，提供了一种foreach语法，此语法的使用格式如下：
   
   for(数据类型 变量名称 : 数组名称){
   //
    }
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("不传递参数（fun()）：");
		fun(); // 不传递参数
		System.out.print("\n传递一个参数（fun(1)）：");
		fun(1); // 传递一个参数
		System.out.print("\n传递五个参数 (1, 2, 3, 4, 5, 6) ：");
		fun(1, 2, 3, 4, 5, 6); // 传递五个参数
	}

	public static void fun(int... arg) {
		// 可变参数，可以接收任意多个参数
		for (int x : arg) { // 使用foreach输出
			System.out.print(x + "、");
		}
	}

}
