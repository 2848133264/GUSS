package oop4;

public class Student extends Person{

	private String  school;
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getName()+" 同学 今年 "+super.getAge() +"岁 ，在"+this.school+"就读";
	}
	
	public static void main(String[] args) {
		Student st = new Student();
		st.setAge(20);
		st.setName("java");
		st.setSchool("江西农业大学");
		System.out.println(st.toString());
	}


	
}
