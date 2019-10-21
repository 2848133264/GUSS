package oop3;

public class Point {

	/**
	 * 定义一个“点”（Point）类用来表示三维空间中的点（有三个坐标）。要求如下：
	1）可以生成具有特定坐标的点对象。
	2）提供可以设置三个坐标的方法。
	3）提供可以计算该“点”距原点距离平方的方法。
	 */
	int x,y,z;
	
	Point(){
		//1）可以生成具有特定坐标的点对象。
		this.x= 1;
		this.y= 1;
		this.z= 1;
	}
	
	public void setthreePoint(int x,int y,int z){
		//2)提供可以设置三个坐标的方法。
		this.x = x;
		this.y = y;
		this.z =z;
	}
	public double distance(){
		//3）提供可以计算该“点”距原点距离平方的方法。
		double  d =0.0;
		d = Math.pow((Math.pow(x, 2)+Math.pow(y, 2)), 2) + Math.pow(z, 2);
		return d;	
	}
	
	//主方法
    public static void main(String[] args) {
		Point point = new Point();
		point.setthreePoint(2, 3, 4);
		System.out.println("该“点”距原点距离平方的值："+point.distance());
	}
}
