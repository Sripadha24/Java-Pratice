package SerializableExample;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Square implements Serializable {
    private int w ;
    private int h;
    public Square(int w,int h){
        this.w = w;
        this.h= h;
    }

    public static void main(String[] args) {
        Square obj = new Square(10,20);
        try{
            FileOutputStream fs = new FileOutputStream("squareobj.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(obj);
            os.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
