package task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 编写一个银行卡号逻辑处理方法，银行卡号只能由12到21个0至9的数字组成，
		 * 密码只能有6位,每一位也是有0-9的数字组成，任何不符合帐户名和密码要求的情况都视为异常，必须捕获并处理异常
		 */
		String reges = "\\d{12,21}";
		String passreges ="\\d{6}";
		String bankId = "";
		String password ="";
		Scanner input =new Scanner(System.in);
		
		//保存这个数据
		@SuppressWarnings("unchecked")
		List<task01_IDcard> list =new ArrayList();//用于保存数据
		
		//循环输入
		while(true){
			System.out.println("请输入你的12 位 到 21位数字的卡号：");
			bankId = input.next();//字符串输入的格式。
			System.out.println("请输入你的六位数密码：");
			password =input.next();
			if(check(bankId,password ,reges,passreges)){				
				task01_IDcard e =new task01_IDcard();
				//设置属性
				e.setCardId(bankId);
				e.setPassword(password);	
				//添加进去
				list.add(e);				
				System.out.println("添加成功");
				break;
			}else{
				System.out.println("输入有误！请重新输入...");
			}
		}
		//输出结果
		for (task01_IDcard task01_IDcard : list) {
			System.out.println("卡号："+task01_IDcard.getCardId()+"  密码："+task01_IDcard.getPassword());
		}
	}

	public static boolean check(String str, String password,String reg,String reg_password) {

		boolean resultString = false;
		boolean pass =false;
		boolean resut = false;//要返回的值
		// 判定str 是否为空
		if("".equals(str) || str == null ||"".equals(password) || password == null){
		  System.out.println("不能为空！");
		}else{
		//如果str不为空，则进行下一步的判定，减少异常的	
			resultString = str.matches(reg);
			pass = password.matches(reg_password);
			if(resultString && pass){ // 前者是true 这判断后者 ，连个相同的时候就判断这个最后结果
				resut = true;
				System.out.println("判断的结果是："+resultString);
			}
		}		
		return resut;
	}
}
