package task01;

import java.util.Scanner;

public class task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		System.out.println("���������䣬��ѯ�����䴦���ĸ��׶Σ���");
		int age =input.nextInt();
		String result=ageCheck(age);
		System.out.println(result);
	}
	 public static String ageCheck(int age,String result) {
	    	/**
				0-9 ��ͯ
				10-19 ����
				20-29 ������
				30-39 ����
				40-49 ׳��
				50-59 ����
				60-69 ������
				70-79 ����
				80-89 ������
				90-99 ��������
	    	 */
	    	Scanner input =new Scanner(System.in);
			result ="";
	    	if(age >=0 &&age <=9){
	    		result = age+"�괦�ڶ�ͯ�׶�";
	    	}else if(age >=10 && age <=19){
	    		result = age+"�괦������׶�";
	    	}else if(age >=20 && age <=29){
	    		result = age+"�괦��������׶�";
	    	}else if(age >=30 &&age <=39){
	    		result = age+"�괦������׶�";
	    	}else if(age >=40 &&age <=49){
	    		result = age+"�괦��׳��׶�";
	    	}else if(age >=50 &&age <=59){
	    		result = age+"�괦������׶�";
	    	}else if(age >=60 &&age <=69) {
	    		result = age+"�괦��������׶�";
			}else if(age >=70 &&age <=79) {
				result = age+"�괦������׶�";
			}else if(age >=80 &&age <=89) {
				result = age+"�괦��������׶�";
			}else if(age >=90 &&age <=99) {
				result = age+"�괦����������׶�";
			}else{
				System.out.println("�����д�!");
			}
			return result;
			
		}
	 public static String ageCheck(int age){
	    	
			int agenum =(int)age/10;
	    	switch (agenum) {
			case 0:System.out.println(age+"�괦�ڶ�ͯ�׶�");break;
			case 1:System.out.println(age+"�괦������׶�");break;
			case 2:System.out.println(age+"�괦��������׶�");break;
			case 3:System.out.println(age+"�괦������׶�");break;
			case 4:System.out.println(age+"�괦��׳��׶�");break;
			case 5:System.out.println(age+"�괦������׶�");break;
			case 6:System.out.println(age+"�괦��������׶�");break;
			case 7:System.out.println(age+"�괦������׶�");break;
			case 8:System.out.println(age+"�괦��������׶�");break;
			case 9:System.out.println(age+"�괦����������׶�");break;
			default:
				break;
			}
			return "";
	    }
	 public static void ageCheck(double age){
		  String [] ageName={"��ͯ","����","������","����","׳��","����","������","����","������","��������"};
			if(age < 0 && age>99){
				System.out.println("���������淶��");
			}
			int reage =(int)age/10;
			System.out.println(" "+age+ageName[reage]);
	    }
}
