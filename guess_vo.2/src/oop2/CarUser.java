package oop2;

import oop.Car;

public class CarUser {
	
	private String carerName = "";
	
	public String getCarerName() {
		return carerName;
	}

	public void setCarerName(String carerName) {
		this.carerName = carerName;
	}

	public void operationCar(Car car){
		car.brake();
	}
 
	public static void main(String[] args) {
		CarUser carUser =new CarUser();
		carUser.setCarerName("列车司机");
		System.out.print(carUser.getCarerName());
		carUser.operationCar(new Car());
	}
}
