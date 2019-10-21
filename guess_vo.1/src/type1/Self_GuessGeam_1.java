package type1;

import java.util.Scanner;

public class Self_GuessGeam_1 {

	// 声明变量
	private static String computer = "电脑"; // 电脑
	private static String person = ""; // 用户
	private static int computerScore = 0; // 电脑分数
	private static int personScore = 0; // 用户分数
	private static int geamCount = 0; // 场数
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 开始界面
		System.out.println("\n-----------欢迎进入游戏世界--------------\n\n");
		System.out.println("\t****************\n");
		System.out.println("\t** 猜拳，开始   **\n");
		System.out.println("\t****************\n");

		System.out.println("\n出拳规则：1.剪刀 2.石头 3.布\n");
		System.out.println("请选择您的角色(1：张无忌  2：乔峰  3：小三)：");
		
		// 进行玩家信息的输入
		Scanner in = new Scanner(System.in);
		int role = in.nextInt();
		int count = 3;// 三次机会
		while (count > 0) {
			if (role == 1) {
				person = "张无忌";
				break;
			} else if (role == 2) {
				person = "乔峰";
				break;
			} else if (role == 3) {
				person = "小三";
				break;
			} else {
				System.out.print("您剩下" + count + "机会\n" + "请正确输入：");
				role = in.nextInt();
				count--;
				if (count == 0) {
					System.out.println("由于您的输入不正确导致游戏结束，感谢您的使用。");
					System.out.println("给你脸了");
					System.exit(0);

				}
			}
		}

		System.out.println("您要开始玩了吗？ （y/n）:");
		String con = in.next();
		// System.out.println("请出拳：1.剪刀 2.石头 3.布");
		int perfist;// 用户出拳
		int comfist;// 电脑出拳
		while (con.equals("y")) {
			// 出拳
			perfist = personShowFist();
			comfist = computerShowFist();
			// 判定胜负
			if ((perfist == 1 && comfist == 1) || (perfist == 2 && comfist == 2) || (perfist == 3 && comfist == 3)) {
				System.out.println("结果：和局，真帅！嘿嘿，等着！");
			} else if ((perfist == 1 && comfist == 3) || (perfist == 2 && comfist == 1)
					|| (perfist == 3 && comfist == 2)) {
				System.out.println("结果：恭喜 您赢了！");
				personScore++;// 用户分数
			} else {
				System.out.println("结果：很遗憾 您输了！真笨!\n");
				computerScore++;// 电脑赢了
			}
			geamCount++;// 游戏场数
			System.out.println("\n您是否想进行下一轮比赛？（y/n）:");
			con = in.next();

		}
		/* 显示结果 */
		showResult();
	}

	private static void showResult() {
		System.out.println("-------------------结果显示------------------------");
		System.out.println(person + "   VS  " + computer);
		System.out.println("对战次数：" + geamCount + "次");
		int result = calcResult();
		if (result == 1) {
			System.out.println("结果：打成平手哦，想接着取得胜利吗？！");
		} else if (result == 2) {
			System.out.println("结果：恭喜恭喜    战胜机器人！"); // 用户获胜
		} else {
			System.out.println("结果：哈哈 ，笨笨，下次加油啊！"); // 计算机获胜
		}
		System.out.println("--------------------游戏结束-----------------------");

	}

	private static int calcResult() {
		if (personScore == computerScore) {
			return 1;// 平局

		} else if (personScore > computerScore) {
			return 2;// 用户赢
		} else {
			return 3;// 电脑赢
		}
	}

	private static int computerShowFist() {
		// TODO Auto-generated method stub
		int show = (int) (Math.random() * 10) % 3 + 1;// 生成随机数
		switch (show) {
		case 1:
			System.out.println("电脑出拳: 剪刀");
			break;
		case 2:
			System.out.println("电脑出拳：石头");
			break;
		case 3:
			System.out.println("电脑出拳：布");
		}
		return show;
	}

	private static int personShowFist() {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("\n请出拳:1.剪刀 2.石头 3.布 (输入相应数字) :");
		int show = in.nextInt();
		switch (show) {
		case 1:
			System.out.println("您出拳：剪刀");
			break;
		case 2:
			System.out.println("您出拳：石头");
			break;
		case 3:
			System.out.println("您出拳：布");
		}

		return show;
	}

}
