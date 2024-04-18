package org.example;

public abstract class Contribuinte extends Desempregados{

    private String nome,morada;
    private float OT;

    private static final String NOME_POR_OMISSAO = "semnome";
    private static final String MORADA_POR_OMISSAO = "semmorada";


//    2. Para cada classe deve implementar, pelo menos, dois construtores, o construtor completo e o
//    construtor sem parâmetros. Deve também proceder à implementação de métodos de acesso e de
//    modificação relevantes e o método toString().

    public Contribuinte(String nome, String morada){
        this.nome = nome;
        this.morada = morada;
    }

    public Contribuinte(){
        nome = NOME_POR_OMISSAO;
        morada = MORADA_POR_OMISSAO;
    }

    public String getNome(){ return nome; }

    public String getMorada(){ return morada; }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setMorada(String morada){
        this.morada = morada;
    }

    public String toString(){
        return String.format("\nNome do contribuinte %%s\nMorada do Contribuinte: %s\n",nome,morada);
    }

    public abstract float calcularImposto();

}
