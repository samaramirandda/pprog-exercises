package org.example;

public class Main {
    public static void main(String[] args) {
        Gas gas1 = new Gas("Daniel", 20);
        Gas gas2 = new Gas();
        ElectSimples simples1 = new ElectSimples("José", 250, 6.3f);
        ElectSimples simples2 = new ElectSimples("Marco", 200, 7.3f);
        EletroBi bi1 = new EletroBi("João", 6, 80, 130);
        EletroBi bi2 = new EletroBi();

        Contador[] contadores = new Contador[10];
        contadores[0] = gas1;
        contadores[1] = gas2;
        contadores[2] = simples1;
        contadores[3] = simples2;
        contadores[4] = bi1;
        contadores[5] = bi2;

        System.out.println("Lista dos identificadores e nome clientes:");
        for (int i = 0; i < contadores.length; i++) {
            if (contadores[i] != null) {
                System.out.printf("%s - %s%n", contadores[i].identificador, contadores[i].cliente);
            }
        }
        System.out.println();

        System.out.printf("Quantidade de contadores de eletricidade: %d%n", ContadorEletricidade.getContElect());
        System.out.println();

        System.out.println("Lista dos identificadores dos eletricidade bi horario:");
        for (int i = 0; i < contadores.length; i++) {
            if (contadores[i] instanceof EletroBi) {
                System.out.printf("%s%n", contadores[i].identificador);
            }
        }
        System.out.println();

        System.out.println("Lista dos identificadores com o consumo:");
        for (int i = 0; i < contadores.length; i++) {
            if (contadores[i] != null) {
                System.out.printf("%s - %.2f$%n", contadores[i].identificador, contadores[i].consumo);
            }
        }
        System.out.println();

        float maiorConsumoGas = 0;
        for (int i = 0; i < contadores.length; i++) {
            if (contadores[i] instanceof Gas) {
                if (contadores[i].consumo > maiorConsumoGas) {
                    maiorConsumoGas = contadores[i].consumo;
                }
            }
        }
        System.out.printf("Maior valor consumido de gás: %.2f%n%n", maiorConsumoGas);
    }
}