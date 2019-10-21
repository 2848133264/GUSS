package oop5;

import java.util.Arrays;

public class Test13 {
	public static void main(String[] args) {
		String[] strs = { "Z 李三（s）",  "W 李五(w)" ,"L 李四(s)"};
		// 排序,默认是升序
		Arrays.sort(strs);// 
		char  z = '张';
		System.out.println((int)z);  // sma
		int i = 0;
		for (String str : strs) {
			System.out.println((++i) + "、" + str);
		}
	}
}