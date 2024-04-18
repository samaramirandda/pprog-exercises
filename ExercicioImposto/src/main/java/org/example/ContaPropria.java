package org.example;

public class ContaPropria {

    private String profissao;
    private static int taxaRT = 3;
    private static int taxaOR1 = 2;
    private static int taxaOR2 = 5;
    private static int limite = 50000;

    public String getProfissao(){return profissao;};

    public void setProfissao(String profissao){
        this.profissao = profissao;
    }

    public float calcularTaxaOR(float OR){
        return (OR <= limite) ? (taxaOR1 + OR) : (taxaOR2 * OR);
    }

    public float calcularTaxaRT(float RT){
        return taxaRT * RT;
    }
}
