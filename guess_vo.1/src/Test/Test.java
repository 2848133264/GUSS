package Test;

public class Test {

	
	
	/**
	 *作业练习
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("1.打印1~1000之间所有奇数的和(使用算法代码方式实现)");
		int sum =0;
		int count= 0;
		
		for(int i=1;i<1000;){
			sum +=i;
			count++;//计算个数
			i = i+2;
		}
		System.out.println("count:"+count+"   sum="+sum);
		System.out.println("2.打印1~10000之间所有是7的倍数的整数的个数及总和（体会设置计数器的思想）");
		int seve = 0;
		int sum7 = 0;
		for(int i= 1;i<10000;i++){
			if(i%7==0){
				sum7 +=i;
				seve ++;
			}
		}
		System.out.println("1  -  10000 7的整数个数"+seve+"     总和为sum="+sum7);
		System.out.println("3.输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。例如： 153 = 1*1*1 + 3*3*3 + 5*5*5");
		for(int i=1;i<1000;i++){
			check(i);
		}
		
		
	}
     public static void check(int n){
    	 int b = n/100;//百位
    	 int ss = n/10%10;
    	 int gg = n%10;
    	 if((int) (Math.pow(b, 3)+Math.pow(ss, 3)+Math.pow(gg,3)) == n){
    	    System.out.print(n+"  ");
          }else{
//    	 System.out.println(n+"不是水仙花数");
          }
     }
 
}
