package guess_vo2;

import java.util.Scanner;

public class User {
	
	String name = "�����û�";
	int score = 0;
	
	@SuppressWarnings("resource")
	public int punches(){
		
		Scanner input =new Scanner(System.in);	
		System.out.println("���ȭ(1 ����,2 ʯͷ, 3��)");
		String s =input.next();
		switch (s) {
		case "1":System.out.println("�û���ȭ������");break;
		case "2":System.out.println("�û���ȭ��ʯͷ");;break;
		case "3":System.out.println("�û���ȭ����");;break;
		default:
			punches();
			break;
		}	
		return Integer.parseInt(s);
	}

}
