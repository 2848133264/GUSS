package task;

import java.util.Random;

public class Test7 {
	public static void main(String[] args) {
		Random r = new Random(1000);//
		for (int i = 1; i < 4; i++) {
			System.out.println("��" + i + "�Σ�" + r.nextInt());
		}
	}
	/*
	 * return (seed ^ multiplier) & mask;
	 * �������  -- �� �õ���ֵҲ�ǹ̶���ֵ
	 * ���û�е�д���ӵĻ���������ʱ���Ϊ���ӡ�
	 */
}