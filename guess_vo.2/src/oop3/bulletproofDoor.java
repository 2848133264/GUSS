package oop3;

public class bulletproofDoor extends Door {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bulletproofDoor door =new bulletproofDoor();
       door.openDoor();     
       door.bulletproof();
       door.theftproof();
       door.waterproof();
       door.closeDoor();
		
	}

	@Override
	public void theftproof() {
		// TODO Auto-generated method stub
		//System.out.println("防盗功能");
	}

	@Override
	public void waterproof() {
		// TODO Auto-generated method stub
		//System.out.println("  防水功能");
	}

	@Override
	public void bulletproof() {
		// TODO Auto-generated method stub
		System.out.println("  防弹功能");
	}

}
