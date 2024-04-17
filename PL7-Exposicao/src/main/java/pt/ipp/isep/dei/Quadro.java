package pt.ipp.isep.dei;

//2. Implemente a classe Quadro.

import java.util.Objects;

public class Quadro {
    private String designacao;
    private String autor;
    private int ano;

    private static final String DESIGNACAO_POR_OMISSAO = "sem designacao";
    private static final String AUTOR_OMISSAO = "sem autor";
    private static final int ANO_POR_OMISSAO = 0;


    public Quadro(String designacao,String autor,int ano){
        this.designacao = designacao;
        this.autor = autor;
        this.ano = ano;
    }

    public Quadro(String autor,int ano){
        designacao = DESIGNACAO_POR_OMISSAO;
        this.autor = autor;
        this.ano = ano;
    }

    public Quadro(int ano){
        designacao = DESIGNACAO_POR_OMISSAO;
        autor = AUTOR_OMISSAO;
        this.ano = ano;
    }

    public Quadro(String designacao,String autor){
        this.designacao = designacao;
        this.autor = autor;
        ano = ANO_POR_OMISSAO;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public String getAutor() {
        return autor;
    }

    public String getDesignacao() {
        return designacao;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quadro quadro = (Quadro) o;
        return ano == quadro.ano && Objects.equals(designacao, quadro.designacao) && Objects.equals(autor, quadro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(designacao, autor, ano);
    }

    @Override
    public String toString() {
        return "Quadro{" +
                "designacao='" + designacao + '\'' +
                ", autor='" + autor + '\'' +
                ", ano=" + ano +
                '}';
    }
}
