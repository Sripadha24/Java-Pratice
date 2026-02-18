package SerializableExample;

import Genrics.Main;

import java.io.*;

public class GameSaverTest implements Serializable {
    public static void main(String[] args) {
        GameCharacter  one =new GameCharacter(50,"Sugriva",new String[]{"Strength","Gadha","Army"});
        GameCharacter two = new GameCharacter(200,"Hanuman",new String[]{"Strength","Gadha","Army"});
        GameCharacter three  =new GameCharacter(150,"Vali",new String[]{"Strength","Gadha","Army"});

        try{
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
        }catch(Exception r){
            r.printStackTrace();
        }


    }
}
