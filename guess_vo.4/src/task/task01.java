package task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * ��дһ�����п����߼������������п���ֻ����12��21��0��9��������ɣ�
		 * ����ֻ����6λ,ÿһλҲ����0-9��������ɣ��κβ������ʻ���������Ҫ����������Ϊ�쳣�����벶�񲢴����쳣
		 */
		String reges = "\\d{12,21}";
		String passreges ="\\d{6}";
		String bankId = "";
		String password ="";
		Scanner input =new Scanner(System.in);
		
		//�����������
		@SuppressWarnings("unchecked")
		List<task01_IDcard> list =new ArrayList();//���ڱ�������
		
		//ѭ������
		while(true){
			System.out.println("���������12 λ �� 21λ���ֵĿ��ţ�");
			bankId = input.next();//�ַ�������ĸ�ʽ��
			System.out.println("�����������λ�����룺");
			password =input.next();
			if(check(bankId,password ,reges,passreges)){				
				task01_IDcard e =new task01_IDcard();
				//��������
				e.setCardId(bankId);
				e.setPassword(password);	
				//��ӽ�ȥ
				list.add(e);				
				System.out.println("��ӳɹ�");
				break;
			}else{
				System.out.println("������������������...");
			}
		}
		//������
		for (task01_IDcard task01_IDcard : list) {
			System.out.println("���ţ�"+task01_IDcard.getCardId()+"  ���룺"+task01_IDcard.getPassword());
		}
	}

	public static boolean check(String str, String password,String reg,String reg_password) {

		boolean resultString = false;
		boolean pass =false;
		boolean resut = false;//Ҫ���ص�ֵ
		// �ж�str �Ƿ�Ϊ��
		if("".equals(str) || str == null ||"".equals(password) || password == null){
		  System.out.println("����Ϊ�գ�");
		}else{
		//���str��Ϊ�գ��������һ�����ж��������쳣��	
			resultString = str.matches(reg);
			pass = password.matches(reg_password);
			if(resultString && pass){ // ǰ����true ���жϺ��� ��������ͬ��ʱ����ж���������
				resut = true;
				System.out.println("�жϵĽ���ǣ�"+resultString);
			}
		}		
		return resut;
	}
}
