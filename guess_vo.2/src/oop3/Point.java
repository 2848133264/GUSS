package oop3;

public class Point {

	/**
	 * ����һ�����㡱��Point����������ʾ��ά�ռ��еĵ㣨���������꣩��Ҫ�����£�
	1���������ɾ����ض�����ĵ����
	2���ṩ����������������ķ�����
	3���ṩ���Լ���á��㡱��ԭ�����ƽ���ķ�����
	 */
	int x,y,z;
	
	Point(){
		//1���������ɾ����ض�����ĵ����
		this.x= 1;
		this.y= 1;
		this.z= 1;
	}
	
	public void setthreePoint(int x,int y,int z){
		//2)�ṩ����������������ķ�����
		this.x = x;
		this.y = y;
		this.z =z;
	}
	public double distance(){
		//3���ṩ���Լ���á��㡱��ԭ�����ƽ���ķ�����
		double  d =0.0;
		d = Math.pow((Math.pow(x, 2)+Math.pow(y, 2)), 2) + Math.pow(z, 2);
		return d;	
	}
	
	//������
    public static void main(String[] args) {
		Point point = new Point();
		point.setthreePoint(2, 3, 4);
		System.out.println("�á��㡱��ԭ�����ƽ����ֵ��"+point.distance());
	}
}
