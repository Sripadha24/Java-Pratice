package NetworkingAndThreads;

public class MyRunnable2 implements Runnable{
    @Override
    public void run() {
        try{
            Thread.sleep(2000);
            System.out.println("I am running 2");
//            go();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void go() {
       for(int i =0;i<100;i++){
           System.out.println(i);
       }

    }
}
