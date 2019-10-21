package oop3;

public class TestTriAngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 另一个类中使用这些公共方法，计算三角形的面积
		 */
		TriAngle triAngle =new TriAngle();
		triAngle.setBase(4);
		triAngle.setHeight(5);
		double s =0.0;
		s = triAngle.getBase() * triAngle.getHeight() * 0.5;
		System.out.println("底边长为："+triAngle.getBase()+"\t高为："+triAngle.getHeight()+"\n三角形面积为："+s);
	}
}
