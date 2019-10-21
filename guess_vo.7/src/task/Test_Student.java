package task;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test_Student {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {
		
		
		//≤‚ ‘student
		
		Class<?> c = Class.forName("task.Student");

		Object object =c.getConstructor().newInstance();
		
//		Field name = c.getDeclaredField("stuName");
//		name.setAccessible(true);
//		name.set(object, "sdfafa");
		
		Method setName =c.getMethod("setStuName", String.class);
		
		setName.invoke(object, "’≈»˝");
		
		Method setid =c.getMethod("setStuId", int.class);
		
		setid.invoke(object, 0007);
		
		Method getName =c.getMethod("getStuName");
		Method getId =c.getMethod("getStuId");
		
		System.out.println("name:"+getName.invoke(object)+" id: "+getId.invoke(object));
	}

}
