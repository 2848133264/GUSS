package Test612;

import java.lang.reflect.Proxy;

public class DynaProxyDemo {
	public static void main(String[] args) {
		RealSubject realSubject = new RealSubject();
		// ʵ�������������
		MyInvocationHandler handler = new MyInvocationHandler(realSubject);
		// �󶨶���
		Subject sub = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(),
				realSubject.getClass().getInterfaces(), handler);
		String info = sub.say("���޼�", 30);// ͨ����̬������÷���
		System.out.println(info); // ��Ϣ���
	}
}