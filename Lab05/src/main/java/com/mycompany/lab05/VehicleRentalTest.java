
package com.mycompany.lab05;


public class VehicleRentalTest {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Car("CAR123", "Toyota", 3, 5000.0);
        Vehicle vehicle2 = new Bike("BIKE456", "Honda", 10, 200.0);

        System.out.println("----- Car Details -----");
        vehicle1.displayVehicleInfo();
        System.out.println("Rental Cost: " + vehicle1.calculateRentalCost());

        System.out.println("\n----- Bike Details -----");
        vehicle2.displayVehicleInfo();
        System.out.println("Rental Cost: " + vehicle2.calculateRentalCost());
    }
}
