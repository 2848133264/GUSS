package task_6_6;

public class person {
	private String name;
	
	private String attendance ="0";//Ĭ����0 ��δ���飬1 Ϊ����

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAttendance() {
		return attendance;
	}

	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}

	public person(String name, String attendance) {
		super();
		this.name = name;
		this.attendance = attendance;
	}

	


}
