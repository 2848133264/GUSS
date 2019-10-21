package task;

//整数包装类对象比较？
public class Test3 {
	public static void main(String[] args) {
		Integer one = 128;
		Integer two = 128;
		System.out.println(one == two); //  integer(-128 , 127)  false    ==  表示的比较内存地址。
		Integer one2 = 100;
		Integer two2 = 100; 
		System.out.println(one2 == two2);
	}
	//integer有一个缓存范围（-128 ~ 127） 之间，超过了127 之后就会重新分配地址。
	//
}