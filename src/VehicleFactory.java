/*
 * Factory Pattern
 * The factory pattern is used to create several types of objects without the user knowing what objects were created
 */

public class VehicleFactory {

    public Vehicle getVehicle(String type, int maxSpeed) {
        if (type.equals("Bicycle")) {
            return new Bicycle("Bicycle", maxSpeed);
        } else if (type.equals("Car")) {
            return new Car("Car", maxSpeed);
        } 
        return null;
    }
}
