public class MainVencimentos {

//              2. Crie uma nova classe, chamada MainVencimentos, para invocar as funcionalidades implementadas.
//              3. Nesta classe, crie 3 objetos, um para cada tipo de trabalhador:
//              Objeto do tipo TrabalhadorPeca, de nome Jorge Silva que produziu 53 peças do tipo 1 e 62 do
//              tipo 2;
//              Objeto do tipo TrabalhadorComissao, de nome Susana Ferreira, com o salário base de 650,00€
//              e uma comissão de 4,25% sobre as vendas efetuadas que totalizaram o valor de 2731,50€;
//              Objeto do tipo TrabalhadorHora, de nome Carlos Miguel, que ganha por hora 4,50€ e com um
//              total de horas de trabalho igual a 168.

    public static void main(String[] args) {

        TrabalhadorPeca tPeca = new TrabalhadorPeca("Jorge Silva",53,62);
        TrabalhadorComissao tComissao = new TrabalhadorComissao("Susana Ferreira",650,(float)2731.50,(float)116.08);
        TrabalhadorHora tHora = new TrabalhadorHora("Carlos Miguel",168,(float)4.5);

//        4. Crie um contentor de objetos para guardar os objetos existentes. Este contentor deve ser um array do
//            tipo Object com comprimento 10.
//        5. Guarde os objetos existentes no contentor

        Trabalhador[] trabalhador = new Trabalhador[10];
        trabalhador[0] = tPeca;
        trabalhador[1] = tComissao;
        trabalhador[2] = tHora;

//        6. Programe as seguintes listagens independentes, obtidas através do varrimento do contentor com uma
//        instrução for tradicional:

//        Listagem das representações textuais dos trabalhadores;
        for(int i = 0; i < trabalhador.length; i++){
            if (trabalhador[i] != null){
                System.out.printf("\n%s\n",trabalhador[i]);
            }
        }

//        Listagem das representações textuais apenas dos trabalhadores à hora;
        for (int i = 0; i < trabalhador.length; i++){
            if (trabalhador[i] != null && trabalhador[i] instanceof TrabalhadorHora){
                    System.out.printf("\nNOME DOS TRABALHADORES Á HORA\n%s",trabalhador[i]);
            }
        }

//        Listagem dos nomes dos trabalhadores existentes, acompanhadas dos respetivos vencimentos
//                (com duas casas decimais).
        for (int i = 0; i < trabalhador.length; i++){
            if (trabalhador[i]!= null){
                System.out.printf("\nNome: %s | Vencimentos:%.2f\n",trabalhador[i].getNome(),trabalhador[i].calcularVencimento());
            }
        }


    }
}
