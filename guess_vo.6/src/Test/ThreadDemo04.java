package Test;
class Ticket extends Thread{ // 继承Thread类
private int ticket = 5 ; // 一共5张票
public void run(){ // 重写run()方法
for(int i=0;i<100;i++){ // 超出票数的循环
if(ticket>0){ // 判断是否有剩余票
System.out.println("卖票：ticket =" +ticket--);
}
}
}
};
public class ThreadDemo04 {
public static void main(String args[]) {
Ticket mt1 = new Ticket() ; // 定义线程对象
Ticket mt2 = new Ticket() ; // 定义线程对象
Ticket mt3 = new Ticket() ; // 定义线程对象
mt1.start() ; // 启动第一个线程
mt2.start() ; // 启动第二个线程
mt3.start() ; // 启动第三个线程
}
};