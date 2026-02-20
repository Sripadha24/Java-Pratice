package NetworkingAndThreads;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.channels.Channels;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

public class Server {
    public void go(){
        try(ServerSocketChannel sc=ServerSocketChannel.open()){
           sc.bind(new InetSocketAddress(5000));
           while(sc.isOpen()){
               SocketChannel client = sc.accept();

               Reader reader = Channels.newReader(client,"UTF-8");
               BufferedReader br = new BufferedReader(reader);
               String line = br.readLine();

               System.out.println(line);
               PrintWriter writer = new PrintWriter(Channels.newOutputStream(client),true);
               Scanner scn = new Scanner(System.in);
               writer.println(scn.nextLine());
               writer.close();

           }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Server().go();
    }

}
