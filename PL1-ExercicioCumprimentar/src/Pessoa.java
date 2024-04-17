import java.util.Scanner;

public class Pessoa {

        private String nome;
        private int idade;
        private static final String NOME_POR_OMISSAO = "sem nome";
        private static final int IDADE_POR_OMISSAO = 0;

        //Altere o programa para que seja criado um objeto representativo da pessoa, com apenas um atributo - o
        //seu nome. O programa deve implementar:
        //▪ Dois construtores:
        //▪ Sem parâmetros;
        //▪ Com um parâmetro para receber o nome da pessoa.
        //▪ Métodos de consulta e de modificação do nome;
        //▪ Método toString que devolva uma string com a representação interna do objeto (exemplo: "O
        //nome é Maria").
        public Pessoa(String nome){
            this.nome = nome;
        }

        public Pessoa(){
            nome = NOME_POR_OMISSAO;
        }

        public String getNome(){
            return nome;
        }

        public void setNome(String nome){
            this.nome = nome;
        }

        //Modifique novamente o programa, acrescentando o atributo idade ao objeto representativo da pessoa. O
        //novo programa deve incluir:
        //▪ Construtor que receba como parâmetros o nome e a idade da pessoa;
        //▪ Métodos de consulta e de modificação da idade;
        //▪ Método toString que devolva uma string legível para o utilizar contendo o nome e a idade da
        //pessoa, como por exemplo: "Maria tem 14 anos."

        public Pessoa(String nome, int idade){
            this.nome = nome;
            this.idade = idade;
        }

        public int getIdade(){
            return idade;
        }

        public void setIdade(int idade){
            this.idade = idade;
        }

        public String toString(){
            return String.format("%s tem %d anos", this.nome, this.idade);
        }
}

