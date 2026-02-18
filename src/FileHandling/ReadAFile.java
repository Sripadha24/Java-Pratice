package FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadAFile {
    public static void main(String[] args) {
        try{
            FileReader reader = new FileReader("Code\foo.cpp");
            BufferedReader bf = new BufferedReader(reader);
            String line;
            while((line = bf.readLine())!=null){
                System.out.println(line);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
