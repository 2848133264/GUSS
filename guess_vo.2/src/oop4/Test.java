package oop4;

public class Test {
	/**
	 * 作业练习2
	 * 
	 *实现使用static为对象,进行自动的命名操作，例如
	 *类名叫Test,创建的对象命名规则为test1，test2... 依次类推
	 */
	/**
1：从前面的讲解可以知道static属性是所有对象共享的，那么就可以使用static属性统计一个类到底产生了多少个实例化对象。
2：可以使用static为对象进行自动的命名操作，此操作与上面代码类似。
	 * 
	 */
    private	static int count =0;
	private String namestring ;
	
	public Test() {
		// TODO Auto-generated constructor stub
		count++;
		this.namestring = "test-"+count;
	}
	public String getName() {
		
		return namestring;
	
	}
	public static void main(String[] args) {
		
		System.out.println(new Test().getName());
		System.out.println(new Test().getName());
		System.out.println(new Test().getName());
	}
}
