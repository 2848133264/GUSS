package collocations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 将两个集合{“a”，“b”，“c”，“d”，“e”}
 
• 和{“d”，“e”，“f”，“g”，“h”},
把这两个集合去除重复项合并成一个,实现需求


• 扩展:通过随机生成1000个随机组合的2-8个字母,
然后通过集合快速找到重复超过3次以上的字母组
合,并放在新集合中输出。


 * @author Administrator
 *
 */



public class task02 {
	
	public static List bingji(List list ,List list2 ){
	    //4.无重复的并集(两个集合合并后没有重复元素)
	    list.removeAll(list2);//删除在list中的list2 元素。
		list2.addAll(list);	
		return list2;	
    }
	
	public static void main(String[] args) {
		/*
		 *  将两个集合{“a”，“b”，“c”，“d”，“e”} 和{“d”，“e”，“f”，“g”，“h”},
		 */
		List<String> list =new ArrayList();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		List<String> list2 =new ArrayList();
		
		list2.add("d");
		list2.add("e");
		list2.add("f");
		list2.add("g");
		list2.add("h");
		
		List<String> list3 =task02.bingji(list, list2);
		for (String string : list3) {
			System.out.print(string+"  ");
		}
		}

}
