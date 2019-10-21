package task;

import java.util.Random;

public class Test7 {
	public static void main(String[] args) {
		Random r = new Random(1000);//
		for (int i = 1; i < 4; i++) {
			System.out.println("第" + i + "次：" + r.nextInt());
		}
	}
	/*
	 * return (seed ^ multiplier) & mask;
	 * 随机种子  -- 》 得到的值也是固定的值
	 * 如果没有的写种子的话，就是以时间戳为种子。
	 */
}