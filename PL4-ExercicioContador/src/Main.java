//Uma empresa de distribuição de gás e eletricidade pretende um programa para fazer a gestão de contadores
//        domésticos. Os contadores existentes são de três tipos: gás, eletricidade com tarifário simples e eletricidade
//        com tarifário bi-horário. Os contadores registam apenas o consumo do mês atual (número inteiro), sendo o
//        gás medido em m3 e a eletricidade em kWh. Os contadores bi-horários registam dois consumos do mês atual:
//        nas horas de vazio e fora das horas de vazio. Cada contador tem uma identificação que distingue os contadores
//        de gás dos de eletricidade, com o seguinte formato: GAS-X e ELECT-Y, sendo X e Y números inteiros desde 1.
//        Por exemplo, GAS-1, GAS-2, ELECT-1, ELECT-2, etc.
//        Elabore as classes representativas dos contadores, usando o seguinte procedimento:
//        1. Esboce um diagrama de classes, em notação UML, considerando que as classes dos contadores devem
//        permitir calcular o custo do consumo registado. O custo do consumo de gás é dado pela seguinte
//        fórmula: custo unitário x consumo, sendo o custo unitário igual a 0.8€/m3. O custo do consumo de
//        eletricidade é baseado na tabela abaixo. Assumir que os custos unitários poderão ser atualizados no
//        futuro, que pode ser preciso listar os nomes dos clientes que possuem contadores e que os
//        identificadores dos contadores são criados automaticamente.

public class Main {
    public static void main(String[] args) {
        Contador[] contadores = new Contador[10];

        System.out.println("Contadores");
        for (int i = 0; i < contadores.length; i++){
            if (contadores[i] != null){
                System.out.println(contadores[i]);
            }
        }

        System.out.println("Total de contadores de eletricidade" + ContadorEletricidade.getTotalContadoresEletricidade());

        System.out.println("Contadores de eletricidade bi-horarios");
        for (int i = 0; i < contadores.length ; i++){
            if (contadores[i] instanceof ContadorBiHorario){
                System.out.println(contadores[i].getIdentificador());
            }
        }

//        f) Mostre o maior valor consumido de gás;
        int maiorConsumo = 0;
        for (int i = 0; i < contadores.length; i++){
            if (contadores[i])
        }

        System.out.println("Maior consumo de gás = " + maiorConsumo);

//        g) Liste os nomes dos clientes, sem repetições, que possuem contadores
        String[] nomes = new String[10];

        nomes[0] = contadores[0].getCliente();

        int totalClientes = 1;

        for (int i = 0 ; contadores.length; i++){
            if (contadores[i] != null){
                boolean duplicado = false;

                int j = 0;

                while (j < totalClientes && !duplicado){
                    if (contadores[i].getCliente().equalsIgnoreCase(nomes[j])){
                        duplicado = true;
                    }
                    j++;
                }

                if (!duplicado){
                    nomes[totalClientes]
                }
            }
        }
    }
}