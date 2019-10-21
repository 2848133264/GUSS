package oop5;

public class task02 {

	/**
	字符串拼接有三种方式
	//加号拼接
	str+="c"；
	//concat方法连接
	str=str.concat("c");
	new StringBuilder("a").append("c");
	
	要求:
	分别记录三种拼接10W次的时间和内存消耗
	分析出三种拼接底层原因
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "",str2 ="";
		StringBuffer str3 =new StringBuffer("");
		long start1 = System.nanoTime();//开始时间
		for(int i= 0;i<100000;i++){
			//加号拼接
			str1 +="c";
		}
		System.out.println("加号拼接的时间："+(System.nanoTime() - start1));
		
		
		long start2 = System.nanoTime();//开始时间
		for(int i= 0;i<100000;i++){
			//concat
			str2 =str2.concat("c");
		}
		System.out.println("concat 拼接消耗的时间："+(System.nanoTime() - start2));
		
		long start3 = System.nanoTime();//开始时间
		for(int i= 0;i<100000;i++){
			//concat
			str3 =str3.append("c");
		}
		System.out.println("stringbuffer 拼接消耗的时间："+(System.nanoTime() - start3));
	}

}
