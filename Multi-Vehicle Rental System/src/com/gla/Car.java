package com.gla;

public class Car implements VehicleRental {

    public void rent() {
        System.out.println("Car rented");
    }

    public void returnVehicle() {
        System.out.println("Car returned");
    }
}
