package collocations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task03 {

	/**
	 * 
ʹ��List���ϴ洢10��1-50(��50)�����ż��Ԫ��,
Ҫ�����ֲ����ظ�,
�����ɺ�Ӵ�С���������
��������̨��ʹ��IO���������е�Ԫ�ذ�ָ����ʽ
�������ǰ��Ŀ��num.txt��,����:
48,44,40,38,34,30,26......


	 * @param args
	 */
	public static List<Integer> show() {
		
		List<Integer> list =new ArrayList<>();
		int count =10;
		while(count > 0){		
			int num = (int) (Math.random() * 25 + 1)*2;
			if(list.contains(num)){
			}else{
				count--;
				list.add(num);
			}		
		}
		return list;
		
	}

	public static void main(String[] args) {
		
		List<Integer> list =task03.show();
	    Collections.sort(list);
	    String data ="";
	    //����̨���
	    for (int i= 9;i>= 0;i--) {
			System.out.print(list.get(i)+ ",");
			data +=list.get(i)+",";
		}
	    //���ݱ���
	    writer.save(data);
		
	}
}
