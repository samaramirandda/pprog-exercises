//Um utente de ginásio tem como atributos o nome, género, idade, altura e peso. Implemente uma classe
//        em JAVA para criar instância de utente, que disponibilize as seguintes funcionalidades:
//1º variaveis de instancia
//2º constantes
//3º variaveis de classe
//4º construtores
//5º gets de instancia
//6º sets de instancia
//7º metodo toString
//8º metodos de instancia
//9º metodos de classe

public class Utente {

//    O private é usado para tornar as variáveis individuais para cada classe
    private String nome,genero;
    private int idade;
    private float peso;
    private double altura;

//    O final é usado para tornar a variável constante, sem que o valor possa ser alterado
    private static final String NOME_POR_OMISSAO = "Sem nome";
    private static final String GENERO_POR_OMISSAO = "Sem Género";
    private static final int IDADE_POR_OMISSAO = 0;
    private static final double ALTURA_POR_OMISSAO = 0;
    private static final float PESO_POR_OMISSAO = 0;

    private static int totalUtentes;
    private static int minIMC = 18;
    private static int maxIMC = 25;



//a) construtores (pelo menos):
//        § vazio. O valor por omissão para cada atributo deve estar representado numa constante;
//        § com dois parâmetros: nome e idade;
//        § completo

    public Utente(String nome, String genero, int idade, double altura, float peso){
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        totalUtentes++;
    }

    public Utente(String nome, int idade){
        this.nome = nome;
        genero = GENERO_POR_OMISSAO;
        this.idade = idade;
        altura = ALTURA_POR_OMISSAO;
        peso = PESO_POR_OMISSAO;
        totalUtentes++;
    }

    public Utente(){
        nome = NOME_POR_OMISSAO;
        genero = GENERO_POR_OMISSAO;
        idade = IDADE_POR_OMISSAO;
        altura = ALTURA_POR_OMISSAO;
        peso = PESO_POR_OMISSAO;
        totalUtentes++;
    }

//    b) métodos para aceder individualmente aos atributos de um utente;

    public String getNome(){
        return this.nome;
    }

    public String getGenero(){
        return this.genero;
    }

    public int getIdade(){
        return this.idade;
    }

    public double getAltura(){
        return this.altura;
    }

    public float getPeso(){
        return this.peso;
    }

//    c) métodos para alterar individualmente os atributos de um utente;

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public void setPeso(float peso){
        this.peso = peso;
    }

//    d) obter a representação textual e legível de um utente;

    public String toString(){
        return String.format("Nome do utente: %s\nGenero: %s\nIdade: %d\nAltura: %.1f\nPeso: %.1f",
                this.nome, this.genero, this.idade, this.altura, this.peso);
    }

//    e) determinar a diferença de idades (valor relativo) entre dois utentes;

    public int diferencaIdade(Utente outraIdade){
//        Objeto do tipo utente com outra idade
        return Math.abs(this.idade - outraIdade.idade);
    }

//    f) calcular o índice de massa corporal (IMC) de um utente de acordo com a fórmula abaixo apresentada.
//    As unidades de medida do peso e da altura são o quilograma e o metro, respetivamente;
//    IMC = Peso/(Altura)^2

    public float calculoIMC(){
        return (altura!=0) ? peso/(float) Math.pow(altura,2):0;
    }

//    g) determinar o grau de obesidade de um utente de acordo com a tabela seguinte. No entanto, os valores
//    de referência do IMC podem sofrer alterações;

    public String grauObesidade(){
       float IMC = this.calculoIMC();

        if (IMC < minIMC){
            if (IMC == 0){
                return "Indeterminado";
            }else return "Magro";
        }

        else if(IMC >= minIMC || IMC <= maxIMC){
            return "Saudável";

        }
        return "Obeso";
    }

//    h) verificar se um utente tem, relativamente ao grau de obesidade, a classificação “Saudável”

    public boolean utenteSaudavel(){
//        Não precisamos inicializar as variáveis por parametro, pois estes metodos são de instância
        float IMC = calculoIMC();

//        Se o IMC estiver dentro desses parametros, a função retorna true
        return IMC >= minIMC && IMC <= maxIMC;
    }

//    i) determinar entre dois utentes qual é o mais novo. Se ambos tiverem a mesma idade deve ser
//    retornado um valor indicador desta situação;

    public Utente maisNovo(Utente outroUtente){
//        Se a idade o utente da classe for menor que a idade do utente recebido por parametro, retorna o utente da classe
//        Se a idade do utente da classe for mais que a idade do utente recebido por parametro, retorna o utente recebido por parametro
        return this.idade < outroUtente.idade ? this : (this.idade > outroUtente.idade ? outroUtente : null);
    }

//    j) obter o número de instância de utente criadas.

    public static int totalUtentes(){
        return totalUtentes;
    }

    public static void setMinIMC(int newMinIMC){
        minIMC = newMinIMC;
    }

    public static void setMaxIMC(int newMaxIMC){
        maxIMC = newMaxIMC;
    }
}

