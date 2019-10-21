package task;

/**
 某公司组织年会,会议入场时有两个入口,在入场时每位员工都能获取一张
双色球彩票(彩票号码通过Random类随机生成),假设公司有100个员工,
利用多线程模拟年会入场过程,
• 并分别统计每个入口入场的人数,以及每个员工拿到的彩票的号码。线程
运行后打印格式如下：
• 编号为: 2 的员工 从后门 入场! 拿到的双色球彩票号码是: [17, 24, 29,
30, 31, 32, 07]
• 编号为: 1 的员工 从后门 入场! 拿到的双色球彩票号码是: [06, 11, 14,
22, 29, 32, 15]
• //.....
• 从后门入场的员工总共: 13 位员工
• 从前门入场的员工总共: 87 位员工
 * @author Administrator
 *
 */

public class task03 {

	
	public static void main(String[] args) throws InterruptedException {
		
		Mythread my =new Mythread();
		Thread thread1 =new Thread(my,"前门");
		Thread thread2 = new Thread(my,"后门");
		thread1.start();
		thread2.start();
		
		while(true){
			if(!thread1.isAlive() && !thread2.isAlive()){
				System.out.println("前门进入人数："+my.frontcount+"\n后门进入人数："+my.backcount);
				break;
			}
			Thread.sleep(100);
		}
		
		
	}
}
class Mythread implements Runnable{

	int count =100 ;//人数
	int frontcount = 0;//前门
	int backcount =0;//后门
	
	int []ticket = new int [14];

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			synchronized (Mythread.class) {
				if (count > 0) {
					for (int i = 0; i < 14; i++) {
						ticket[i] = (int) (Math.random() * 10);
					}

					String threadName = Thread.currentThread().getName();
					System.out.print(threadName + "进入人员" + count-- + "拿到的彩票是[");

					// 打印彩票
					for (int i = 0; i < 14; i++) {
						if (i == 13)
							System.out.print(ticket[i]);
						else {
							System.out.print(ticket[i]);
							if ((i & 1) == 1)
								System.out.print(",");//为了分成 2位数的
						}
					}
					
					System.out.print("]\n");
					//统计人数；
					if (threadName.equals("前门"))
						frontcount++;
					else
						backcount++;
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else
					break;
			}

		}
	}
			
}	

