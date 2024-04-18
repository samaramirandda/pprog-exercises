package org.example;

public abstract class Desempregados {

    private int mesesParagem;
    private static int taxaOT = 2;

    public float calcularImposto(float OT){
        return OT * taxaOT;
    }

}
