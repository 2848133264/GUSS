package task;
//     �׶���ϰ
public class Test1 {
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime(); 
		char x = 'X';
		int i = 0;
		System.out.println(true ? x : 0); //  X  
		System.out.println(true ? x : 65536);// 88  2^31     ת��int ���͵� 
		System.out.println(true ? x : i);// 88 
		System.out.println(false ? 0 : x);//  x
		System.out.println(false ? i : x);// 88
		
	}
/*char int ���͵��Զ�ת����
 * 0 ���Կ���char ���ͣ�Ҳ�ǿ���int ����
 */
	
	
	
}