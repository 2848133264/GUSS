package Test;
import java.util.concurrent.locks.Condition;  
import java.util.concurrent.locks.ReentrantLock;  
/** 
 * �����߳̽����ӡ1-10���� 
 * @author happigfemale 
 * 
 */  
public class ThreadTest {  
    //��������  
    private ReentrantLock lock = new ReentrantLock();  
    //Condition�ź�1  
    private Condition c1 = lock.newCondition();  
    //Condition�ź�2  
    private Condition c2 = lock.newCondition();  
    private int count = 0;  
    public void countMethod(){  
        Thread t1 = new Thread("�߳�һ��"){  
            public void run(){  
                while(count < 100){ 
                    lock.lock();  
                    try {  
                        System.out.println(Thread.currentThread().getName() + ":" +count);  
                        count ++;  
                        c1.await();//c1���߳�1������״̬->�����ȴ�  
                          
                        c2.signal();//c2���߳�2�������ȴ�->����״̬  
                          
                          
                    } catch (InterruptedException e) {  
                        // TODO Auto-generated catch block  
                        e.printStackTrace();  
                    }finally{  
                        lock.unlock();  
                    }  
                }  
            }  
        };  
        Thread t2 = new Thread("�̶߳���"){  
            public void run(){  
                while(count < 100){  
                    lock.lock();  
                    try {  
                        System.out.println(Thread.currentThread().getName() + ":" +count);  
                        count ++;  
                        c1.signal();//c1���߳�1�������ȴ�->����״̬  
                        c2.await();//c2���߳�2������״̬->�����ȴ�  
                    } catch (InterruptedException e) {  
                        // TODO Auto-generated catch block  
                        e.printStackTrace();  
                    }finally{  
                        lock.unlock();  
                    }  
                      
                }  
            }  
        };       
        //�߳�t1����  
        t1.start();  
        while(count == 0){//��֤t1��ִ��  
            ;  
        }  
        //�߳�t2����  
        t2.start();  
          
    }  
    public static void main(String[] args) {  
        new ThreadTest().countMethod();  
    }  
}  