package com.guess;

import java.util.Scanner;

public class Geam {
	public static void main(String[] args) {
		
		/**
		 * ����һ��������Ϸ����
		 * �������ѡ���ɫ
		 * ���������û�����Ա���
		 * �����ģ��þ�����
		 * �����壺�û��˳�֮����ʾ�������
		 */
		int useScore =0,computerScore = 0;
		
//		����һ��������Ϸ����
		System.out.println("*****************************************");
		System.out.println("\t\t************");
		System.out.println("\t\t��ȭ��Ϸ��ʼ");
		System.out.println("\t\t************");
		System.out.println("****************************************");
//		�������ѡ���ɫ
		System.out.print("����������˺ţ�");
		Scanner in= new Scanner(System.in);
		String userName =in.next();//���ܳ��ֿո�
		System.out.println("��ѡ���ս�Ľ�ɫ��1.С��磬2.С��� 3.С����");
		String com=in.next();
		String computer="";
		if(computer.equals("1")){
			computer = "���";
		}else if(computer.equals("2")){
			computer ="С��";
		}else{
			computer = "С��";
		}
		String flag ="y";
//		���������û�����Ա���
		do{
		System.out.println("���"+userName+"���ȭ��1.���� 2.ʯͷ 3.����");
		String cp =in.next();//��ҳ�ȭ
		if(cp.equals("1")){
			System.out.println("��ҡ�"+userName+"����ȭ������");
			
		}
		else if(cp.equals("2")){
			System.out.println("��ҡ�"+userName+"����ȭ��ʯͷ");
			
		}
		else if(cp.equals("3")){
			System.out.println("��ҡ�"+userName+"����ȭ����");
		
		}
		//���Գ�ȭ
		int comp = (int) (Math.random()*10)%3+1;
		if(comp == 1){
			System.out.println("��ս��"+computer+"����ȭ������");
		}
		else if(comp == 2){
			System.out.println("��ս��"+computer+"����ȭ��ʯͷ");
		}
		else if(comp == 3){
			System.out.println("��ս��"+computer+"����ȭ����");
		}
//		�����ģ��þ�����
		//���û��ĳ�ȭ��string����ת��int����
		int usecpparse = Integer.parseInt(cp);
		if(usecpparse == comp ){
			System.out.println("�����ƽ�֣���");
		}
		else if(usecpparse > comp){
			System.out.println("�����"+userName+"Ӯ�ˣ�");
			useScore ++;
		}
		else{
			System.out.println("�����"+computer+"Ӯ�ˣ�");
			computerScore ++;
		}
		System.out.println("�Ƿ������Ϸ��y/n��!");
		flag =in.next();

	}while(flag.equals("y"));
		
//		�����壺�û��˳�֮����ʾ�������
		System.out.println("****************************");
		System.out.println("\t["+userName+"] VS ["+computer+"]");
		System.out.println("\t"+useScore+"   :   "+computerScore);
		String winner = "";
		if(useScore >computerScore){
			winner = userName;
		}else if(useScore  == computerScore){
			winner = "ƽ��";
		}else{
			winner = computer;
		}
		
		System.out.println("\t"+winner+"   ��ʤ��");
		System.out.println("****************************");
  }
}
