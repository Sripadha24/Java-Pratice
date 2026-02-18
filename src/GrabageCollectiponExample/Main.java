package GrabageCollectiponExample;

public class Main {
    //int a;
    final static int b;

    static{
        b =10;
    }
    public static void main(String[] args) {
        Animal hippo = new Hippo("Hippo");
        Animal bear = new Bear("Bear");
        System.out.println(bear.getName());
        System.out.println(hippo.getName());
        System.out.println(b);

    }


}
