package task01;

import java.util.Scanner;

public class task07 {
	public static void main(String[] args) {

		System.out.println("\n\t*\t\t\t\t\t*");// 5个
		System.out.println("*\t\t*\tI  love Java \t   *\t\t*\n");//
		System.out.println("\t*\t\t\t\t\t*");
		System.out.println("\t\t*\t\t\t   *");
		System.out.println("\t\t\t*\t     *");
		System.out.println("\t\t\t\t*");
        System.out.println("\n\n");
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("请输入货运里程数（km）：");
        double dis=input.nextDouble();  
        System.out.println("请输入货物的重量（吨t）：");
        double weight =input.nextDouble();
        System.out.println("请输入单位运费（1km *1t：");
        double fee =input.nextDouble();
		System.out.println("goods（）应支付的费用是：" + goods(dis, weight, fee));
		System.out.println("goodsSwitch（）应支付的费用是："+goodsSwitch(dis, weight, fee));
		System.out.println();
		
		
		System.out.println("请输入天气温度℃：");
		double temp =input.nextDouble();
		System.out.println("showtime():   "+showtime(temp));
		System.out.println("showtimeswitch():   "+showtimeswitch(temp));
		
		
	}

	public static double goods(double dis, double weight, double fee) {
		/**
		 * 
		 * 货运公司承接用户的运货请求时,会根据货运里程给客户一定的优惠折扣。 •
		 * 当货运里程在500km（不包括500km）以内时,没有折扣(discount)； •
		 * 当货运里程在1000km（不包括1000km）以内时,减免客户5%的运费； •
		 * 当货运里程在1500km（不包括1500km）以内时,减免客户8%的运费； •
		 * 当货运里程在2500km（不包括2500km）以内时,减免客户10%的运费； • 当货运里程超过2500km时，减免客户12%的运费。 •
		 * 给定用户货物重量weight、货运里程dist及单位运费fee（每吨公里运费），编程计算用户应支付的运费。 • 先用if..else做完成
		 * • 然后试着用switch语法完成。
		 */

		double sum = 0.0;
		double SUM = weight * dis * fee;
		if (dis < 500) {
			sum = SUM;

		} else if (dis >= 500 && dis < 1000) {
			sum = SUM * 0.95;

		} else if (dis >= 1000 && dis < 1500) {
			sum = SUM * 0.92;

		} else if (dis >= 1500 && dis < 2500) {
			sum = SUM * 0.90;
		} else if (dis > 2500) {
			sum = SUM * 0.88;
		}
		return sum;
	}

	public static double goodsSwitch(double dis, double weight, double fee) {
		/**
		 * 
		 * 货运公司承接用户的运货请求时,会根据货运里程给客户一定的优惠折扣。 •
		 * 当货运里程在500km（不包括500km）以内时,没有折扣(discount)； •
		 * 当货运里程在1000km（不包括1000km）以内时,减免客户5%的运费； •
		 * 当货运里程在1500km（不包括1500km）以内时,减免客户8%的运费； •
		 * 当货运里程在2500km（不包括2500km）以内时,减免客户10%的运费； • 当货运里程超过2500km时，减免客户12%的运费。 •
		 * 给定用户货物重量weight、货运里程dist及单位运费fee（每吨公里运费），编程计算用户应支付的运费。 • 先用if..else做完成
		 * • 然后试着用switch语法完成。
		 */

		int num = (int)dis/500;
		double count = 0.0 ;
		switch (num) {
		case 0:
			count = 0;
			break;
		case 1:
			count =0.95;
			break;
		case 2:
			count =0.92;
			break;
		case 3:
			count = 0.90;
			break;
		case 4:
		case 5:
			count =0.88;
			break;
		default:
			count =0.88;
			break;
		}
		return weight * dis * fee * count;

	}
 
	public static String  showtime(double temp) {
		
		/**
		 * 
在不同温度时显示不同的解释说明,从控制台接收温度值。
• 当温度小于10℃ 显示: 10℃有点冷。要多穿衣服；
• 当温度小于25℃ 显示: 23℃正合适。出去玩吧；
• 当温度大于25℃ 小于35℃ 显示: 30℃有点热；
• 当温度大于35℃ 显示: 39℃太热了!开空调；
• 先用if..else做
• 然后试着用switch语法完成。
		 */
		String result ="";
		if(temp <= 10){
			result =temp+"℃有点冷。要多穿衣服";
		}else if(temp >10 && temp <=25){
			result =temp+"℃正合适。出去玩吧";
		}else if(temp >25 &&temp <=35){
			result =temp+"℃有点热";
		}else {
			result="℃太热了!开空调";
		}
		return result;
	}
	
    public static String showtimeswitch(double  temp) {
    	
    	/**
   在不同温度时显示不同的解释说明,从控制台接收温度值。
• 当温度小于10℃ 显示: 10℃有点冷。要多穿衣服；
• 当温度小于25℃ 显示: 23℃正合适。出去玩吧；
• 当温度大于25℃ 小于35℃ 显示: 30℃有点热；
• 当温度大于35℃ 显示: 39℃太热了!开空调；
• 先用if..else做
• 然后试着用switch语法完成。
    	 */
    	String result ="";
    	
    	int num =(int)temp/5;
    	switch (num) {
		case 0:		
		case 1:
		case 2:result =temp+"℃有点冷。要多穿衣服";break;
		case 3:
		case 4:
		case 5:result =temp+"℃正合适。出去玩吧";break;
		case 6:
		case 7:result =temp+"℃有点热";break;
		case 8:result="℃太热了!开空调";break;
		
		default:
			result="℃太热了!开空调";break;
		}
		return result;	
}

   

}
