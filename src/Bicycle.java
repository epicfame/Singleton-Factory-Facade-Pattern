public class Bicycle extends Vehicle {

    public Bicycle(String name, int maxSpeed) {
        super(name, maxSpeed);
    }
    
    @Override
    public void run() {
        System.out.println("Bycle is running");
    }
    
}
