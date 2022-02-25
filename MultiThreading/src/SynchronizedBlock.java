// Use Synchronize method and synchronize block to enable synchronization between multiple threads trying to access method at same time.

class counter1{
    static int count = 0;
    public void increment(){
        count ++;
    }
    public void decrement(){
        count --;
    }
}

public class SynchronizedBlock {
    public static void main(String[] args) throws InterruptedException {
        counter1 c = new counter1();
        Object lock = new Object();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 20000; i++) {
                synchronized (lock){
                    c.increment();
                }

            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                synchronized (lock) {
                    c.decrement();
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("count: "+c.count);
    }

}
