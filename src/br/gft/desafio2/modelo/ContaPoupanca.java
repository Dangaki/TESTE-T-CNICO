package br.gft.desafio2.modelo;

public class ContaPoupanca extends Conta implements Imposto {
    public ContaPoupanca(int numero, String titular, float saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public float rendimento() {
        return (float) (saldo * 0.05);
    }

    @Override
    public float alcularImposto() {
        return (float) (rendimento() * 0.10);
    }
}
