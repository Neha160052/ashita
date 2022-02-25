// Use Synchronize method and synchronize block to enable synchronization between multiple threads trying to access method at same time.

class counter{
    static int count = 0;
    public synchronized void increment(){
        count ++;
    }
}

public class SynchronizedMethod {
    public static void main(String[] args) throws InterruptedException {
        counter c = new counter();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 20000; i++) {
                c.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 20000; i++) {
                c.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("count: "+c.count);
    }

}
