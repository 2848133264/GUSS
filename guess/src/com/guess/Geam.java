package com.guess;

import java.util.Scanner;

public class Geam {
	public static void main(String[] args) {
		
		/**
		 * 步骤一：进入游戏界面
		 * 步骤二：选择角色
		 * 步骤三：用户与电脑比赛
		 * 步骤四：裁决比赛
		 * 步骤五：用户退出之后显示比赛结果
		 */
		int useScore =0,computerScore = 0;
		
//		步骤一：进入游戏界面
		System.out.println("*****************************************");
		System.out.println("\t\t************");
		System.out.println("\t\t猜拳游戏开始");
		System.out.println("\t\t************");
		System.out.println("****************************************");
//		步骤二：选择角色
		System.out.print("请输入玩家账号：");
		Scanner in= new Scanner(System.in);
		String userName =in.next();//不能出现空格
		System.out.println("请选择对战的角色（1.小哥哥，2.小姐姐 3.小三）");
		String com=in.next();
		String computer="";
		if(computer.equals("1")){
			computer = "大哥";
		}else if(computer.equals("2")){
			computer ="小姐";
		}else{
			computer = "小三";
		}
		String flag ="y";
//		步骤三：用户与电脑比赛
		do{
		System.out.println("玩家"+userName+"请出拳（1.剪刀 2.石头 3.布）");
		String cp =in.next();//玩家出拳
		if(cp.equals("1")){
			System.out.println("玩家【"+userName+"】出拳：剪刀");
			
		}
		else if(cp.equals("2")){
			System.out.println("玩家【"+userName+"】出拳：石头");
			
		}
		else if(cp.equals("3")){
			System.out.println("玩家【"+userName+"】出拳：布");
		
		}
		//电脑出拳
		int comp = (int) (Math.random()*10)%3+1;
		if(comp == 1){
			System.out.println("对战【"+computer+"】出拳：剪刀");
		}
		else if(comp == 2){
			System.out.println("对战【"+computer+"】出拳：石头");
		}
		else if(comp == 3){
			System.out.println("对战【"+computer+"】出拳：布");
		}
//		步骤四：裁决比赛
		//将用户的出拳的string类型转成int类型
		int usecpparse = Integer.parseInt(cp);
		if(usecpparse == comp ){
			System.out.println("结果：平局！！");
		}
		else if(usecpparse > comp){
			System.out.println("结果："+userName+"赢了！");
			useScore ++;
		}
		else{
			System.out.println("结果："+computer+"赢了！");
			computerScore ++;
		}
		System.out.println("是否继续游戏（y/n）!");
		flag =in.next();

	}while(flag.equals("y"));
		
//		步骤五：用户退出之后显示比赛结果
		System.out.println("****************************");
		System.out.println("\t["+userName+"] VS ["+computer+"]");
		System.out.println("\t"+useScore+"   :   "+computerScore);
		String winner = "";
		if(useScore >computerScore){
			winner = userName;
		}else if(useScore  == computerScore){
			winner = "平局";
		}else{
			winner = computer;
		}
		
		System.out.println("\t"+winner+"   获胜！");
		System.out.println("****************************");
  }
}
