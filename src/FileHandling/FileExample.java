package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        try{
            FileWriter writer = new FileWriter("Code/foo.cpp");
            writer.write("#include<stdio.h>\nint main(){printf(\"Hello World\");return 0;}");

//              File dir = new File("Code");
//              dir.mkdir();
//
//              if(dir.isDirectory()){
//                  String[] list = dir.list();
//                  for(String i :list ){
//                      System.out.println(i);
//                  }
//              }
              writer.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
