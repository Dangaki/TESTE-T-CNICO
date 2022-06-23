package br.gft.desafio4;

import br.gft.desafio4.modelo.Carro;
import br.gft.desafio4.modelo.Veiculo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Desafio4 {

    public static void main(String[] args) {

        ArrayList<Carro> listaCarros = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String modelo, marca, combustivel;

        for(int i = 0; i < 5; i++){
            System.out.print("\nCarro " + (i + 1));
            System.out.print("\nEscreva o Modelo : ");
            modelo = scanner.nextLine();
            System.out.print("\nEscreva a Marca : ");
            marca = scanner.nextLine();
            System.out.print("\nEscreva o Tipo de Combustível : ");
            combustivel = scanner.nextLine();

            listaCarros.add(new Carro(combustivel, modelo, marca));

        }

        System.out.println("\n\nLista de Carros:");

        int contGasolina = 0, contDisel = 0;
        for (Carro carro: listaCarros) {
            System.out.println(carro.toString());
            contGasolina += carro.getTipoCombustivel().toLowerCase().equals("gasolina") ? 1 : 0;
            contDisel    += carro.getTipoCombustivel().toLowerCase().equals("diesel") ? 1 : 0;
        }

        System.out.println("\n\nCarros a Gasolina: " + contGasolina);
        System.out.println("Carros a Diesel: " + contDisel);

        scanner.close();
    }

}
