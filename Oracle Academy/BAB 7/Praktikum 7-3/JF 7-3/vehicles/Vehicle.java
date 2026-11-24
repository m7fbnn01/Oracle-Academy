
package vehicles;

public class Vehicle {

    // STATIC VARIABLE
    public static String MAKE = "Augur";
    public static int numVehicles = 0;

    // INSTANCE VARIABLE
    private String chassisNo;
    private String model;

    // CONSTRUCTOR
    public Vehicle(String model) {

        numVehicles++;

        chassisNo = "ch" + numVehicles;

        this.model = model;

        System.out.println("Vehicle manufactured");
    }

    // GETTER CHASSIS
    public String getChassisNo() {
        return chassisNo;
    }

    // SETTER CHASSIS
    public void setChassisNo(String chassisNo) {
        this.chassisNo = chassisNo;
    }

    // GETTER MODEL
    public String getModel() {
        return model;
    }

    // SETTER MODEL
    public void setModel(String model) {
        this.model = model;
    }

    // SETTER MAKE
    public void setMake(String make) {
        MAKE = make;
    }

    // TOSTRING
    public String toString() {

        return "The vehicle is manufactured by: " + MAKE +
               "\nThe model type is " + model +
               "\nThe chassis number is " + chassisNo +
               "\nThe engine make is " + Engine.getMake() +
               "\nThe engine capacity is " + Engine.getCapacity();
    }

    // STATIC NESTED CLASS
    public static class Engine extends Vehicle {

        private static final String MAKE = "Predicter";
        private static final int CAPACITY = 1600;

        // CONSTRUCTOR
        public Engine(String model) {
            super(model);
        }

        // GETTER ENGINE MAKE
        public static String getMake() {
            return MAKE;
        }

        // GETTER ENGINE CAPACITY
        public static int getCapacity() {
            return CAPACITY;
        }
    }
}
