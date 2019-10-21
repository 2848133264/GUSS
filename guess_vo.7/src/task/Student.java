package task;
public class Student{
	
	private String stuName;
	private int stuId;
	
	

	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	@Override
	public String toString() {
		return "Student [stuName=" + stuName + ", stuId=" + stuId + "]";
	}
	
	
}