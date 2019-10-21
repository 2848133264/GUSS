package oop5;

public class Test3 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i < 10; i++) {
			count = count++;//count++ 赋值操作，
			//  改为  ：count ++；
		}
		System.out.println("count=" + count);
	}
	/*
	 * count  = 0；
	 * 由于 count ++ 是先使用，下一个count = 0，
	 */
}