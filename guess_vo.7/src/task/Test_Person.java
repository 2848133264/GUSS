package task;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test_Person {
	
	
	/**
	 * 
• 在测试类中 通过反射执行可变参数方法
• 传入一个参数 (动态创建数组类型)
• 传入多个参数 (动态创建数组类型)
*/
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		
		String[] t = { "Hello", "word", "java" ,"c++"};// 字符串数	
		int [] num = {12,15};
		Class<?> c =Class.forName("task.Person");
		Object object =c.getConstructor().newInstance();
		Method show = c.getMethod("showmsg", Object[].class);
		
		show.invoke(object, new Object[]{t});
		
		//show.invoke(object, new Object[]{num});//数字为何报错
	
	}


}
