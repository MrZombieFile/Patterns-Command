package com.itacademy;

import com.itacademy.commands.Movement;
import com.itacademy.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class InvokerVehicles {

    private List<Movement> movements = new ArrayList<>();

    public void submitMovement (Movement movement) {
        this.movements.add(movement);
    }

    public void triggerMovement(){
        this.movements.forEach(x -> x.execute());
        this.movements.clear();
    }

}
