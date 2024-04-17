package org.example;

public abstract class ContadorEletricidade extends Contador {

    public float potencia;
    public static final float POTENCIA_OMISSAO = 0;
    public static final String PREFIXO ="ELECT-";
    public static int contElect = 0;
    public ContadorEletricidade (String cliente, float consumo, float potencia) {
        super(cliente, consumo, PREFIXO+(++contElect));
        this.potencia = potencia;
    }
    public ContadorEletricidade () {
        super(PREFIXO+(++contElect));
        potencia = POTENCIA_OMISSAO;
    }

    public float getPotencia() {
        return potencia;
    }
    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public static int getContElect() {
        return contElect;
    }
    // não faz sentido ter o set porque não é suposto alterar
}
