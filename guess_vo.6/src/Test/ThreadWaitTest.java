package Test;
public class ThreadWaitTest {  
  
    public static class StarterThread implements Runnable {  
        private Object lock = null;  
  
        public StarterThread(Object lock) {  
            this.lock = lock;  
        }  
  
        public void run() {  
            System.out.println("start..");  
            /*for(int i =0; i<50; i++){ 
                System.out.println("start:"+i); 
            }*/  
            synchronized (lock) {  
                try {  
                    for (int i = 0; i < 50; i++) {  
                        System.out.println("start:" + i);  
                        lock.notifyAll();  
                        lock.wait();  
                    }  
                } catch (InterruptedException e) {  
                    e.printStackTrace();  
                }  
            }  
              
        }  
    }  
  
    public static class EnderThread implements Runnable {  
        private Object lock = null;  
  
        public EnderThread(Object lock) {  
            this.lock = lock;  
        }  
  
        public void run() {  
            System.out.println("end..");  
            /*for(int i =0; i<50; i++){ 
                System.out.println("end:"+i); 
            }*/  
            synchronized (lock) {  
                for (int i = 0; i < 50; i++) {  
                    System.out.println("end:" + i);  
                    lock.notifyAll();  
                    try {  
                        lock.wait();  
                    } catch (InterruptedException e) {  
                        e.printStackTrace();  
                    }  
                }  
            }  
        }  
    }  
  
    public static void main(String[] args) {  
        Object lock = new Object();  
        Thread starterThread = new Thread(new StarterThread(lock));  
        Thread enderThread = new Thread(new EnderThread(lock));  
        starterThread.start();  
        enderThread.start();  
  
    } 
}