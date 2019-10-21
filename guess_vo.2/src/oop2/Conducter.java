package oop2;

import java.util.ArrayList;
import java.util.List;

public class Conducter {

	
	/**
	 * 我们通过有统计的功能，
	 * 小票的话应该要有数据的（能够去赋值的）
	 */
	String conducter ;
	double sum = 0.0;
	public double count(List<Receipt> receipt){
		for(Receipt i:receipt){
		  sum +=i.getFees();
		}
		return sum;
	}
	public static void main(String[] args) {
		List<Receipt> rList =new ArrayList<>();
		rList.add(new Receipt(99.6));
		rList.add(new Receipt(10.5));
		rList.add(new Receipt(99.6));
		Conducter count =new Conducter();
		double sum = count.count(rList);
		System.out.println(sum);
	}
	
}
