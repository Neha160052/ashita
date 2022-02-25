// Use a singleThreadExecutor, newCachedThreadPool() and newFixedThreadPool() to submit a list of tasks and wait for completion of all tasks.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor extends Thread{
    private  int id;

    public Processor(int id){
        this.id = id;
    }

    public void run(){
        System.out.println("Starting: "+id);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed "+id);
    }
}

public class ThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService fixedexecutor = Executors.newFixedThreadPool(2);
        ExecutorService cachedexecutor = Executors.newCachedThreadPool();
        ExecutorService singlethreadexecutor = Executors.newSingleThreadExecutor();

        for(int i = 0;i<5;i++){
            fixedexecutor.submit(new Processor(i));
        }

        fixedexecutor.shutdown();
        fixedexecutor.awaitTermination(5, TimeUnit.DAYS);
        System.out.println("Shutdown fixedThreadpool ");

        for(int i = 0;i<5;i++){
            cachedexecutor.submit(new Processor(i));
        }

        cachedexecutor.shutdown();
        cachedexecutor.awaitTermination(5, TimeUnit.DAYS);
        System.out.println("Shutdown cachedThreadpool ");

        singlethreadexecutor.submit(new Processor(1));

        singlethreadexecutor.shutdown();
        singlethreadexecutor.awaitTermination(5, TimeUnit.DAYS);
        System.out.println("Shutdown singleThreadexecutor ");
    }
}
