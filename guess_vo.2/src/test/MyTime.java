package test;

public class MyTime {
	
	int hour;
	int minute;
	int second;
	
	int flag = 0;
	public MyTime(int hour,int minute,int second) {
		// TODO Auto-generated constructor stub
		this.hour = hour;
		this.minute =minute;
		this.second =second;
	}
	public void display(){
		if(flag == 0){
		System.out.println(hour+":"+minute+":"+second);
		}
		else{
			 System.out.println("�ڶ��� "+this.hour+":"+this.minute+" : "+this.second);
		}
	}
	public void addSecond(int sec){
		/*
		 * MyTime mytime =new MyTime(15, 26, 56);20
		 */
		//�жϴ�ʱ��sec �Ƿ���60�������, 60s +60s = 2����	
		if(sec >60 || sec < 0){
			System.out.println("�������д�");
		}else{
		   int min = (this.second+sec)/60;		  
		   if(min < 0){
			   //û�г���һ����
			   this.second =this.second +sec;
		   }else{//����һ����
			   this.second = (this.second +sec)-60;//ȷ����������
			   int addmin = (min +this.minute) /60;
			   if(addmin <= 0){//û�г���60���ӵ�
				   this.minute =this.minute +min;
			   }else{//������60���ӵ�
				   this.minute =(this.minute +addmin) - 60;			   
				   int addhour = (addmin +this.hour)/24;
				   if(addhour <= 0){//û�г���24Сʱ
					   this.hour = this.hour +addmin;
				   } else{//����24Сʱ��
					   this.hour =(this.hour +addhour) - 24;
					   flag =1;		  
				   }
			   }
		   }
		}
		
	}
	public void addMinute(int min){
		
		this.minute +=min;
		if(this.minute > 60){
			int addmin =this.minute /60; //��λ
			this.hour +=addmin;//Сʱ
			if(this.hour >24){
				this.hour = this.hour%24;
			}
			this.minute = this.minute%60;			
		}
	}
	public void addHour(int hou){
		this.hour+=hou;
		if(this.hour > 24){
			this.hour = this.hour%24;
		}
   }
	public void subSecond(int sec) {
		//MyTime mytime =new MyTime(15, 26, 56); -60
		this.second =this.second - sec;
		while(this.second < 0){
			this.minute -=1;
			this.second =this.second+60;
		}
		while(this.minute < 0){
			this.minute +=60;
			this.hour --;
		}
				
	}
	public void subMinute(int min) {		
		this.minute -=min;
		while(this.minute < 0){
			this.minute+=60;
			this.hour--;
			if(this.hour <0){
				System.out.println("���ܽ��н��в���");
				break;
			}
		}
			
	}
	public void subHour(int hou) {	 
		this.hour-=hou;		
     }
}
