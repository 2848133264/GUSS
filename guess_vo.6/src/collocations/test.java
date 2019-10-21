package collocations;


import java.util.ArrayList;
import java.util.List;

/**
 完成多个List集合的以下运算
 
• 1.并集(多个集合合并)
• 2.交集(两个集合共同的元素)
• 3.差集(属于集合1但不属于集合2的元素形成的集合)
• 4.无重复的并集(两个集合合并后没有重复元素)

 * @author Administrator
 *
 */

public class test {

	
	
	public static List bingji(List list ,List list2 ){
	    //4.无重复的并集(两个集合合并后没有重复元素)
	    list.removeAll(list2);//删除在list中的list2 元素。
		list2.addAll(list);	
		return list2;	
    }
	
	@SuppressWarnings("unchecked")//差集
	public static List chaji(List list ,List list2 ){
		
		list.removeAll(list2);
	   if (list.size() == 0) {
		System.out.println("为空！");
	   }
		return list;
		
	}
	
	@SuppressWarnings("unchecked")//交集
	public static List jiaoji(List list ,List list2 ){		
		list.retainAll(list2);	
		return list;	
	}
	
	@SuppressWarnings("unchecked")//并集
	public static List bingji4(List list ,List list2 ){	
			list2.addAll(list);	
			return list2;	
	}
	
	
	//测试
	public static void main(String[] args) {
		
		List list =new ArrayList<>();//作为返回的List集合
		list.add(16);
		list.add(15);
		list.add(1);
		list.add(5);
		
		List list2 =new ArrayList<>();//作为返回的List集合
		 
		list2.add(16);
		list2.add(15);
		list2.add(1);
		list2.add(5);
		
		list2.add(6);
		
		
		//List  list3 = test.bingji(list, list2);
		//List  list4 = test.jiaoji(list, list2);
		//List  list4 = test.bingji4(list, list2);
		List  list4 = test.chaji(list, list2);
		for(int i = 0 ; i< list4.size() ; i++ ){		
			System.out.print(list4.get(i)+",");
			
		}
	}
	
}


