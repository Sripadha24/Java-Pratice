package NetworkingAndThreads;

import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Random;

public class DailyAdviceServer {
    final private String[] adiviceList={"Take a break and stretch", "Stay hydrated", "Learn something new", "Practice gratitude", "Connect with nature"};
    private final Random random = new Random();
    public void go(){
        try(ServerSocketChannel sc= ServerSocketChannel.open()){
            sc.bind(new InetSocketAddress(5000));
            while(sc.isOpen()){
                SocketChannel client = sc.accept();
                PrintWriter writer = new PrintWriter(Channels.newOutputStream(client));
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private String getAdvice(){
        int nextA = random.nextInt(adiviceList.length);
        return adiviceList[nextA];
    }

    public static void main(String[] args) {
        new DailyAdviceServer().go();
    }

}
