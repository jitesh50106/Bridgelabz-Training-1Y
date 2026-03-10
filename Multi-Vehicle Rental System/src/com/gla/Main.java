package com.gla;

public class Main {
    public static void main(String[] args) {

        VehicleRental car = new Car();
        VehicleRental bike = new Bike();
        VehicleRental bus = new Bus();

        car.rent();
        bike.rent();
        bus.rent();


        car.returnVehicle();
    }
}
