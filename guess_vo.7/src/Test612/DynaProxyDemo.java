package Test612;

import java.lang.reflect.Proxy;

public class DynaProxyDemo {
	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject();
		// 实例化代理操作类
		MyInvocationHandler handler = new MyInvocationHandler(realSubject);
		// 绑定对象
		Subject sub = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(),
				realSubject.getClass().getInterfaces(), handler);
		String info = sub.say("张无忌", 30);// 通过动态代理调用方法
		System.out.println(info); // 信息输出
	}
}