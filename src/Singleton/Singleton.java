package Singleton;

public class Singleton {

    private Singleton(){

    }
    private static Singleton intsance;
    public static Singleton getInstance(){
        if(intsance == null){
            intsance = new Singleton();
        }
        return intsance;
    }

}
