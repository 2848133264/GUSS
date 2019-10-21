package task;

import java.text.SimpleDateFormat;
import java.util.Calendar;

//�ӿ� MyDateTime
interface MyDateTime{
	
	//��ȡ���ڵ��ַ���
	public String getDate();
	
	//ȡ������ʱ����ַ���
	public String getDateTime();
	
}

public class task03 implements MyDateTime{

	@Override
	public String getDate() {
		// TODO Auto-generated method stub
		//���� Calendar ���ʵ��
		
		//���������ʵ��
		Calendar calendar =Calendar.getInstance();
	    int year = calendar.get(Calendar.YEAR);
	    int month =(calendar.get(Calendar.MONTH))+1;
	    int day =calendar.get(Calendar.DATE);
		return "������ʽ��ȡ ---> ��ǰʱ��Ϊ��"+year+" - " +month+" - " + day;
	}

	@Override
	public String getDateTime() {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf  = new SimpleDateFormat("YYYY-MM-dd  hh:mm:ss");
			
		return "��ʽ��ʱ�䷽����ȡ ---> ��ǰ��ʱ��Ϊ��"+sdf.format(System.currentTimeMillis());
	}
	
	//����
	public static void main(String[] args) {
		task03 t = new task03();
		
		System.out.println(t.getDate());
		
		System.out.println(t.getDateTime());
	}

}
