package oop;

public class User {
	
	
	private String username;
	public User(String username){
		this.username= username;
	}
	public void drive(Car car,String place){	
		System.out.println(this.username+"开着"+car.getCarName()+"去"+place);

	}
	
	public static void main(String[] args) {
		User user =new User("我");
		Car car =new Car();
		car.setCarName("法拉利");
		user.drive(car, "厦门");
	}
}
