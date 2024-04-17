//Uma empresa de distribuição de gás e eletricidade pretende um programa para fazer a gestão de contadores
//        domésticos. Os contadores existentes são de três tipos: gás, eletricidade com tarifário simples e eletricidade
//        com tarifário bi-horário. Os contadores registam apenas o consumo do mês atual (número inteiro), sendo o
//        gás medido em m3 e a eletricidade em kWh. Os contadores bi-horários registam dois consumos do mês atual:
//        nas horas de vazio e fora das horas de vazio. Cada contador tem uma identificação que distingue os contadores
//        de gás dos de eletricidade, com o seguinte formato: GAS-X e ELECT-Y, sendo X e Y números inteiros desde 1.
//        Por exemplo, GAS-1, GAS-2, ELECT-1, ELECT-2, etc.
//        Elabore as classes representativas dos contadores, usando o seguinte procedimento:
//        1. Esboce um diagrama de classes, em notação UML, considerando que as classes dos contadores devem
//        permitir calcular o custo do consumo registado. O custo do consumo de gás é dado pela seguinte
//        fórmula: custo unitário x consumo, sendo o custo unitário igual a 0.8€/m3. O custo do consumo de
//        eletricidade é baseado na tabela abaixo. Assumir que os custos unitários poderão ser atualizados no
//        futuro, que pode ser preciso listar os nomes dos clientes que possuem contadores e que os
//        identificadores dos contadores são criados automaticamente.
        public abstract class Contador {

        private String cliente, identificador;
        private int consumo;

        private static final String IDENTIFICADOR_POR_OMISSAO = "sem identificador";
        private static final String CLIENTE_POR_OMISSAO = "sem cliente";
        private static final int CONSUMO_POR_OMISSAO = 0;

        public Contador(String identificador,String cliente,int consumo){
                this.identificador = identificador;
                this.cliente = cliente;
                this.consumo = consumo;
        }

        public Contador(String identificador, int consumo){
                this.identificador = identificador;
                cliente = CLIENTE_POR_OMISSAO;
                this.consumo = consumo;
        }
        public Contador(String identificador, String cliente){
                this.identificador = identificador;
                this.cliente = cliente;
                consumo = CONSUMO_POR_OMISSAO;
        }

        public Contador(String identificador){
                this.identificador = identificador;
                cliente = CLIENTE_POR_OMISSAO;
                consumo = CONSUMO_POR_OMISSAO;
        }

        public String getIdentificador(){return this.identificador;}

        public int getConsumo(){return this.consumo;}

        public String getCliente(){return this.cliente;}

        public void setConsumo(int consumo){this.consumo = consumo;}

        public void setCliente(String cliente){this.cliente = cliente;}

        public abstract double calcularCustoConsumo();

        @Override
        public String toString(){return "Identificador:" + identificador + "Consumo do mês:" + consumo;}


}
