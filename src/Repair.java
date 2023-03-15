public class Repair {
    public CheckEngine checkEngine;

    public void repair(CheckEngine vehicle) {
        if (vehicle.getClass() == Car.class) {
            System.out.println("Repair the car");
        } else if (vehicle.getClass() == Truck.class) {
            System.out.println("Repair the truck");
        } else {
            System.out.println("Repair the bicycle");
        }
    }
}
