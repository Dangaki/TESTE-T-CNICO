package br.gft.desafio2.modelo;

public class Conta{
    protected int numero;
    protected String titular;
    protected float saldo;

    public Conta(int numero, String titular, float saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
    public float rendimento(){
        System.out.println("Metodo rendimento não implementado!\n");
        return -1;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
