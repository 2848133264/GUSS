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
		//�����û��͵��Ե�����
		System.out.print("�������û�����");
		user.name = input.next();
		if(user.name.equals("")){
			System.out.println("�����ֵ����Ϊ�գ�����������");
			init();
		}
		System.out.print("��ѡ�����Ķ��֣�1С�� ��   2 С���� 3 СС");
		String name = input.next();
		switch (name) {
		case "1":computer.name = "С�� ";break;
		case "2":computer.name = "С��";break;
		case "3":computer.name = "СС";break;
		default:
			computer.name = "С��";//Ĭ����С��
			break;
		}
	}
	
	/**
	 * ��ʼ��Ϸ
	 */
	public void startGame(){
		System.out.println("\n-----------��ӭ������Ϸ����--------------\n\n");
		System.out.println("\t****************\n");
		System.out.println("\t** ��ȭ����ʼ   **\n");
		System.out.println("\t****************\n");
		init();
		/*
		 * �����󣺲��ü��̼�ʤ��
		 * 
		 * ��ȭ��Ϸ���������
                      ����Ϸ��ʼǰ���û�����������Ϸ����
                      �����ĳһ��ѹ����ʤ������Ϸ��ǰ����
		 */
		System.out.println("������Ҫ�漸�֣�()");
		int  num =input.nextInt();
		int halfNum = ( num / 2)+1;
		System.out.println("num������"+halfNum);
		while(num >0){
			int userPunche = 0;
			int computerPunche =0;
			//�û���ȭ
			userPunche = user.punches();
			//���Գ�ȭ
			computerPunche =computer.punches();
			/*
			 * �������ֱ�ӳ���num�İ���ʱ������ѹ����ʤ����ֱ���˳�������
			 */
			if(userPunche == computerPunche){
				System.out.println("����������ƽ������");
			}else if ((userPunche == 1 && computerPunche == 3) || (userPunche == 2 && computerPunche == 1)
					|| (userPunche == 3 && computerPunche == 2)) {//3��
				System.out.println("��ϲ�� �������Ӯ�ˣ�");
				user.score ++;
			}else{
				System.out.println("�����ˣ�Ҫ�ٽ�����Ŷ��");
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
				System.out.println("�Ƿ���ű�����y/n��");
				String flag = input.next();
				if(!flag.equals("y")){
					break;
				}else{
					System.out.println("������Ҫ�漸�֣�()");
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
	 * ������
	 */
	public void calcResult() {
		if(user.score == computer.score){
			
			System.out.println("���ƽ�֡�\n\n\t"+user.name +"  VS  "+ computer.name+"\n\t  "+user.score +"  :    "+computer.score);
			
		}else if(user.score > computer.score){
			
			System.out.println("������̫ǿ�ˣ���ϲ���ʤ��\n\n\t"+user.name +"  VS  "+ computer.name+"\n\t "+user.score +"  :    "+computer.score);
			
		}else {
		
			System.out.println("������ �汿��\n\n\t"+user.name +"  VS  "+ computer.name+"\n\t "+user.score +"  :    "+computer.score);
		
		}
	}
    /**
     * ��ʾ���
     */
	public void showResult(){
		System.out.println("********************************");
		calcResult();
		System.out.println("********************************");
	}
}
