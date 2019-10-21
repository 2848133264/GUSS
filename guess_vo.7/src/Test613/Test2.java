package Test613;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Test2 {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		
	
		Class<?> c = Class.forName("Test613.example2");
		
		Object obj =c.getConstructor().newInstance();
		Method m = c.getMethod("show", String.class,String.class,String.class);
		
		NotNull n = m.getAnnotation(NotNull.class);
		
		m.invoke(obj, "","nn","");
		
		String orkey = n.order().key();
		String orvalue = n.order().value();
		
		String rekey =n.request().key();
		String revalue= n.request().value();
		
		String name =n.name();
		
		 Parameter[] mm = m.getParameters();
		 
		for (Parameter parameter : mm) {
			System.out.println(parameter);
		}
		 
		//m.invoke(obj, name,orkey+","+orvalue,rekey+","+revalue);
	}

}
