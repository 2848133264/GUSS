package oop5;

import java.util.Scanner;

public class IfErrorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("输入年龄：");// 130 max 
		/*
		 * 判断这个输入 ，不能为大于 130 ，小于 0， 字符串的输入。
		 */
		int age = input.nextInt();
		if (age >=60) {
			System.out.println("老年人");
		} else if (age >= 40) {
			System.out.println("中年人");
		} else if (age >= 20) {
			System.out.println("青年人");
		}else {
			System.out.println("少年");
		}
		//如果输入的年龄小于20时 将不输出任何提示。
		//人类年龄的范围问题。
	}

}
