public class Car extends Vehicle{

    public Car(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    @Override
    public void run() {
        System.out.println("Car is running");
    }
    
}
