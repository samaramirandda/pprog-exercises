import java.util.Scanner;

public class Main {
    Scanner ler = new Scanner(System.in);

    System.out.println("Insira o seu nome: ");
    String nome = ler.nextLine();

    System.out.println("Insira a sua idade: ")
    int idade = ler.nextInt();

    Pessoa p = new Pessoa(nome,idade);

    System.out.println("\n" + p);
}
