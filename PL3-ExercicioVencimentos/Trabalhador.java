//        As classes Trabalhador, TrabalhadorPeca, TrabalhadorComissao e TrabalhadorHora foram construídas com
//                base na necessidade de desenvolver um programa que calculasse os vencimentos mensais dos seguintes tipos
//                de trabalhadores:
//                Trabalhador à peça (TrabalhadorPeca): vencimento dependente do número de peças produzidas.
//                Foram considerados dois tipos de peças e com pagamentos diferentes, sendo atualmente estes
//                pagamentos iguais a 6,50€ e 9,50€;
//                Trabalhador à comissão (TrabalhadorComissao): vencimento igual a um salário base mais uma
//                percentagem das vendas. Foi considerado, por omissão, o salário base de 635,00€;
//                Trabalhador à hora (TrabalhadorHora), vencimento proporcional às horas de trabalho. Foi
//                considerado, por omissão, o pagamento à hora de 10,00€.
//                Para tal, definiu-se uma classe para cada tipo de trabalhador com uma implementação apropriada do método
//                calcularVencimento() e uma superclasse com o nome Trabalhador.
//                Analise o código destas classes e depois faça o seguinte:
//              1. Esboce um diagrama de classes, em notação UML, ilustrando todas as classes fornecidas.
//              2. Crie uma nova classe, chamada MainVencimentos, para invocar as funcionalidades implementadas.
//              3. Nesta classe, crie 3 objetos, um para cada tipo de trabalhador:
//              Objeto do tipo TrabalhadorPeca, de nome Jorge Silva que produziu 53 peças do tipo 1 e 62 do
//              tipo 2;
//              Objeto do tipo TrabalhadorComissao, de nome Susana Ferreira, com o salário base de 650,00€
//              e uma comissão de 4,25% sobre as vendas efetuadas que totalizaram o valor de 2731,50€;
//              Objeto do tipo TrabalhadorHora, de nome Carlos Miguel, que ganha por hora 4,50€ e com um
//              total de horas de trabalho igual a 168.

/**
 * Esta classe permite a construção de uma hierarquia de classes para
 * representarem diferentes tipos de trabalhadores. Especifica membros
 * comuns a todas as classes da hierarquia.
 *
 * @author ISEP-DEI-PPROG
 */

public abstract class Trabalhador {

    /**
     * O nome do trabalhador.
     */
    private String nome;

    /**
     * O nome por omissão do trabalhador.
     */
    private static final String NOME_POR_OMISSAO = "sem nome";

    /**
     * Inicializa o nome do trabalhador com o nome recebido.
     *
     * @param nome o nome do trabalhador
     */
    public Trabalhador(String nome) {
        this.nome = nome;
    }

    /**
     * Inicializa o nome do trabalhador com o nome por omissão.
     */
    public Trabalhador() {
        nome = NOME_POR_OMISSAO;
    }

    /**
     * Devolve o nome do trabalhador.
     *
     * @return nome do trabalhador
     */
    public String getNome() {
        return nome;
    }

    /**
     * Modifica o nome do trabalhador.
     *
     * @param nome o novo nome do trabalhador
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Devolve o nome do trabalhador.
     *
     * @return nome do trabalhador
     */
    @Override
    public String toString() {
        return nome;
    }

    /**
     * Permite o cálculo do vencimento do trabalhador através do polimorfismo.
     *
     * @return vencimento do trabalhador
     */
    public abstract float calcularVencimento();
}

