package oop2;

public class User {
   
	/*
	 * ����Ź�����
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
	 * ���ںڰ��ϻ�Բ
	 */
	public void paint(Backboard baceboard){
		
	}
	//����������
	public static void main(String[] args) {
		User user =new User("��");
		System.out.print(user.name);
		user.operationClose(new Door());
		
		/*
		 * ���ԣ����ںڰ��ϻ�Բ
		 */
		System.out.print(user.name);
		user.paint(new Backboard("��Բ"));
	}
}
