package src;

import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calendar hoje = Calendar.getInstance();
        int ano1 = hoje.get(Calendar.YEAR);
        int mes1 = hoje.get(Calendar.MONTH);
        int dia1 = hoje.get(Calendar.DAY_OF_MONTH);

        Data data1 = new Data(ano1, mes1, dia1);
        System.out.println("Data de hoje: " + data1.toString());

        Data data2 = new Data(1974,04,25);
        System.out.println("Data inserida: " + data2.toString());

        // Verificar se uma data é maior que a outra
        if (data1.isMaior(data2)) {
            System.out.println("\n" + data1.toString() + " é maior que " + data2.toString());
        } else {
            System.out.println("\n" + data2.toString() + " é maior que " + data1.toString());
        }

        System.out.println("A diferença entre " + data1.toAnoMesDiaString() + " e " +data2.toAnoMesDiaString() + " é de " + data1.calcularDiferenca(data2) + " dias.");

        Data natal = new Data(2024,12,25);

        if (mes1 == 12 && dia1 > 25){
            System.out.println("Diferença em dias entre " + data1.toAnoMesDiaString() + " e " + (ano1+1) + "/12/25" + ":" + data1.calcularDiferenca(ano1+1,12,25));
        } else {
            System.out.println("Diferença em dias entre " + data1.toAnoMesDiaString() + " e " + (ano1+1) + "/12/25" + ":" + data1.calcularDiferenca(ano1,12,25));

        }
        System.out.println("Faltam " + natal.calcularDiferenca(data1) + "para o natal.");
        System.out.println("O ano é bissexto? " + data2.isAnoBissexto(1974));
        System.out.println("O dia da semana desta data é: " + data2.determinarDiaDaSemana());
    }

}
