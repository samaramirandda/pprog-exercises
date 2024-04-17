package org.example;

public class ElectSimples extends ContadorEletricidade {
    public static float custoTar1 = 0.13f;
    public static float custoTar2 = 0.16f;
    public static float refPotencia = 6.9f;

    public ElectSimples (String cliente, float consumo, float potencia) {
        super(cliente, consumo, potencia);
    }
    public ElectSimples () {
        super();
    }
    public double detCustoHora () {
        return potencia < refPotencia ? custoTar1 : custoTar2;
    }
    @Override
    public double calcularCusto () {
        return detCustoHora() * getConsumo();
    }

    @Override
    public String toString() {
        return String.format("Tipo do contador doméstico: Eletricidade Simples%n%s", super.toString());
    }

    public static float getCustoTar1() {
        return custoTar1;
    }
    public static float getCustoTar2() {
        return custoTar2;
    }
    public static float getRefPotencia() {
        return refPotencia;
    }
    public static void setCustoTar1(float custoTar1) {
        ElectSimples.custoTar1 = custoTar1;
    }
    public static void setCustoTar2(float custoTar2) {
        ElectSimples.custoTar2 = custoTar2;
    }
    public static void setRefPotencia(float refPotencia) {
        ElectSimples.refPotencia = refPotencia;
    }
}
