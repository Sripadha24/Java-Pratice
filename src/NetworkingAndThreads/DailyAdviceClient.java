package NetworkingAndThreads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;

public class DailyAdviceClient {
    public static void main(String[] args) {
        new DailyAdviceClient().go();
    }
    public void go(){
        InetSocketAddress add = new InetSocketAddress("127.0.0.1",5000);
        try{
            SocketChannel sc = SocketChannel.open(add);
            Reader channelReader = Channels.newReader(sc, "UTF-8");
            BufferedReader br = new BufferedReader(channelReader);
            String line = br.readLine();
            System.out.println("Today you should"+line);
            br.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
