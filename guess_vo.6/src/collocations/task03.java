package collocations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class task03 {

	/**
	 * 
使用List集合存储10个1-50(含50)的随机偶数元素,
要求数字不能重复,
添加完成后从大到小倒序遍历输
出到控制台并使用IO流将集合中的元素按指定格式
输出到当前项目的num.txt中,例如:
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
	    //控制台输出
	    for (int i= 9;i>= 0;i--) {
			System.out.print(list.get(i)+ ",");
			data +=list.get(i)+",";
		}
	    //数据保存
	    writer.save(data);
		
	}
}
