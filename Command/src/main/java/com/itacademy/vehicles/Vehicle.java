package com.itacademy.vehicles;

public abstract class Vehicle {

    private String brand;
    private String model;
    private int year;
    private String ownerName;

    public Vehicle(String brand, String model, int year, String ownerName){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public abstract void startUp();
    public abstract void speedUp();
    public abstract void brake();



}
