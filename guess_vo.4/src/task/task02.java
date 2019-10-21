package task;

public class task02 {
/**
 * 作业练习2
	设计一个计算java方法代码 执行耗时(毫秒)  
	
	和内存消耗(KB)的功能类,在方法执行后能反馈给用户方法耗时和内存消耗的情况
	
 	应用代理设计模式实现.
 	
	给出几个测试应用,观察执行情况
 */
 /**
  * 代理模式：    执行的事务设计成接口
  * 		      真实类实现接口
  * 			代理类同样实现接口：设置私有实例接口，代理的类的方法。
  */
	public static void main(String[] args) {
		//进行测试
		@SuppressWarnings("unused")
		Function function = new real();
		proxy p = new proxy(function);
		//对象声明完成，进行测试用例
		
		//task01
		String string = "";
		Runtime r =Runtime.getRuntime();//运行
		long startTime = p.showTime();//开始时间		
		for(int i = 0;i<5000;i++){
			string+="c";
		}
		new task03();
		//输出时间
		System.out.println("消耗的时间："+(System.nanoTime() - startTime)+"  ns(纳秒）");
		//输出内存消耗
		System.out.println("内存消耗："+p.showMemory(r)+"  byte(字节）");
		
		
		//task02
		long sum = 0;
		Runtime r1 =Runtime.getRuntime();//运行
		long startTime2  = p.showTime();//开始时间
		for(long i = 0;i< 10000000;i++){// 一千万
			sum +=i;
		}
		//输出时间
		System.out.println("消耗的时间："+(System.nanoTime() - startTime2)+"  ns(纳秒）");
		//输出内存消耗
		System.out.println("内存消耗："+p.showMemory(r1)+"  byte(字节）");
	}
}



interface Function{
	//提供连个方法，执行耗时和实现内存的消耗
	long showTime();
	long showMemory(Runtime r);
}

class real implements Function{

	@Override
	public long showTime() {
		// TODO Auto-generated method stub
		//要有开始时间，和结束时间，这个应该不能写在同一个方法里
		long  startTime = System.nanoTime();		
		return startTime;
	}

	@Override
	public long showMemory(Runtime r) {
		// TODO Auto-generated method stub
		//采取外部传过来的值进行计算
		r = Runtime.getRuntime();
		//总的内存
		long rmax = r.maxMemory();
		//空闲内存
		long rfree = r.freeMemory();
		//消耗的内存 = 总的内存 - 空闲的内存。
		long resumeMemory = rmax - rfree ;	
		//将resumeMemory 返回出去
		return resumeMemory;
	}
	
}
// 代理类
class proxy implements Function{

	private Function function;
	
	public proxy(Function function){
		this.function  = function;
	}
	
	@Override
	public long showTime() {
		// TODO Auto-generated method stub		
		return this.function.showTime();
	}

	@Override
	public long showMemory(Runtime r) {
		// TODO Auto-generated method stub
		return this.function.showMemory(r);
	}
	
}



