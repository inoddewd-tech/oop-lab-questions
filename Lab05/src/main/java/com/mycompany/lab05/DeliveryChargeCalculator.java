
package com.mycompany.lab05;

public class DeliveryChargeCalculator {
     double calculateCharge(double baseCharge) {
        return baseCharge;
    }
     
     double calculateCharge(double baseCharge, double distanceKm) {
        return baseCharge + (distanceKm * 100.0);
    }
     double calculateCharge(double baseCharge, double distanceKm, double weightKg) {
        return baseCharge + (distanceKm * 100.0) + (weightKg * 50.0);
    }
     double calculateCharge(double baseCharge, boolean expressDelivery) {
        if (expressDelivery) {
            return baseCharge + 500.0;
        } else {
            return baseCharge;
        }
    }

}
