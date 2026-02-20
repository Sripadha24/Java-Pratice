package NetworkingAndThreads;


import java.util.concurrent.CountDownLatch;

public class MyRunnable implements Runnable{

    @Override
    public void run() {

        System.out.println("I am running");
//        go();
    }

    public  void go() throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);
        for(int i =0;i<100;i++){
            System.out.println(i);
        }

        latch.await();
    }

//    public void doMore() {
//        System.out.println("you did it fucking did it");
//    }
}
