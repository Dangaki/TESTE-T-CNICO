package br.gft.desafio2;

import br.gft.desafio2.modelo.ContaCorrente;
import br.gft.desafio2.modelo.ContaPoupanca;

public class Desafio2 {
    public static void main(String[] args) {
        ContaCorrente contaC = new ContaCorrente(123, "Daniel Akira", 1000);
        ContaPoupanca contaP = new ContaPoupanca(432, "Mario Bros", 2000);

        System.out.println(contaC + " | Rendimento: R$ " + contaC.rendimento()
                                  + "| Imposto: R$ " + contaC.alcularImposto());

        System.out.println(contaP + " | Rendimento: R$ " + contaP.rendimento()
                                  + "| Imposto: R$ " + contaP.alcularImposto());
    }
}
