package SerializableExample;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Pond implements Serializable {
    transient private Duck duck = new Duck();

    public static void main(String[] args) {
        Pond obj = new Pond();
        try{
            FileOutputStream fs = new FileOutputStream("PondObj.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(obj);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
