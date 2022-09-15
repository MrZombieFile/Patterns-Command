package com.itacademy.vehicles;

public class Bike extends Vehicle{


    public Bike(String brand, String model, int year, String ownerName) {
        super(brand, model, year, ownerName);
    }

    @Override
    public void startUp() {
        System.out.println("Starting up " + super.getOwnerName() + "'s"+ " bike");
    }

    @Override
    public void speedUp() {
        System.out.println("Speeding up " + super.getOwnerName() + "'s"+ " bike");
    }

    @Override
    public void brake() {
        System.out.println("Braking " + super.getOwnerName() + "'s "+ " bike");
    }
}
