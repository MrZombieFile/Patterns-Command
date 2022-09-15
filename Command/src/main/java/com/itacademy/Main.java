package com.itacademy;

import com.itacademy.commands.Brake;
import com.itacademy.commands.SpeedUp;
import com.itacademy.commands.StartUp;
import com.itacademy.vehicles.Bike;
import com.itacademy.vehicles.Car;
import com.itacademy.vehicles.Plane;
import com.itacademy.vehicles.Ship;

public class Main {
    public static void main(String[] args) {

        /*
        Patró Command
        Command Pattern
        */

        Car car1 = new Car("Mazda", "3", 2012, "Joaquin Reyes");
        Car car2 = new Car("Seat", "Leon", 2018, "Fernando Aguilar");

        Bike bike1 = new Bike("Orbea", "660", 2020, "Salvador Hoyos");

        Plane plane1 = new Plane("Airbus", "747", 2019, "Air Manhattan");
        Plane plane2 = new Plane("Boeing", "727", 2009, "Air NewYork");

        Ship ship1 = new Ship("Rolls Royce", "A42R", 2000, "Compagnia Naviera Italiana");

        //Una possible manera de desenvolupar el rebre ordres a l'invoker:
        //A possible way to develop taking orders at invoker;
        Brake brakeCar1 = new Brake(car1);
        Brake brakeCar2 = new Brake(car2);
        Brake brakeBike1 = new Brake(bike1);
        Brake brakePlane1 = new Brake(plane1);
        Brake brakePlane2 = new Brake(plane2);
        Brake brakeShip1 = new Brake(ship1);

        InvokerVehicles invoker = new InvokerVehicles();
        invoker.submitMovement(brakeCar1);
        invoker.submitMovement(brakeCar2);
        invoker.submitMovement(brakeBike1);
        invoker.submitMovement(brakePlane1);
        invoker.submitMovement(brakePlane2);
        invoker.submitMovement(brakeShip1);

        //La millor manera de desenvolupar-ho
        //The best way to develop it
        invoker.submitMovement(new SpeedUp(car1));
        invoker.submitMovement(new SpeedUp(car2));
        invoker.submitMovement(new SpeedUp(bike1));
        invoker.submitMovement(new SpeedUp(plane1));
        invoker.submitMovement(new SpeedUp(plane2));
        invoker.submitMovement(new SpeedUp(ship1));


        //A mix within the two preceding
        StartUp startUpCar1 = new StartUp(car1);
        invoker.submitMovement(startUpCar1);
        StartUp startUpCar2 = new StartUp(car2);
        invoker.submitMovement(startUpCar2);
        StartUp startUpBike1 = new StartUp(bike1);
        invoker.submitMovement(startUpBike1);
        StartUp startUpPlane1 = new StartUp(plane1);
        invoker.submitMovement(startUpPlane1);
        StartUp startUpPlane2 = new StartUp(plane2);
        invoker.submitMovement(startUpPlane2);
        StartUp startUpShip1 = new StartUp(ship1);
        invoker.submitMovement(startUpShip1);

        //Desencadeno tots els moviments a l'invoker, tots de cop.
        invoker.triggerMovement();



    }
}