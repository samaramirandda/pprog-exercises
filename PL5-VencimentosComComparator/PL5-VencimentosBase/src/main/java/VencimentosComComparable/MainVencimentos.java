package vencimentos;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class MainVencimentos {

    public static void main(String[] args) {

        TrabalhadorComissao tc = new TrabalhadorComissao("Susana Ferreira", 
                                                          500.0f, 1500.0f, 6f);
        TrabalhadorPeca tp = new TrabalhadorPeca("Jorge Silva", 20, 30);
        TrabalhadorHora th = new TrabalhadorHora("Carlos Miguel", 160, 3.5f);

        List<Trabalhador> trabs = new ArrayList<>();
        trabs.add(tc);
        trabs.add(tp);
        trabs.add(th);

        System.out.println("### Trabalhadores ###");
        listarForEach(trabs);

        System.out.println("### Ordenação  de Trabalhadores Comparable ###");

        System.out.println("### Trabalhadores por Ordem Crescente do Vencimento ###");
        Collections.sort(trabs);
        listarForEach(trabs);

        System.out.println("### Trabalhadores por Ordem Descrescente do Vencimento ###");
        Collections.sort(trabs, Collections.reverseOrder());
        listarForEach(trabs);
    }

    private statoc void listarForEach(List<Trabalhadores> lista){
        for (Trabalhadores trabalhadores : lista){
            System.out.printf("Trabalhador : %s\tVencimento: %d",trabalhadores.toString,trabalhadores.calcularVencimento);
        }
    }

}
