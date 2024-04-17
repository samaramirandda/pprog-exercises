//Exercício Escola
//Uma escola pretende um programa para auxiliar o cálculo dos valores mensais a pagar a alguns dos seus
//elementos: professores e alunos. Os professores que lecionam na escola recebem mensalmente um salário.
//Os alunos que sejam bolseiros recebem mensalmente uma bolsa. No entanto, os alunos que não sejam
//bolseiros não recebem nada.
//Os professores e alunos são caraterizados pelo seu nome e número de identificação civil. Um professor é
//caraterizado também pela sua categoria, que pode ser uma entre: Assistente, Adjunto ou Coordenador. Um
//aluno é também caraterizado pelo seu número mecanográfico.
//O salário mensal de um professor é determinado pelo valor de um salário base, que é igual para todos os
//professores, acrescido de um valor extra associado à sua categoria. O valor do salário base pode ser alterado,
//tal como o valor da majoração associado a cada categoria. Assuma que o valor do salário base é de 1500€ e
//que o valor da majoração, aplicada sobre o valor do salário base, é de 20% para os adjuntos e 50% para os
//coordenadores. Os assistentes não têm majoração.
//O valor da bolsa mensal é diferente entre alunos bolseiros, ainda que o valor da mesma possa ser alterado.
//Elabore as classes representativas dos elementos da escola, usando o seguinte procedimento:
//2. Implemente as entidades e as relações do diagrama;

package org.example;

import java.nio.file.FileSystemNotFoundException;
import java.util.SequencedSet;

public class Main {
    public static void main(String[] args) {

        // a) Construa objetos de cada uma das classes instanciáveis e guarde-os num contentor do tipo array
        Escola[] escola = new Escola[5];
        escola[0] = new Professor("Maria", 1928, "adjunto");
        escola[1] = new Professor("Antonio", 1283, "Coordenador");
        escola[2] = new Aluno("Priscila", 1329, 123);
        escola[3] = new Aluno("Lucas", 1923, 122);

        // b) Liste o nome e categoria dos professores armazenado no contentor
        System.out.println("PROFESSORES");
        for (int i = 0; i < escola.length ; i++){
            if (escola[i] instanceof Professor){
                System.out.println("Nome: " + ((Professor) escola[i]).getNome() + "Categoria: " + ((Professor) escola[i]).getCategoria());
            }
        }

//        c)Liste o número mecanográfico de todos os alunos que não são bolseiros;
        System.out.println("NUMERO MECANOGRAFICO DOS ALUNOS NAO BOLSEIROS");
        for (int i = 0; i < escola.length; i++){
            if (escola[i] instanceof Aluno){
                if (!((Aluno) escola[i]).isBolseiro()){
                    System.out.println(((Aluno) escola[i]).getNumeroMecanografico());
                }
            }
        }

//        d) Liste os nomes dos professores e alunos, armazenados no contentor. A listagem deve incluir, para cada
//        objeto, a designação da classe

        System.out.println("LISTAGEM DE TODOS OS ELEMENTOS DA ESCOLA");
        for (int i = 0; i < escola.length; i++){
            System.out.println(escola[i].toString());
        }

//        e) Liste os nomes e valores dos salários dos professores armazenados no contentor;
        System.out.println("Nomes e Valores dos Salários dos Professores");
        for (int i = 0; i < escola.length;i++){
            if (escola[i] instanceof Professor){
                System.out.println("Nome: " + escola[i].getNome() + "Salário: " + ((Professor) escola[i]).calcularVencimento());
            }
        }

//        f) Liste os nomes e valores das bolsas dos alunos bolseiros armazenados no contentor;

        System.out.println("Nomes e Valores das Bolsas dos Alunos");
        for (int i = 0; i < escola.length; i++){
            if (escola[i] instanceof Aluno){
                System.out.println("Nome" + escola[i].getNome() + "Valor da Bolsa" + escola[i].calcularVencimento());
            }
        }

//        g) Mostre os valores totais dos encargos com: professores e alunos bolseiros. O total dos encargos da
//        escola deve também ser apresentado.


    }
}