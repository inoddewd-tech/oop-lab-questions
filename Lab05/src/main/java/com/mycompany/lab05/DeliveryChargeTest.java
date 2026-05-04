
package com.mycompany.lab05;


public class DeliveryChargeTest {
    public static void main(String[] args) {

        DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();

        double charge1 = calculator.calculateCharge(1000.0);
        double charge2 = calculator.calculateCharge(1000.0, 5);
        double charge3 = calculator.calculateCharge(1000.0, 5, 2);
        double charge4 = calculator.calculateCharge(1000.0, true);

        System.out.println("Base Charge Only: " + charge1);
        System.out.println("With Distance: " + charge2);
        System.out.println("With Distance & Weight: " + charge3);
        System.out.println("With Express Delivery: " + charge4);
    }
}
