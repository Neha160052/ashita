// WAP to show usage of Callable and demonstrate how it is different from Runnable

import java.util.concurrent.*;

class RunnableExample implements Runnable {
    int number=4;
    @Override
    public void run() {
        int fact = 1;
        for(int count = number; count > 1; count--) {
            fact = fact * count;
        }
        System.out.println(fact);
    }
}

class CallableExample implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        int number=3;
        int fact = 1;
        for(int count = number; count > 1; count--) {
            fact = fact * count;
        }

        return fact;
    }
}

public class Question5 {
    public static void main(String[] args) {
        RunnableExample r1 = new RunnableExample();
        CallableExample c1 = new CallableExample();
        ExecutorService es = Executors.newFixedThreadPool(2);

        es.submit(r1);

        Future<Integer> future = es.submit(c1);

        try {
            future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        es.shutdown();
        System.out.println(future);

    }
}
