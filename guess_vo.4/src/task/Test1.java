package task;
//     阶段练习
public class Test1 {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime(); 
		char x = 'X';
		int i = 0;
		System.out.println(true ? x : 0); //  X  
		System.out.println(true ? x : 65536);// 88  2^31     转成int 类型的 
		System.out.println(true ? x : i);// 88 
		System.out.println(false ? 0 : x);//  x
		System.out.println(false ? i : x);// 88
		
	}
/*char int 类型的自动转换。
 * 0 可以看成char 类型，也是可以int 类型
 */
	
	
	
}