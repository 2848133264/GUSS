package oop2;

public class User {
   
	/*
	 * 你把门关上了
	 */
	String name ;
	public User(String username) {
		// TODO Auto-generated constructor stub
		this.name = username;
	}
	public void operationClose(Door door){
		door.Close();
		
	}
	public void operationOpen(Door door){
		door.Open();
	}
	/*
	 * 人在黑板上画圆
	 */
	public void paint(Backboard baceboard){
		
	}
	//测试主方法
	public static void main(String[] args) {
		User user =new User("你");
		System.out.print(user.name);
		user.operationClose(new Door());
		
		/*
		 * 测试：人在黑板上画圆
		 */
		System.out.print(user.name);
		user.paint(new Backboard("画圆"));
	}
}
