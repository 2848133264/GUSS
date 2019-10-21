package type1;

import java.util.Scanner;

public class GuessGeam {
	
	private static String computer="";//��ʾ����
	private static String person="С���";//��ʾ�û�
	private static int computerScore=0;//��ʾ���Եĳɼ�
	private static int personScore=0;//��ʾ�û��ĳɼ�
	private static int geamCount=0;//��ʾ��������
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("----------------�� ӭ �� �� �� Ϸ �� ��----------------\n");
		System.out.println("\n\t\t******************");
		System.out.println("\t\t**  ��ȭ, ��ʼ    **");
		System.out.println("\t\t******************");

		System.out.println("\n\n��ȭ����1.���� 2.ʯͷ 3.��");
		/* ѡ��Է���ɫ */
		System.out.print("��ѡ���ɫ��1�����޼� 2���Ƿ� 3������壩�� ");
		Scanner input = new Scanner(System.in);
		int role = 1;
		while (true) {		
			try {
				role = input.nextInt();
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("����ȷ���루1 2 3 ���е�һ����������");
				input.next();
			}
		}
		if (role == 1) {
			computer = "����";
		} else if (role == 2) {
			computer = "��Ȩ";
		} else if (role == 3) {
			computer = "�ܲ�";
		}else {
			computer = "��Ȩ";//��������������ʱ ����Ȩ��
		}
		// ��ѡ����˵Ľ�ɫ

		System.out.print("\nҪ��ʼ�𣿣�y/n�� ");
		String con = input.next();
		int perFist; // �û�����ȭ
		int compFist; // ���������ȭ
		while (con.equals("y")) {
			/* ��ȭ */
			perFist = personShowFist();// �û���ȭ
			compFist = computerShowFist();// ���Գ�ȭs
			/* �þ� */
			if ((perFist == 1 && compFist == 1) || (perFist == 2 && compFist == 2) || (perFist == 3 && compFist == 3)) {
				System.out.println("���:�;�,��˥���ٺ�,�����ư� !\n"); // ƽ��
				// 1.���� �� 3.�� Ӯ��|| 2.ʯͷ �� 1.���� Ӯ��|| 3.�� �� 2.ʯͷ Ӯ��
			} else if ((perFist == 1 && compFist == 3) || (perFist == 2 && compFist == 1)
					|| (perFist == 3 && compFist == 2)) {
				System.out.println("����� ��ϲ�� ��Ӯ�ˣ�"); // �û�Ӯ
				personScore++;
			} else {
				System.out.println("���˵:^_^,�����ˣ��汿!\n"); // �����Ӯ
				computerScore++;
			}
			geamCount++;
			System.out.print("\n�Ƿ�ʼ��һ�֣�y/n��:  ");
			con = input.next();
		}
		/* ��ʾ��� */
		showResult();
	}

	/**
	 * ��ʾ�������
	 */
	private static void showResult() {
		/*��ʾ�����*/
		System.out.println("---------------------------------------------------");
		System.out.println(computer + "  VS  " + person);
		System.out.println("��ս������"+ geamCount);
		int result = calcResult();
		if(result == 1){
			System.out.println("��������ƽ�֣��´��ٺ���һ�ָ��£�");
		}else if(result == 2){
			System.out.println("�������ϲ��ϲ��");   //�û���ʤ
		}else{ 
			System.out.println("������Ǻǣ��������´μ��Ͱ���");   //�������ʤ
		}
		System.out.println("---------------------------------------------------");
	}

	/**
	 * ����ɼ�
	 * @return
	 */
	private static int calcResult() {
		if(personScore == computerScore){
  		  return 1; //ƽ��
	  	}else if(personScore > computerScore){
	  		  return 2; //�û�Ӯ
	  	}else{
	  		  return 3; //�����Ӯ
	  	}   
	}

	/**
	 * ���������ȭ
	 * @return
	 */
	private static int computerShowFist() {
		int show = (int) (Math.random() * 10) % 3 + 1; //�������������ʾ���Գ�ȭ
		switch (show) {
		case 1:
			System.out.println("���Գ�ȭ: ����");
			break;
		case 2:
			System.out.println("���Գ�ȭ: ʯͷ");
			break;
		case 3:
			System.out.println("���Գ�ȭ: ��");
			break;
		}
		return show;
	}

	/**
	 * �û�ѡ���ȭ
	 * @return
	 */
	@SuppressWarnings("resource")
	private static int personShowFist() {
		  Scanner input1 = new Scanner(System.in);
	  	  System.out.print("\n���ȭ:1.���� 2.ʯͷ 3.�� (������Ӧ����) :");
	  	  int show =0;
	  	  while(true){
	  		  try{
	  			show = input1.nextInt();
	  			break;
	  		  }catch (Exception e) {
				// TODO: handle exception
	  			  System.out.println("����ȷ���룡��1 ������ 2 ʯͷ ��3 ����");
	  			  input1.next();
			}
	  		  
	  	  }
	  	  
	  	  
	  	  switch(show){
	  	      case 1: 
	  	    	  System.out.println("���ȭ: ����");
	  	    	  break;
	  	      case 2:
	  	    	  System.out.println("���ȭ: ʯͷ");
	  	    	  break;
	  	      case 3: 
	  	    	  System.out.println("���ȭ: ��");
	  	    	  break;
	  	  } 
	  	  return show;
	}
}
