package SerializableExample;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Main implements Serializable {
    public static void main(String[] args) {
        try{
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
            GameCharacter oneR = (GameCharacter) is.readObject();
            GameCharacter twoR = (GameCharacter) is.readObject();
            GameCharacter threeR = (GameCharacter) is.readObject();

            System.out.println(oneR.getType());
            System.out.println(twoR.getType());
            System.out.println(threeR.getType());

        }catch(Exception r){
            r.printStackTrace();
        }
    }
}
