package NetworkingAndThreads;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThread extends Thread{
    public static void main(String[] args) {
        Runnable r= new MyRunnable();
        Runnable r2= new MyRunnable2();

//        Thread t= new Thread(r);
//        t.start();
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.execute(r);
        es.execute(r2);
        //System.out.println("Main Thread");
        es.shutdown();
        //Thread.dumpStack();
    }
}
