package guess_vo2;

public class Computer {
	
	String name ="����";
	int score = 0;
	
	public int punches(){
	   
		int num =0;
		num = (int)((Math.random()*10)%3 +1);
		if(num ==1){
			System.out.println("���Գ�ȭ������");
		}else if(num ==2){
			System.out.println("���Գ�ȭ��ʯͷ");
		}else if(num == 3){
			System.out.println("���Գ�ȭ����");
		}
		return num;
	}

}
