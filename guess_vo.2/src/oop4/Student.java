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
		return super.getName()+" ͬѧ ���� "+super.getAge() +"�� ����"+this.school+"�Ͷ�";
	}
	
	public static void main(String[] args) {
		Student st = new Student();
		st.setAge(20);
		st.setName("java");
		st.setSchool("����ũҵ��ѧ");
		System.out.println(st.toString());
	}


	
}
