package oop5;

public class task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 
	* 使用循环从1加到1000
	* 请提供最少两种以上实现方式
	* 自己对比分析两种方式的优劣(耗时和内存等方面)
	* 
		 */
		
		System.out.println("方法一：");
		long timestart = System.nanoTime();
		method1(1000);
		System.out.println(System.nanoTime()-timestart);
		
		System.out.println("方法二：");
		long M_timestart_2 = System.nanoTime();
		method2(1000);
		System.out.println(System.nanoTime()-M_timestart_2);
		
		System.out.println("方法三：");
		long M_timestart_3 = System.nanoTime();
		method3(1000);;
		System.out.println(System.nanoTime()-M_timestart_3);
		
		System.out.println("方法四：");
		long M_timestart_4 = System.nanoTime();
		method4(1000);;
		System.out.println(System.nanoTime()-M_timestart_4);
	}
	static int  method1(int n){
		//for循环。
		int sum = 0;
		for(int i = 1;i<=n;i++){
			sum +=i;
		}
		return sum;
	}
	static int method2(int n){
		return (n * (1 + n ))/2;
	}
	static int method3(int n){
		int sum =0;
		do {
			sum +=n;
			n--;
		} while (n>0);
		return sum;
	}
	static int method4(int n){
		int sum = 0;
		while(n >0){
			sum +=n;
			n--;
		}
		return sum;
	}

}
