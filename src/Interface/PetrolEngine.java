package Interface;

public class PetrolEngine implements Engine,Brake{
    @Override
    public void start() {
        System.out.println("Petrol Engine Started");
    }

    @Override
    public void stop() {
        System.out.println("Petrol Engine Stopped");
    }

    @Override
    public void acc() {
        System.out.println("Petrol Engine Accelerated");
    }

    @Override
    public void brake() {
        System.out.println("Petrol Engine Brake");
    }
}
