package NetworkingAndThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleThread extends Thread{
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1);
        es.execute(() -> runJob("Job 1"));
        es.execute(() -> runJob("Job 2"));
        es.execute(() -> runJob("Job 3"));
        es.execute(() -> runJob("Job 4"));
        es.execute(() -> runJob("Job 5"));
        es.execute(() -> runJob("Job 6"));
        es.execute(() -> runJob("Job 7"));
        es.execute(() -> runJob("Job 8"));
        es.execute(() -> runJob("Job 9"));
        es.execute(() -> runJob("Job 10"));
        es.shutdown();

    }

    private static void runJob(String s) {
        for(int i=0;i<25;i++){
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName+" "+s+" "+i);
        }
    }
}
