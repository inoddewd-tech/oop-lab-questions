
package com.mycompany.lab05;

class Vehicle {

    private String vehicleNumber;
    protected String brand;

    // Constructor
    Vehicle(String vehicleNumber, String brand) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
    }

    // Display method
    void displayVehicleInfo() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Brand: " + brand);
    }

    // Rental cost method
    double calculateRentalCost() {
        System.out.println("General vehicle rental cost calculation");
        return 0.0;
    }
}
