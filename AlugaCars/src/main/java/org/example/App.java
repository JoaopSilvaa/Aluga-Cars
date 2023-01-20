package org.example;

import org.example.Classes.Aluguel;
import org.example.Classes.Person;
import org.example.Classes.Vehicle;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Olá, Seja bem-vindo ao App AlugaCars!!!");
            System.out.println("Digite o tipo de veículo que você deseja alugar? \n Opções:" +
                    " pequeno, médio e SUV");
            String typeVehicle = scanner.next();
            System.out.println("Digite se você é pessoa física ou jurídica: ");
            String typePerson = scanner.next();
            System.out.println("Por fim, digite a quantidade de dias que você deseja alugar o seu veículo: ");
            int days = scanner.nextInt();

            Aluguel aluguel = new Aluguel(new Vehicle(typeVehicle), new Person(typePerson), days);

            System.out.printf("O valor final do aluguel é: R$ %.2f \n", aluguel.calculate());
        } catch (RuntimeException err) {
            System.out.printf(String.valueOf(err));
        }
    }
}
