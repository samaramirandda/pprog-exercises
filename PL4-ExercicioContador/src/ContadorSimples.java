public class ContadorSimples extends ContadorEletricidade{
    private double potencia;
    private static double custoKWH1 = 0.13;
    private static double custoKWH2 = 0.16;
    private static final double POTENCIA_POR_OMISSAO = 6.9;

    public ContadorSimples(String cliente, int consumo, double potencia){
        super(cliente, consumo);
        this.potencia = potencia;
    }

    public ContadorSimples(String cliente,  double potencia){
        super(cliente);
        this.potencia = potencia;

    }
    public ContadorSimples(String cliente){
        super(cliente);
        potencia = POTENCIA_POR_OMISSAO;
    }

    public ContadorSimples(double potencia){
        super();
        this.potencia = potencia;
    }

    public double getPotencia(){return potencia;}

    public void setPotencia(double potencia){this.potencia = potencia;}

    public String toString(){
        return String.format("Contador de eletricidade de tarifariio simples" , super.toString(), potencia);
    }

    public float

    @Override
    public double calcularCustoConsumo() {
        return determinarCustoHora() + getConsumo();
    }

    private double determinarCustoHora(){
        return (potencia < POTENCIA_POR_OMISSAO) ? custoKWH1 : custoKWH2;
    }


}
