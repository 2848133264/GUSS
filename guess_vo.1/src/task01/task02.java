package task01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class task02 {
	public static void main(String[] args) {

		double a = 122.25138;
		System.out.println("����һ��\ndouble �������ݣ�"+a+"\n");
		DecimalFormat df2 = new DecimalFormat("#.000");
		String a1 = df2.format(a);
		System.out.println("DecimalFormat����:"+a1);
		System.out.print("������:String.format��");
		String d1 = String.format("%.3f", a);
		System.out.println(d1+"\n******************************");


		System.out.println("�ж�һ���ǲ�������");
		System.out.println("8��������"+isodd(8));
		System.out.println("3��������"+isodd(3));
		System.out.println("****************************************");
		System.out.println("���Ծ��ȣ�");
		
		final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000L;
		final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000L;
		System.out.println(MICROS_PER_DAY / MILLIS_PER_DAY);
		System.out.println("****************************************");
		double arr[] = new double[10];
		Scanner input = new Scanner(System.in);
		System.out.println("��10������ĺͣ�����С�������λ\n������10������:");
		double sum = 0.0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextDouble();
			sum += arr[i];
		}
		System.out.println("ƽ��ֵΪ��"+String.format("%.3f", sum));
		
		
	}
	 
	public static boolean isodd(int i) {
//		return i%2 ==1;
		return (i&1) == 1; //λ����졣
	}
	 
}
