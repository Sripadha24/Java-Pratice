package FileHandling;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadAFileLabdma {
    public static void main(String[] args) {
        try{
            Files.lines(Path.of("Code/foo.cpp")).forEach(line -> System.out.println(line));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
