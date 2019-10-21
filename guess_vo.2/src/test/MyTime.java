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
			 System.out.println("第二天 "+this.hour+":"+this.minute+" : "+this.second);
		}
	}
	public void addSecond(int sec){
		/*
		 * MyTime mytime =new MyTime(15, 26, 56);20
		 */
		//判断此时的sec 是否是60秒的数据, 60s +60s = 2分钟	
		if(sec >60 || sec < 0){
			System.out.println("传参数有错！");
		}else{
		   int min = (this.second+sec)/60;		  
		   if(min < 0){
			   //没有超过一分钟
			   this.second =this.second +sec;
		   }else{//超过一分钟
			   this.second = (this.second +sec)-60;//确定好秒数了
			   int addmin = (min +this.minute) /60;
			   if(addmin <= 0){//没有超过60分钟的
				   this.minute =this.minute +min;
			   }else{//超过了60分钟的
				   this.minute =(this.minute +addmin) - 60;			   
				   int addhour = (addmin +this.hour)/24;
				   if(addhour <= 0){//没有超过24小时
					   this.hour = this.hour +addmin;
				   } else{//超过24小时的
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
			int addmin =this.minute /60; //进位
			this.hour +=addmin;//小时
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
				System.out.println("不能进行进行操作");
				break;
			}
		}
			
	}
	public void subHour(int hou) {	 
		this.hour-=hou;		
     }
}
