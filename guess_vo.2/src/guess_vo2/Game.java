package guess_vo2;

import java.util.Scanner;

public class Game {
	
	User user;
	Computer computer;
	int count =0;
	
	Scanner  input =new Scanner(System.in);
	private void init(){
		user =new User();
		computer = new Computer();
		//输入用户和电脑的名字
		System.out.print("请输入用户名：");
		user.name = input.next();
		if(user.name.equals("")){
			System.out.println("输入的值不能为空，请重新输入");
			init();
		}
		System.out.print("请选择您的对手：1小三 ；   2 小明； 3 小小");
		String name = input.next();
		switch (name) {
		case "1":computer.name = "小三 ";break;
		case "2":computer.name = "小明";break;
		case "3":computer.name = "小小";break;
		default:
			computer.name = "小三";//默认是小三
			break;
		}
	}
	
	/**
	 * 开始游戏
	 */
	public void startGame(){
		System.out.println("\n-----------欢迎进入游戏世界--------------\n\n");
		System.out.println("\t****************\n");
		System.out.println("\t** 猜拳，开始   **\n");
		System.out.println("\t****************\n");
		init();
		/*
		 * 新需求：采用几盘几胜制
		 * 
		 * 猜拳游戏添加新需求
                      在游戏开始前，用户可以输入游戏轮数
                      如果有某一方压倒性胜利，游戏提前结束
		 */
		System.out.println("请输入要玩几轮：()");
		int  num =input.nextInt();
		int halfNum = ( num / 2)+1;
		System.out.println("num半数："+halfNum);
		while(num >0){
			int userPunche = 0;
			int computerPunche =0;
			//用户出拳
			userPunche = user.punches();
			//电脑出拳
			computerPunche =computer.punches();
			/*
			 * 如果分数直接超过num的半数时，属于压倒性胜利，直接退出比赛。
			 */
			if(userPunche == computerPunche){
				System.out.println("哈哈，本次平局啦！");
			}else if ((userPunche == 1 && computerPunche == 3) || (userPunche == 2 && computerPunche == 1)
					|| (userPunche == 3 && computerPunche == 2)) {//3，
				System.out.println("恭喜你 ，这局你赢了！");
				user.score ++;
			}else{
				System.out.println("你输了，要再接再厉哦！");
				computer.score ++;
			}
			count++;
			num -- ;
			if(user.score > halfNum || computer.score > halfNum){
				showResult();
				break;
			}
			else if(user.score == computer.score && num == 0){
				showResult();
				System.out.println("是否接着比赛（y/n）");
				String flag = input.next();
				if(!flag.equals("y")){
					break;
				}else{
					System.out.println("请输入要玩几轮：()");
					num =input.nextInt();
				}}			
//			}else if(user.score < computer.score && num == 0){
//				showResult();
//			}
			else if(num == 0){
				showResult();
				break;
			}
			
		}
	}
	/**
	 * 计算结果
	 */
	public void calcResult() {
		if(user.score == computer.score){
			
			System.out.println("结果平局。\n\n\t"+user.name +"  VS  "+ computer.name+"\n\t  "+user.score +"  :    "+computer.score);
			
		}else if(user.score > computer.score){
			
			System.out.println("你真是太强了，恭喜你获胜！\n\n\t"+user.name +"  VS  "+ computer.name+"\n\t "+user.score +"  :    "+computer.score);
			
		}else {
		
			System.out.println("你输了 真笨。\n\n\t"+user.name +"  VS  "+ computer.name+"\n\t "+user.score +"  :    "+computer.score);
		
		}
	}
    /**
     * 显示结果
     */
	public void showResult(){
		System.out.println("********************************");
		calcResult();
		System.out.println("********************************");
	}
}
