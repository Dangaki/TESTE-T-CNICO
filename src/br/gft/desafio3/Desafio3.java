package br.gft.desafio3;

import br.gft.desafio3.modelo.Pessoa;

import java.security.Principal;

public class Desafio3 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Zé da Esquina"
                                    ,"Rua das andorinhas felizes - número 450 - Chalé em Suzano, São Paulo"
                                    ,"(47) 3213-5755");

        System.out.println("\tNome: \t\t" + pessoa.getNome());
        System.out.println("\tEndereço: \t" + pessoa.getEndereco());
        System.out.println("\tTelefone: \t" + pessoa.getTelefone());

    }
}
