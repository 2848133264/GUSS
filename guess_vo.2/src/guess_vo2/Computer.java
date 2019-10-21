package guess_vo2;

public class Computer {
	
	String name ="电脑";
	int score = 0;
	
	public int punches(){
	   
		int num =0;
		num = (int)((Math.random()*10)%3 +1);
		if(num ==1){
			System.out.println("电脑出拳：剪刀");
		}else if(num ==2){
			System.out.println("电脑出拳：石头");
		}else if(num == 3){
			System.out.println("电脑出拳：布");
		}
		return num;
	}

}
