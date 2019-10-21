package task;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

	private Object obj;
	public MyInvocationHandler(Object obj) {
		// TODO Auto-generated constructor stub
		this.obj = obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		Object temp = method.invoke(this.obj, args);
		return temp;
	}

}
