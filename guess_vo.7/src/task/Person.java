package task;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements PersonProxy{

	/**
	 *
	• 在Person类中定义一个可变参数方法(通过循环打印输出传入的参数)
    • 需要将传入的参数通过反射创建数组对象传入该方法执行。
	 * @return 
    
	 */
	private String name;
	
	public String getName() {
		return name;
	}
	
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		SimpleDateFormat sFormat =new SimpleDateFormat("yyyy-MM-dd hh : MM :ss");
		
		this.name = sFormat.format(new Date().getTime())+";方法名称：setName;"+"参数："+name;
	}

	//可变参数方法
	public  void showmsg(Object ...objects){
		
		for (Object obj : objects) {
			System.out.print(obj+" ");
		}
	}

}
