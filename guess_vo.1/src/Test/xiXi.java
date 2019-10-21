package Test;

import java.util.Arrays;

public class xiXi {

	/**
	 * 吸血鬼数字是指位数为偶数的数字，
	 * 可以由一对数字相乘而得到，而这对数字各包含乘积的一半位数的数字，
	 * 其中从最初的数字中选取的数字可以任意排序。
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("4.写一个程序，找出4位数的所有吸血鬼的数字。例如：1260=21*60,1827=21*87");
		String[] ar_str1, ar_str2;
        int sum = 0;
        long start =System.nanoTime();
        for (int i = 10; i < 100; i++) {
            for (int j = i + 1; j < 100; j++) {
                int i_val = i * j;
                if (i_val < 1000 || i_val > 9999)
                    continue; // 积小于1000或大于9999排除,继续下一轮环
                ar_str1 = String.valueOf(i_val).split(""); //21 * 60 =1260; 0 1 2  6 
                ar_str2 = (String.valueOf(i) + String.valueOf(j)).split("");// 21+60
                Arrays.sort(ar_str1);
                Arrays.sort(ar_str2);
                if (java.util.Arrays.equals(ar_str1, ar_str2)) {
                    // 排序后比较,为真则找到一组
                    sum++;
                    System.out.println("第" + sum + "组: " + i + "*" + j + "=" + i_val);
                }
            }
        }
        System.out.println(System.nanoTime()-start);
        System.out.println("共找到" + sum + "组吸血鬼数");
	}

}
