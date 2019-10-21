package oop5;

public class ForCountTest {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("i的值=" + i); // i = 0  1
			i *= 0.1;//     i = i*0.1;      自动转化成整型   0.1  == 0 
			/*
			 * 循环不正确。
			 * 因为 i 本身是整型的，在第一次 i 为零 ，输出  i = 0，  i *=0.1 的时候 为零，
			 * 第二次循环的时候，i =1， i *=0.1 的时候 同样为零，但此时的i 为 1，之后重复 第二次循环
			 */
		}
	}
}