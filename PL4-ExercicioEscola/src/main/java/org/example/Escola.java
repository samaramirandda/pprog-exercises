package org.example;

public abstract class Escola {
    private String nome;
    private double totalEncargo = 0;
    private int numeroIdentificacao;

    public Escola(String nome, int numeroIdentificacao){
        this.nome = nome;
        this.numeroIdentificacao = numeroIdentificacao;

    }

    public String getNome(){return nome;}

    public int getNumeroIdentificacao(){return numeroIdentificacao;}

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNumeroIdentificacao(int numeroIdentificacao){
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public double getTotalEncargo(double totalBolsa, double totalSalario){
        totalEncargo = totalBolsa + totalSalario;
        return totalEncargo;
    }

    @Override
    public String toString(){
        return String.format("\nNome %s\nNumero Identificacao %d\n",nome,numeroIdentificacao);
    }

    public abstract double calcularVencimento();

}
