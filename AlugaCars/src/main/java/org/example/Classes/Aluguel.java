package org.example.Classes;

import org.example.Interfaces.CalculateRent;

public class Aluguel implements CalculateRent {
    private final Vehicle vehicle;
    private final Person client;
    private final int days;

    public Aluguel(Vehicle vehicle, Person client, int days) {
        this.vehicle = vehicle;
        this.client = client;
        this.days = days;
    }

    @Override
    public double calculate() {
        if((client.type().equalsIgnoreCase("física") || client.type().equalsIgnoreCase("fisica"))
        && days > 5) {
            return (vehicle.rent() - (vehicle.rent() * client.discount())) * days;
        } else if ((client.type().equalsIgnoreCase("jurídica") || client.type().equalsIgnoreCase("juridica"))
                && days > 3) {
            return (vehicle.rent() - (vehicle.rent() * client.discount())) * days;
        }
        else if (client.type().equalsIgnoreCase("física") || client.type().equalsIgnoreCase("fisica") || client.type().equalsIgnoreCase("jurídica") || client.type().equalsIgnoreCase("juridica")){
            return vehicle.rent() * days;
        }
        else {
            throw new RuntimeException("Tipo de cliente inválido");
        }
    }
}
