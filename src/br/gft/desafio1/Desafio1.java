package br.gft.desafio1;

import br.gft.desafio1.modelo.ContaCorrente;
import br.gft.desafio1.modelo.ContaPoupanca;

public class Desafio1 {
    public static void main(String[] args) {

        ContaCorrente contaC = new ContaCorrente(123, "Daniel Akira", 1000);
        ContaPoupanca contaP = new ContaPoupanca(432, "Mario Bros", 2000);

        System.out.println(contaC + " | Rendimento: R$ " + contaC.rendimento() );
        System.out.println(contaP + " | Rendimento: R$ " + contaP.rendimento());

    }
}
