public class ContadorBiHorario extends ContadorEletricidade{
    private double consumoHorasVazio, consumoHorasForaVazio;

    private static final int CONSUMO_POR_OMISSAO = 0;
    private static double custoHoraVazio = 0.06;
    private static double custoHoraForaVazio = 0.14;

    public ContadorBiHorario(String cliente, double consumoHorasVazio, double consumoHorasForaVazio){
        super(cliente,consumoHorasForaVazio);
        this.consumoHoraVazio = consumoHorasVazio;
    }

    public ContadorBiHorario(ouble consumoHorasVazio, double consumoHorasForaVazio){
        super(consumoHorasForaVazio);
        this.consumoHoraVazio = consumoHorasVazio;
    }

    public ContadorBiHorario(){
        super();
        consumoHorasVazio = CONSUMO_POR_OMISSAO;
    }

    public int getConsumoHorasVazio(){return consumoHorasVazio;}

    public int getConsumoHorasForaVazio(){return consumoHorasForaVazio;}

    public int setConsumoHorasForaVazio(double consumoHorasForaVazio){this.consumoHorasForaVazio = consumoHorasForaVazio;}

    public

    @Override
    public double calcularCustoConsumo() {
        return custoHoraForaVazio * getConsumo();
    }
}
