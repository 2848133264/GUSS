package collocations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * 
��չ:ͨ���������1000�������ϵ�2-8����ĸ,

Ȼ��ͨ�����Ͽ����ҵ��ظ�����3�����ϵ���ĸ���,

�������¼����������

 * 
 * 
 * @author Administrator
 *
 */
//�������������ʹ��Ĭ�ϵĹ��췽������ʼ����������Ϊ10����ArrayList�е�Ԫ�س���10���Ժ󣬻����·����ڴ�ռ䣬ʹ����Ĵ�С������16
public class extend {

	public static void main(String[] args) {
		
		//ͨ���������1000�������ϵ�2-8����ĸ,
		Map<String, Integer> map = new HashMap<>(1000);
		
		List<String>  list = new ArrayList<>(1000);//�����1000��ʾΪ1000��Ԫ�ء�������1000��Ԫ�ص�ʱ��ͻ���������������	
		List<String>  list2 =new ArrayList<>();//���ڴ�ȡ�ظ�2�ε����ϵ��ַ���
		
		for(int i = 0;i<1000;i++){//1000�����		
			//�������2-8������
			int num = (int) (Math.random()*7)+2;
			
			StringBuffer sBuffer =new StringBuffer();//���ڽ���2-8���ַ���
			
			char c ;	
			for(int j=0;j < num;j++){
				//��ӷ���
				c = (char) (Math.random()*26+97);
				sBuffer.append(c);
			}
			list.add(sBuffer.toString());
		}
		//��¼����ַ����ظ�����
		for(String string:list){
			if (map.get(string) == null) {
				map.put(string, 1);
			}else{
				int i = map.get(string);
				i++;
				map.put(string, i);
			}
		}
		//���������ظ����ַ����ӽ�����
		
		for(String string:map.keySet()){
			if(map.get(string)> 2){
				list2.add(string);
			}
		}
		System.out.print("�ظ��������εģ�");
		for(String string:list2){
			System.out.print("\n"+string+" ");
		}
		System.out.println("\nlistsize:"+list.size());
		System.out.println("listsize:"+list.size());
	}
	
}
