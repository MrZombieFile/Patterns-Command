package com.itacademy.commands;

import com.itacademy.vehicles.Vehicle;

public class StartUp implements Movement{

    private Vehicle vehicle;

    public StartUp(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void execute(){
        this.vehicle.startUp();
    }

}
