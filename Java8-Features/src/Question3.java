// Q3  Create a thread using lambda function

public class Question3 {
    public static void main(String[] args) {
        Runnable r2=()->{
            System.out.println("Thread is running...");
        };
        Thread t2=new Thread(r2);
        t2.start();
    }
}
