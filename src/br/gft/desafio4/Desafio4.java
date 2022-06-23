package br.gft.desafio4;

import br.gft.desafio4.modelo.Carro;

import java.util.Scanner;

public class Desafio4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.println("Carro " + (i + 1));
            System.out.print("Escreva o Modelo : ");
            System.out.print("Escreva a Marca : ");
            System.out.print("Escreva o Tipo de Combustível : ");
        }

    }

}
