package Test612;

public class RealSubject implements Subject { // 真实实现类
	public String say(String name, int age) { // 覆写say()方法
		return "姓名：" + name + ",年龄：" + age;
		// 返回信息
	}
}