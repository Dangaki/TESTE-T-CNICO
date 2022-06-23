package br.gft.desafio1.modelo;

public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, String titular, float saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public float rendimento() {
        return (float) (saldo * 0.03);
    }

}
