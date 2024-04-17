package org.example;

public abstract class Contador {

    public String cliente;
    public float consumo;
    public String identificador;
    public static final String CLIENTE_OMISSAO = "Não existe";
    public static final int CONSUMO_OMISSAO = 0;

    public Contador (String cliente, float consumo, String identificador) {
        this.cliente = cliente;
        this.consumo = consumo;
        this.identificador = identificador;
    }
    public Contador (String identificador) {
        this.cliente = CLIENTE_OMISSAO;
        this.consumo = CONSUMO_OMISSAO;
        this.identificador = identificador;
    }

    public float getConsumo() {
        return consumo;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setConsumo(float consumo) {
        this.consumo = consumo;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s%nConsumo:%.2f%nIdentificador:%s", cliente, consumo, identificador);
    }

    public abstract double calcularCusto ();

}
