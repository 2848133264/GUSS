package task;


/**
 * 需求：设计一个线程操作类,要求可以产生三个线程对象,并
可以分别设置三个线程的休眠时间,如下所示：
• 线程A,休眠10秒
• 线程B,休眠20秒
• 线程C,休眠30秒
• 问：此类该如何设计？
分析：


程的实现有两种方式,一种是继承Thread类,另外
一种是实现Runnable接口。而且在类中应该存在保
存线程名称和休眠时间的两个属性。
 */

class Method1 extends Thread{
	
	int time = 1000;
	String name = "";
	public Method1(int num,String name) {
		// TODO Auto-generated constructor stub
		time =time * num;
		this.name =name;
	}
	
	//重写Run方法
	public  void  run(){
		try {			
			System.out.println(this.name+"休眠"+time/1000+"秒");
			sleep(time);		
			System.out.println(this.name+"休眠结束");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
//实现 Runnable 接口
class Method2 implements Runnable{
	int time = 1000;

	public Method2(int num) {
		// TODO Auto-generated constructor stub
		time =time * num;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"休眠"+time/1000+"秒");
		try {
			Thread.currentThread().sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		System.out.println(Thread.currentThread().getName()+"休眠结束");
	}
	
}

public class task01 {
  
	public static void main(String[] args) {
		
		Method1 m =new Method1(10,"Method1线程一：");
		Method1 m1 =new Method1(20,"Method1线程二：");
		Method1 m2 =new Method1(30,"Method1线程三：");		
		m.start();
		m1.start();
		m2.start();
		
		//method2;
		Method2 mm1 =new Method2(10);
		Thread mm11 =new Thread(mm1,"Method2线程一：");
		mm11.start();//开启线程
		
		Method2 mm2 =new Method2(20);
		Thread mm22 =new Thread(mm2,"Method2线程二：");
		mm22.start();//开启线程
		
		Method2 mm3 =new Method2(20);
		Thread mm33 =new Thread(mm3,"Method2线程三：");
		mm33.start();//开启线程
		
		
	}
}
