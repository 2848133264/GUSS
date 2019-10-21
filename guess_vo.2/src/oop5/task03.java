package oop5;

public class task03 {

	/**
	某公司正进行招聘工作，被招聘人员需要填写个人信息，编写“个人简历”的封装类。
	包括如下属性和对属性进行操作的方法。
	
	编写格式显示简历信息方法
	请考虑其扩展性,如用简单文本输出,表格方式输出和 Web简历等形式,你将会怎么设计？
	 * @param args
	 */
	//个人简历  
	String xm;// 姓名
	String xb;// 性别
	int nl;// 年龄
	String jtzz;// 家庭住址
	String xl;// 学历
	@Override
	public String toString() {
		return "task03 [xm=" + xm + ", xb=" + xb + ", nl=" + nl + ", jtzz=" + jtzz + ", xl=" + xl + "]";
	}
  
	
}
