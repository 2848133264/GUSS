package guess_vo2;

import java.util.Scanner;

public class User {
	
	String name = "匿名用户";
	int score = 0;
	
	@SuppressWarnings("resource")
	public int punches(){
		
		Scanner input =new Scanner(System.in);	
		System.out.println("请出拳(1 剪刀,2 石头, 3布)");
		String s =input.next();
		switch (s) {
		case "1":System.out.println("用户出拳：剪刀");break;
		case "2":System.out.println("用户出拳：石头");;break;
		case "3":System.out.println("用户出拳：布");;break;
		default:
			punches();
			break;
		}	
		return Integer.parseInt(s);
	}

}
