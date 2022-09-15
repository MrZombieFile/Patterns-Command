package com.itacademy.commands;

import com.itacademy.vehicles.Vehicle;

public class Brake implements Movement{

    private Vehicle vehicle;

    public Brake(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void execute(){
        this.vehicle.brake();
    }

}
