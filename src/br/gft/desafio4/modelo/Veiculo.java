package br.gft.desafio4.modelo;

public class Veiculo {
    protected String tipoCombustivel;

    public Veiculo() {
        this.tipoCombustivel = "";
    }

    public Veiculo(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
}
