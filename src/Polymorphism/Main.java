package Polymorphism;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shapes obj = new Shapes();
        Shapes obj2 = new Circle();
        Shapes obj3 = new Square();
        obj.area();
        obj2.area();
        obj3.area();
    }

}
