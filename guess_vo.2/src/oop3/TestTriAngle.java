package oop3;

public class TestTriAngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * ��һ������ʹ����Щ�������������������ε����
		 */
		TriAngle triAngle =new TriAngle();
		triAngle.setBase(4);
		triAngle.setHeight(5);
		double s =0.0;
		s = triAngle.getBase() * triAngle.getHeight() * 0.5;
		System.out.println("�ױ߳�Ϊ��"+triAngle.getBase()+"\t��Ϊ��"+triAngle.getHeight()+"\n���������Ϊ��"+s);
	}
}
