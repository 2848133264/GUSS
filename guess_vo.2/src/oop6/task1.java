package oop6;

public class task1 extends qingjia {

	
	public task1(String name,int classNumber,String date,String reason) {
		// TODO Auto-generated constructor stub
	   super.setName(name);
	   super.setClassNumber(classNumber);
	   super.setDate(date);
	   super.setReason(reason);   
	 
	}

	@Override
	public String toString() {
		return "\t\ttask1�����\n [������" + super.getName() + "      �༶��" + super.getClassNumber() + "�� ]\n[���ڣ�" + super.getDate()
				+ "   ���ɣ� " + super.getReason() + "]" ;
	}

	public static void main(String[] args) {
		task1 task1 =new task1("java", 1604,"2019527" , "������ȥ");
		System.out.println(task1.toString());
	}

}

abstract class qingjia{
	
	private String name;
	private int classNumber;
	private String date;
	private String reason;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
}
