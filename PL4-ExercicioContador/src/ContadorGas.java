//public class ContadorGas extends Contador {
//    private static final String PREFIXO_CONTADOR_GAS = "GAS";
//    private int totalContadoresGas = 0;
//    private static double custoM3 = 0.08;
//
//    public ContadorGas(String cliente, double consumo){
//        super(PREFIXO_CONTADOR_GAS + (++totalContadoresGas), cliente, consumo);
//    }
//
//    public ContadorGas(String cliente){
//        super(cliente);
//        consumo =
//    }
//
//    @Override
//    public double calcularCustoConsumo() {
//        return getConsumo() * custoM3;
//    }
//}


public class ContadorGas extends Contador {

    public static final String PREFIXO_CONTADOR_ELETRICIDADE ="GAS-";
    private static double custoM3 = 0.8f;
    public static int totalContadoresEletricidade = 0;
    public ContadorGas (String cliente, float consumo) {
        super(PREFIXO_CONTADOR_ELETRICIDADE + (++totalContadoresEletricidade), cliente, consumo);
    }
    public ContadorGas() {
        super(PREFIXO + (++contGas));
    }

    @Override
    public String toString() {
        return String.format("Tipo do contador doméstico: Gás%n%s", super.toString());
    }

    public static float getCustoGas() {
        return custoGas;
    }
    public static int getContGas() {
        return contGas;
    }

    @Override
    public double calcularCustoConsumo () {
        return custoGas * consumo;
    }
}
