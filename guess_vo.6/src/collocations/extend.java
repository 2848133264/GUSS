package collocations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * 
扩展:通过随机生成1000个随机组合的2-8个字母,

然后通过集合快速找到重复超过3次以上的字母组合,

并放在新集合中输出。

 * 
 * 
 * @author Administrator
 *
 */
//如果像上面这样使用默认的构造方法，初始容量被设置为10。当ArrayList中的元素超过10个以后，会重新分配内存空间，使数组的大小增长到16
public class extend {

	public static void main(String[] args) {
		
		//通过随机生成1000个随机组合的2-8个字母,
		Map<String, Integer> map = new HashMap<>(1000);
		
		List<String>  list = new ArrayList<>(1000);//这里的1000表示为1000个元素。当超过1000个元素的时候就会重新扩大容量。	
		List<String>  list2 =new ArrayList<>();//用于存取重复2次的以上的字符串
		
		for(int i = 0;i<1000;i++){//1000个随机		
			//产生随机2-8的数字
			int num = (int) (Math.random()*7)+2;
			
			StringBuffer sBuffer =new StringBuffer();//用于接收2-8个字符。
			
			char c ;	
			for(int j=0;j < num;j++){
				//添加符串
				c = (char) (Math.random()*26+97);
				sBuffer.append(c);
			}
			list.add(sBuffer.toString());
		}
		//记录随机字符串重复次数
		for(String string:list){
			if (map.get(string) == null) {
				map.put(string, 1);
			}else{
				int i = map.get(string);
				i++;
				map.put(string, i);
			}
		}
		//超过两次重复的字符串加进另集合
		
		for(String string:map.keySet()){
			if(map.get(string)> 2){
				list2.add(string);
			}
		}
		System.out.print("重复出现三次的：");
		for(String string:list2){
			System.out.print("\n"+string+" ");
		}
		System.out.println("\nlistsize:"+list.size());
		System.out.println("listsize:"+list.size());
	}
	
}
