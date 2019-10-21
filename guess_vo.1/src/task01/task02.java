package task01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class task02 {
	public static void main(String[] args) {

		double a = 122.25138;
		System.out.println("方法一：\ndouble 类型数据："+a+"\n");
		DecimalFormat df2 = new DecimalFormat("#.000");
		String a1 = df2.format(a);
		System.out.println("DecimalFormat方法:"+a1);
		System.out.print("方法二:String.format：");
		String d1 = String.format("%.3f", a);
		System.out.println(d1+"\n******************************");


		System.out.println("判断一个是不是奇数");
		System.out.println("8是奇数吗？"+isodd(8));
		System.out.println("3是奇数吗？"+isodd(3));
		System.out.println("****************************************");
		System.out.println("测试精度：");
		
		final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000L;
		final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000L;
		System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
		System.out.println("****************************************");
		double arr[] = new double[10];
		Scanner input = new Scanner(System.in);
		System.out.println("求10个输入的和，保留小数点后三位\n请输入10个数字:");
		double sum = 0.0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextDouble();
			sum += arr[i];
		}
		System.out.println("平均值为："+String.format("%.3f", sum));
		
		
	}
	 
	public static boolean isodd(int i) {
//		return i%2 ==1;
		return (i&1) == 1; //位运算快。
	}
	 
}
