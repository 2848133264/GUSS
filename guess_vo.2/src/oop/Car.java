package oop;

public class Car {
	
	private String carName ;
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public void start(){
		System.out.println(this.carName);
	}
    public void brake(){
    	System.out.println("½ô¼±É²³µ");
    }
}
