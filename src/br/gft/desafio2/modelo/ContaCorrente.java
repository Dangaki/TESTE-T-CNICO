package br.gft.desafio2.modelo;

public class ContaCorrente extends Conta implements Imposto{

    public ContaCorrente(int numero, String titular, float saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public float rendimento() {
        return (float) (saldo * 0.03);
    }

    @Override
    public float alcularImposto() {
        return (float) (rendimento() * 0.25);
    }
}
