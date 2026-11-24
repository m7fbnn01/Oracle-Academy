
package vehicles;

public class TestVehicle {

    public static void main(String[] args) {

        // STATIC VARIABLE
        System.out.println("Manufacturer: " + Vehicle.MAKE);

        System.out.println("Number of vehicles manufactured: "
                + Vehicle.numVehicles);

        // OBJECT PERTAMA
        Vehicle vehicle1 = new Vehicle("Vision");

        System.out.println(vehicle1.toString());

        // OBJECT KEDUA
        Vehicle vehicle2 = new Vehicle("Edict");

        System.out.println(vehicle2.toString());

        // MENGUBAH STATIC VARIABLE
        vehicle2.setMake("Seer");

        System.out.println("\n===== AFTER CHANGING MAKE =====");

        System.out.println(vehicle1.toString());

        System.out.println();

        System.out.println(vehicle2.toString());

        // OBJECT ENGINE
        Vehicle.Engine vehicle3 =
                new Vehicle.Engine("Fortune");

        // MENAMPILKAN DATA ENGINE
        System.out.println("\n===== VEHICLE ENGINE =====");

        System.out.println(
            "Vehicle number " + vehicle3.getChassisNo() +
            " is a " + vehicle3.getModel() +
            " model and has an engine capacity of " +
            Vehicle.Engine.getCapacity() + "cc"
        );

        // TOTAL KENDARAAN
        System.out.println("\nNumber of vehicles manufactured: "
                + Vehicle.numVehicles);
    }
}
