import java.awt.font.FontRenderContext;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        2. Crie uma nova classe para invocar as funcionalidades implementadas. Para isso:
//        a) crie um conjunto de instâncias de utentes;

        Utente u1 = new Utente("Samara","Feminino",20,1.68,68);
        Utente u2 = new Utente();
        Utente u3 = new Utente("Joao",22);
        Utente u4 = new Utente("Maria Rita","Feminino",30,1.59,90);
        Utente u5 = new Utente("Daniel", "Masculino", 29,1.70,69);

//        b) armazene estas instâncias num contentor do tipo array
        Utente[] utente = new Utente[5];
        utente[0] = u1;
        utente[1] = u2;
        utente[2] = u3;
        utente[3] = u4;
        utente[4] = u5;

//        c) programe as seguintes listagens separadas, sobre o contentor para:
//        i. obter a representação textual e legível de cada utente;

        System.out.println("LISTA COMPLETA DE UTENTES");
        for(int i = 0; i < utente.length ; i++){
            if (utente[i] != null){
                System.out.println(utente[i].toString());
            }
        }

//        ii. obter o nome, valor do IMC e grau de obesidade de cada utente;

        System.out.println("LISTA COMPLETA DE UTENTES, IMC E GRAU DE OBESIDADE");
        for(int i = 0; i < utente.length ; i++){
            if (utente[i] != null){
                System.out.println("Nome:" + utente[i].getNome() + "\nIMC:" + utente[i].calculoIMC() + "\nGrau de Obesidade: " + utente[i].grauObesidade());
            }
        }

//        iii. obter o nome e o grau de obesidade de cada utente que não tenha a classificação “Saudável”.

        System.out.println("LISTA COMPLETA DE UTENTES QUE NÃO SÃO SAUDÁVEIS");
        for(int i = 0; i < utente.length ; i++){
            if (utente[i] != null && utente[i].utenteSaudavel()){
                System.out.println("Nome:" + utente[i].getNome() + "\nIMC:" + utente[i].calculoIMC() + "\nGrau de Obesidade: " + utente[i].grauObesidade());
            }
        }

//        d) altere os valores de referência do IMC para cálculo do grau de obesidade e volte a fazer a listagem com
//        o nome, valor do IMC e grau de obesidade de cada utente;

        System.out.println("ALTERAÇÃO DOS VALORES DE IMC");
        Utente.setMinIMC(20);
        Utente.setMaxIMC(28);

        for(int i = 0; i < utente.length ; i++){
            if (utente[i] != null){
                System.out.println("Nome:" + utente[i].getNome() + "\nIMC:" + utente[i].calculoIMC() + "\nGrau de Obesidade: " + utente[i].grauObesidade());
            }
        }

//        e) altere o valor da idade de um utente para o valor da idade de outro;

        System.out.println("ALTERAÇÃO DA IDADE DO UTENTE");
        for (int i = 0; i < utente.length; i++){
            if (utente[i] != null){
                utente[i].setIdade();
            }
    }
}
