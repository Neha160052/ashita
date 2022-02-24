// Create and Run a Thread using Runnable Interface and Thread class and show usage of sleep and join methods in the created threads.
class Runner extends  Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Runner2 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Question1 {
    public static void main(String[] args) throws InterruptedException {
        Runner r1 = new Runner();
        r1.start();
        r1.join();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
