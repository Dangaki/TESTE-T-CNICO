package br.gft.desafio4.modelo;

public class Carro extends Veiculo {
    private String modelo;
    private String marca;

    public Carro()
    {
        super();
        this.modelo = "";
        this.marca = "";
    }

    public Carro(String tipoCombustivel, String modelo, String marca) {
        super(tipoCombustivel);
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", tipoCombustivel='" + tipoCombustivel + '\'' +
                '}';
    }
}