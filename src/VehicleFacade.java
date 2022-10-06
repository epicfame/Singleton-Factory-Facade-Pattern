/*
 * Facade Pattern
 * The façade pattern is used to hide a class and the operations performed by that class using other classes. 
 * So in the example coding, we don't need to know classes like Car and Bicycle. 
 * Then the Car and Bicycle classes can be overcome with patterns. 
 * Then another function of this pattern is to wrap it to make it simpler -> because we only have to deal with 1 class.
 */

public class VehicleFacade {
    private VehicleFactory vf = new VehicleFactory();

    private Vehicle car;
    private Vehicle bicycle;

    public VehicleFacade(){
        car = vf.getVehicle("Car", 100);
        bicycle = vf.getVehicle("Bicycle", 50);
    }

    public void runCar(){
        car.run();
    }

    public void runBicycle(){
        bicycle.run();
    }

}
