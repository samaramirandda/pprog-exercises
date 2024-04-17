package org.example;


public class Professor extends Escola {
    private String categoria;
    private static double SALARIO_BASE = 1500;
    private static final double MAJORACAO_ADJUNTO = 0.2;
    private static final double MAJORACAO_COORDENADOR = 0.5;
    private static final double MAJORACAO_ASSISTENTE = 0;

    public Professor(String nome, int numeroIdentificacao, String categoria){
        super(nome,numeroIdentificacao);
        this.categoria = categoria;
    }

    public String getCategoria(){return categoria;}

    public void setCategoria(String categoria){this.categoria = categoria;}

    @Override
    public String toString(){
        return String.format("PROFESSOR\n%s\nCategoria %s",toString(),categoria);
    }

    @Override
    public double calcularVencimento(){
        double salario = SALARIO_BASE;

        if (categoria.equals("adjunto") || categoria.equals("Adjunto")){
            salario += SALARIO_BASE * MAJORACAO_ADJUNTO;

        } else if(categoria.equals("Coordenador") || categoria.equals("Coordenador")){
            salario += SALARIO_BASE * MAJORACAO_COORDENADOR;

        }
        return salario;
    };

    public double getTotalSalario(){return salario;}



}
