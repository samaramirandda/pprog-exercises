package pt.ipp.isep.dei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exposicao {

    private int ano;
    private String designacao;
    private List<Quadro> listaQuadros;

    private static final String DESIGNACAO_POR_OMISSAO

    public Exposicao(String designacao,int ano,List<Quadro> listaQuadros ){
        this.ano = ano;
        this.designacao = designacao;
        this.listaQuadros = new ArrayList<>(listaQuadros);
    }

    public Exposicao(Exposicao outraExposicao){
        designacao = outraExposicao.designacao;
        ano = outraExposicao.ano;
        listaQuadros = new ArrayList<>(outraExposicao.listaQuadros);
    }

    public List<Quadro> getListaQuadros() {
        return new ArrayList<>(listaQuadros);
    }

    public String getDesignacao() {
        return designacao;
    }

    public int getAno() {
        return ano;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setListaQuadros(List<Quadro> listaQuadros) {
        this.listaQuadros = new ArrayList<>(listaQuadros);
    }

    public boolean adicionarQuadro(Quadro quadro){
        return listaQuadros.contains(quadro) ? false:listaQuadros.add(quadro);
    }

    public boolean removerQuadro(Quadro quadro){
        return listaQuadros.remove(quadro);
    }

    public int compareTo(Exposicao outraExposicao){
        return ano - outraExposicao.ano;
    }


    public String ListaQuadrostoString() {
        List<Quadro> listaQuadrosTemp = new ArrayList<>(listaQuadros);
        Collections.sort(listaQuadrosTemp);
        StringBuilder s= new StringBuilder();
        for (Quadro q: listaQuadrosTemp ){
            s.append(q.toString());
            s.append("\n");
        }
        return s.toString();
    }

    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto){
            return true;
        }

        if (outroObjeto == null || getClass() != outroObjeto.getClass()){
            return false;
        }
        Exposicao outraExposicao = (Exposicao) outroObjeto;

        return designacao.equalsIgnoreCase(outraExposicao.designacao) && ano == (outraExposicao.ano) && listaQuadros.equals(outraExposicao.listaQuadros) ;


    }
