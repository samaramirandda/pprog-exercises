package org.example;

public class EletroBi extends ContadorEletricidade {
    public float consumoHorasVazio;
    public static final float CONSUMO_OMISSAO = 0;
    public static float custoHorasVazio = 0.066f;
    public static float custoForaVazio = 0.14f;

    public EletroBi (String cliente, float potencia, float consumoHorasVazio, float consumoHorasForaVazio) {
        super(cliente, consumoHorasForaVazio, potencia);
        this.consumoHorasVazio = consumoHorasVazio;
    }
    public EletroBi () {
        super();
        consumoHorasVazio = CONSUMO_OMISSAO;
    }

    @Override
    public String toString() {
        return String.format("Tipo do contador doméstico: Eletricidade Bi-Horário%n%s", super.toString());
    }

    public float getConsumoHorasVazio() {
        return consumoHorasVazio;
    }
    public void setConsumoHorasVazio(float consumoHorasVazio) {
        this.consumoHorasVazio = consumoHorasVazio;
    }

    public static float getCustoHorasVazio() {
        return custoHorasVazio;
    }
    public static float getCustoForaVazio() {
        return custoForaVazio;
    }
    public static void setCustoForaVazio(float custoForaVazio) {
        EletroBi.custoForaVazio = custoForaVazio;
    }
    public static void setCustoHorasVazio(float custoHorasVazio) {
        EletroBi.custoHorasVazio = custoHorasVazio;
    }

    @Override
    public double calcularCusto () {
        return custoHorasVazio * consumoHorasVazio + custoForaVazio * getConsumo();
    }
}
