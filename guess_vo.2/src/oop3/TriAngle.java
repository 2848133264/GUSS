package oop3;

public class TriAngle {
	
	/**
	 * 编写两个类，TriAngle和TestTriAngle，其中TriAngle中声明私有的底边长base和高height，同时声明公共方法访问私有变量；
	 * 
	 * 另一个类中使用这些公共方法，计算三角形的面积。
	 */
	/*
	 * 其中TriAngle中声明私有的底边长base和高height，同 时声明公共方法访问私有变量；。
	 */

	private int base;//底边长
	private int height;//高
	
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	
}
