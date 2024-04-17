package org.example;

public class Gas extends Contador {

    public static final String PREFIXO ="GAS-";
    public static float custoGas = 0.8f;
    public static int contGas = 0;
    public Gas (String cliente, float consumo) {
        super (cliente, consumo, PREFIXO + (++contGas));
    }
    public Gas () {
        super(PREFIXO + (++contGas));
    }

    @Override
    public String toString() {
        return String.format("Tipo do contador doméstico: Gás%n%s", super.toString());
    }

    public static float getCustoGas() {
        return custoGas;
    }
    public static int getContGas() {
        return contGas;
    }

    @Override
    public double calcularCusto () {
        return custoGas * consumo;
    }
}
