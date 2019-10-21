package Test612;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {
	private Object obj; // 真实主题

	public MyInvocationHandler(Object obj) {
		this.obj = obj;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable { // 动态调用方法
		// 调用方法,传入真实主题和参数
		Object temp = method.invoke(this.obj, args);
		return temp; // 返回方法的返回信息
	}
}