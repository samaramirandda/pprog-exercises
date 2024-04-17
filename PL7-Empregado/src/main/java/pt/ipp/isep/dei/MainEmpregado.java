package pt.ipp.isep.dei;

import pt.ipp.isep.dei.Tempo;
import pt.ipp.isep.dei.Data;
import java.util.ArrayList;

public class MainEmpregado {
    public static void main(String[] args) {

        // a) Crie e visualize uma instância de Data para representar a data atual;
        Data dataAtual = Data.dataAtual();
        System.out.println("Data atual: " + dataAtual);

        // b) Crie e visualize duas instâncias de Tempo;
        Tempo tempo1 = new Tempo(8, 0, 0);
        Tempo tempo2 = new Tempo(17, 0, 0);
        System.out.println("Tempo 1: " + tempo1);
        System.out.println("Tempo 2: " + tempo2);

        // c) Crie duas instâncias de Empregado usando as instâncias de Data e Tempo criadas anteriormente;
        Empregado empregado1 = new Empregado("João", "Silva", dataAtual, tempo1, tempo2);
        Empregado empregado2 = new Empregado("Maria", "Sousa", dataAtual, tempo1, tempo2);

        // d) Verifique se os atributos do tipo Data dos empregados criados possuem referências partilhadas;
        System.out.println("Os atributos do tipo Data dos empregados têm referências partilhadas? " + (empregado1.getDataContrato() == empregado2.getDataContrato()));

        // e) Verifique se os atributos do tipo Tempo dos empregados criados possuem referências partilhadas;
        System.out.println("Os atributos do tipo Tempo dos empregados têm referências partilhadas? " + (empregado1.getHoraEntrada() == empregado2.getHoraEntrada() && empregado1.getHoraSaida() == empregado2.getHoraSaida()));

        // f) Altere o conteúdo do objeto Data e o conteúdo dos objetos Tempo inicialmente criados;
        dataAtual.setData(2024, 4, 15);
        tempo1.setHoras(9);
        tempo2.setHoras(18);

        // g) Visualize as instâncias de Data e de Tempo, bem como as instâncias de Empregado criadas;
        System.out.println("Data atual alterada: " + dataAtual);
        System.out.println("Tempo 1 alterado: " + tempo1);
        System.out.println("Tempo 2 alterado: " + tempo2);
        System.out.println("Empregado 1: " + empregado1);
        System.out.println("Empregado 2: " + empregado2);

        // h) Altere a data de contrato e as horas de entrada e de saída do segundo empregado;
        empregado2.setDataContrato(2020, 1, 1);
        empregado2.setHoraEntrada(new Tempo(8, 30, 0));
        empregado2.setHoraSaida(new Tempo(17, 30, 0));

        // i) Armazene as instâncias de Empregado criadas num contentor de objetos do tipo ArrayList;
        ArrayList<Empregado> listaEmpregados = new ArrayList<>();
        listaEmpregados.add(empregado1);
        listaEmpregados.add(empregado2);

        // j) Liste todos os empregados;
        System.out.println("### Listagem dos empregados ###");
        for (Empregado empregado : listaEmpregados) {
            System.out.println(empregado);
        }

        // k) Liste o nome, o número de horas de trabalho por semana e a antiguidade de cada um dos empregados.
        System.out.println("### Informações dos empregados ###");
        for (Empregado empregado : listaEmpregados) {
            System.out.println("Nome: " + empregado.getPrimeiroNome() + " " + empregado.getUltimoNome());
            System.out.println("Horas de trabalho por semana: " + empregado.calcularHorasSemanais());
            System.out.println("Antiguidade: " + empregado.calcularAntiguidade() + " anos");
            System.out.println();
        }
    }
}
