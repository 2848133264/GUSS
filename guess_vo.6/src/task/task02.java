package task;
import java.util.concurrent.locks.Condition;  
import java.util.concurrent.locks.ReentrantLock;  
/** 
 * 两个线程交替打印1-1000数字 

 */  
public class task02 {  
    //可重入锁  
    private ReentrantLock lock = new ReentrantLock();  
    //Condition信号1  
    private Condition c1 = lock.newCondition();  
    //Condition信号2  
    private Condition c2 = lock.newCondition();  
    private int count = 0;  
    public void countMethod(){  
        Thread t1 = new Thread("线程一："){  
            public void run(){  
                while(count < 1000){ 
                    lock.lock();  
                    try {  
                        System.out.println(Thread.currentThread().getName() + ":" +count);  
                        count ++;  
                        c1.await();//c1将线程1从运行状态->阻塞等待  
                          
                        c2.signal();//c2将线程2从阻塞等待->唤醒状态  
                          
                          
                    } catch (InterruptedException e) {  
                        // TODO Auto-generated catch block  
                        e.printStackTrace();  
                    }finally{  
                        lock.unlock();  
                    }  
                }  
            }  
        };  
        Thread t2 = new Thread("线程二："){  
            public void run(){  
                while(count < 1000){  
                    lock.lock();  
                    try {  
                        System.out.println(Thread.currentThread().getName() + ":" +count);  
                        count ++;  
                        c1.signal();//c1将线程1从阻塞等待->唤醒状态  
                        c2.await();//c2将线程2从运行状态->阻塞等待  
                    } catch (InterruptedException e) {  
                        // TODO Auto-generated catch block  
                        e.printStackTrace();  
                    }finally{  
                        lock.unlock();  
                    }  
                      
                }  
            }  
        };       
        //线程t1启动  
        t1.start();  
        while(count == 0){//保证t1先执行  
            ;  
        }  
        //线程t2启动  
        t2.start();  
          
    }  
    public static void main(String[] args) {  
        new task02().countMethod();  
    }  
}  