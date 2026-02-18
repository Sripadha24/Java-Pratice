package Interface;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.startMedia();
        car.acc();
        car.brake();
        car.stopMedia();
        car.stopEngine();
    }

}
