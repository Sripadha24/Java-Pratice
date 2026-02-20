package NetworkingAndThreads;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

public class ClientB {
    public void go(){
        String msg="";
        try
                (SocketChannel sc = SocketChannel.open(new InetSocketAddress("localhost",5000))){

            while(msg.equals("exit")) {
                PrintWriter writer = new PrintWriter(Channels.newOutputStream(sc), true);

                Scanner scn = new Scanner(System.in);
                msg = scn.nextLine();
                writer.println(msg);
            }

            Reader cr = Channels.newReader(sc,"UTF-8");
            BufferedReader br = new BufferedReader(cr);
            String line = br.readLine();
            System.out.println(line);


        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new ClientB().go();
    }
}
