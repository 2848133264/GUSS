package oop;

public class User {
	
	
	private String username;
	public User(String username){
		this.username= username;
	}
	public void drive(Car car,String place){	
		System.out.println(this.username+"����"+car.getCarName()+"ȥ"+place);

	}
	
	public static void main(String[] args) {
		User user =new User("��");
		Car car =new Car();
		car.setCarName("������");
		user.drive(car, "����");
	}
}
