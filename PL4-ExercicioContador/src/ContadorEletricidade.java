//Uma classe em que não é criado nenhum objeto a partir dela, tem que ser abstrata
public abstract class ContadorEletricidade extends Contador{
        private static final String PREFIXO_CONTADOR_ELETRICIDADE = "ELECT-";
        public static int totalContadoresEletricidade = 0;

        public ContadorEletricidade(String cliente, int consumo){
                super(PREFIXO_CONTADOR_ELETRICIDADE + (++totalContadoresEletricidade), cliente, consumo);
        }

        public ContadorEletricidade(String cliente){
                super(PREFIXO_CONTADOR_ELETRICIDADE + (++totalContadoresEletricidade), cliente);

        }

        public ContadorEletricidade(int consumo){
                super(PREFIXO_CONTADOR_ELETRICIDADE + (++totalContadoresEletricidade), consumo);
        }

        public ContadorEletricidade(){
                super(PREFIXO_CONTADOR_ELETRICIDADE + (++totalContadoresEletricidade));
        }

        public static int getTotalContadoresEletricidade(){return totalContadoresEletricidade;}


}
