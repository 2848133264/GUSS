package task;

import java.util.Arrays;
import java.util.List;

enum Week {
	Sun, Mon, Tue, Wed, Thu, Fri, Sat;
	
	public void show(){
		System.out.println("我是枚举  方法，枚举可以有方法！");
	}
}

public class Test2 {
	public static void main(String[] args) {
		// 五天工作制
		Week[] workDays = { Week.Mon, Week.Tue, Week.Wed, Week.Thu, Week.Fri };
		// 转换为列表
		List<Week> list = Arrays.asList(workDays);//没错    
		// 增加周六也为工作日
		//list.add(Week.Sat);		
		list.add(Week.Sat);
		for(Week i:list){
			System.out.println(i);
		}	
	}
	/*
	 * 枚举的使用
           结果：Exception in thread "main" java.lang.UnsupportedOperationException
	   不支持操作异常。
	   编译不报错，运行时出错。
	   
	   原因是：数组转成 集合 asList，转成的集合只能读不能写。
	 * 
	 */
	
	
	
}