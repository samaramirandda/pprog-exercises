package org.example;

public class Aluno extends Escola {
    private int numeroMecanografico;

    public Aluno(String nome, int numeroIdentificacao,int numeroMecanografico){
        super(nome,numeroIdentificacao);
        this.numeroMecanografico = numeroMecanografico;
    }

    public int getNumeroMecanografico(){return numeroMecanografico;}

    public void setNumeroMecanografico(int numeroMecanografico){this.numeroMecanografico = numeroMecanografico;}

    @Override
    public String toString(){
        return String.format("ALUNO\n%s\nNumero Mecanográfico %d",toString(),numeroMecanografico);
    }

}
