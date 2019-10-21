package oop5;

import java.util.Random;

public class Test4 {
	public static void main(String[] args) {
		System.out.println("常量值：" + Const.RAND_CONST);
		//Const.RAND_CONST = 100;// 不行，说明此时的值是static 常量。
	}
}
/* 接口常量 */

interface Const {
	// 常量？
	public static final int RAND_CONST = new Random().nextInt();
	// 对象 Random 每次执行的时候，值是会变化的。
}