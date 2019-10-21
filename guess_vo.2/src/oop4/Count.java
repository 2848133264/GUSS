package oop4;

public class Count {

	/**
	 * 作业练习1
 	 我们知道static属性是所有对象共享的，那么就可以使用static属性统计一个类到底产生了多少个实例化对象
	 * @param args
	 */
	
	static int countSum = 0;
	
	public Count(){
		++ countSum ;
		System.out.println("实例化了 "+countSum+"  对象");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i =0;i<10;i++){
			new Count();//产生 10 个匿名对象。
		}
	}

}
