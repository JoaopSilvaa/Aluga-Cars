package org.example.Classes;

import org.example.Interfaces.Car;

public class Vehicle implements Car {
    private final String type;

    public Vehicle(String type){
        this.type = type;
    }
    @Override
    public String type() {
        return type;
    }

    @Override
    public int rent() {
        if (type.equalsIgnoreCase("pequeno")) {
            return 100;
        } else if (type.equalsIgnoreCase("médio") || type.equalsIgnoreCase("medio")) {
            return 150;
        }
        else if (type.equalsIgnoreCase("SUV")) {
            return 200;
        }
        else {
            throw new RuntimeException("Tipo de veículo inválido");
        }
    }
}
