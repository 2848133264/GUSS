package task01;

import java.util.Scanner;

public class task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		System.out.println("请输入年龄，查询该年龄处于哪个阶段！：");
		int age =input.nextInt();
		String result=ageCheck(age);
		System.out.println(result);
	}
	 public static String ageCheck(int age,String result) {
	    	/**
				0-9 儿童
				10-19 少年
				20-29 青少年
				30-39 青年
				40-49 壮年
				50-59 中年
				60-69 中老年
				70-79 老年
				80-89 老老年
				90-99 老老老年
	    	 */
	    	Scanner input =new Scanner(System.in);
			result ="";
	    	if(age >=0 &&age <=9){
	    		result = age+"岁处于儿童阶段";
	    	}else if(age >=10 && age <=19){
	    		result = age+"岁处于少年阶段";
	    	}else if(age >=20 && age <=29){
	    		result = age+"岁处于青少年阶段";
	    	}else if(age >=30 &&age <=39){
	    		result = age+"岁处于青年阶段";
	    	}else if(age >=40 &&age <=49){
	    		result = age+"岁处于壮年阶段";
	    	}else if(age >=50 &&age <=59){
	    		result = age+"岁处于中年阶段";
	    	}else if(age >=60 &&age <=69) {
	    		result = age+"岁处于中老年阶段";
			}else if(age >=70 &&age <=79) {
				result = age+"岁处于老年阶段";
			}else if(age >=80 &&age <=89) {
				result = age+"岁处于老老年阶段";
			}else if(age >=90 &&age <=99) {
				result = age+"岁处于老老老年阶段";
			}else{
				System.out.println("输入有错!");
			}
			return result;
			
		}
	 public static String ageCheck(int age){
	    	
			int agenum =(int)age/10;
	    	switch (agenum) {
			case 0:System.out.println(age+"岁处于儿童阶段");break;
			case 1:System.out.println(age+"岁处于少年阶段");break;
			case 2:System.out.println(age+"岁处于青少年阶段");break;
			case 3:System.out.println(age+"岁处于青年阶段");break;
			case 4:System.out.println(age+"岁处于壮年阶段");break;
			case 5:System.out.println(age+"岁处于中年阶段");break;
			case 6:System.out.println(age+"岁处于中老年阶段");break;
			case 7:System.out.println(age+"岁处于老年阶段");break;
			case 8:System.out.println(age+"岁处于老老年阶段");break;
			case 9:System.out.println(age+"岁处于老老老年阶段");break;
			default:
				break;
			}
			return "";
	    }
	 public static void ageCheck(double age){
		  String [] ageName={"儿童","少年","青少年","青年","壮年","中年","中老年","老年","老老年","老老老年"};
			if(age < 0 && age>99){
				System.out.println("输入的年龄规范！");
			}
			int reage =(int)age/10;
			System.out.println(" "+age+ageName[reage]);
	    }
}
