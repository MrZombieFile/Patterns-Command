package com.itacademy.commands;

import com.itacademy.vehicles.Vehicle;

public class SpeedUp implements Movement{

    private Vehicle vehicle;

    public SpeedUp(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void execute(){
        this.vehicle.speedUp();
    }

}
