package task02;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Test {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		//∑¥…‰
		Class<?> c = Class.forName("task02.Examble");
		Object o = c.getConstructor().newInstance();
		service ss = o.getClass().getAnnotation(service.class);
	    
	    String key =ss.key();
	    String value = ss.value();
	    
	    List<String> list =new ArrayList<>();
		
	    list.add(0,key);
	    list.add(1, value);
	    for (String string : list) {
			System.out.println(string);
		}
	}
	

}