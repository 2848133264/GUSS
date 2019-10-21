package task_6_6;

public class person {
	private String name;
	
	private String attendance ="0";//默认是0 ，未考情，1 为考情

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
