package task;

import java.util.Arrays;
import java.util.List;

enum Week {
	Sun, Mon, Tue, Wed, Thu, Fri, Sat;
	
	public void show(){
		System.out.println("����ö��  ������ö�ٿ����з�����");
	}
}

public class Test2 {
	public static void main(String[] args) {
		// ���칤����
		Week[] workDays = { Week.Mon, Week.Tue, Week.Wed, Week.Thu, Week.Fri };
		// ת��Ϊ�б�
		List<Week> list = Arrays.asList(workDays);//û��    
		// ��������ҲΪ������
		//list.add(Week.Sat);		
		list.add(Week.Sat);
		for(Week i:list){
			System.out.println(i);
		}	
	}
	/*
	 * ö�ٵ�ʹ��
           �����Exception in thread "main" java.lang.UnsupportedOperationException
	   ��֧�ֲ����쳣��
	   ���벻��������ʱ����
	   
	   ԭ���ǣ�����ת�� ���� asList��ת�ɵļ���ֻ�ܶ�����д��
	 * 
	 */
	
	
	
}