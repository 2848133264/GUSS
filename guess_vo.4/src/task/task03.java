package task;

import java.text.SimpleDateFormat;
import java.util.Calendar;

//接口 MyDateTime
interface MyDateTime{
	
	//获取日期的字符串
	public String getDate();
	
	//取得日期时间的字符串
	public String getDateTime();
	
}

public class task03 implements MyDateTime{

	@Override
	public String getDate() {
		// TODO Auto-generated method stub
		//基于 Calendar 类的实现
		
		//获得日历的实例
		Calendar calendar =Calendar.getInstance();
	    int year = calendar.get(Calendar.YEAR);
	    int month =(calendar.get(Calendar.MONTH))+1;
	    int day =calendar.get(Calendar.DATE);
		return "日历方式获取 ---> 当前时间为："+year+" - " +month+" - " + day;
	}

	@Override
	public String getDateTime() {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf  = new SimpleDateFormat("YYYY-MM-dd  hh:mm:ss");
			
		return "格式化时间方法获取 ---> 当前的时间为："+sdf.format(System.currentTimeMillis());
	}
	
	//测试
	public static void main(String[] args) {
		task03 t = new task03();
		
		System.out.println(t.getDate());
		
		System.out.println(t.getDateTime());
	}

}
