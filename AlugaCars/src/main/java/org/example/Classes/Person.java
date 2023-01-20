package org.example.Classes;

import org.example.Interfaces.Client;

public class Person implements Client {
    private final String type;

    public Person(String type){
        this.type = type;
    }

    @Override
    public String type() {
        return type;
    }

    @Override
    public double discount() {
        if (type.equalsIgnoreCase("física") || type.equalsIgnoreCase("fisica")) {
            return 0.05;
        }
        else if (type.equalsIgnoreCase("jurídica") || type.equalsIgnoreCase("juridica")) {
            return 0.10;
        }
        else {
            throw new RuntimeException("Tipo de cliente inválido");
        }
    }
}
