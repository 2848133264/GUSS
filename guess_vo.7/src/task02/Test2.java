package task02;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test2 {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		
	
		Class<?> c = Class.forName("task02.example2");
		
		Object obj =c.getConstructor().newInstance();
		Method m = c.getMethod("show", String.class,String.class,String.class);
		
		order e=  m.getAnnotation(order.class);
		request re = m.getAnnotation(request.class);
		NotNull no =m.getAnnotation(NotNull.class);
	
		String orkey= e.key();
		String orvalue = e.value();
		if(orkey.equals("") || orvalue.equals("")){
			orkey = "java";
			orvalue = "java_value";
		}
		String rekey =re.key();
		String revalue = re.value();
		
		if(rekey.equals("") || revalue.equals("")){
			rekey = "request";
			revalue = "request_value";
		}
		String name= no.name();
		if(name.equals("")){
			name = "СС";
		}
		m.invoke(obj, name,orkey+","+orvalue,rekey+","+revalue);
	}

}
