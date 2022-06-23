package br.gft.desafio1.modelo;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(int numero, String titular, float saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public float rendimento() {
        return (float) (saldo * 0.05);
    }

}
