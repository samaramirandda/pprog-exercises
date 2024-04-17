//Crie uma classe de nome Tempo com os atributos hora, minuto e segundo, sendo zero o valor por omissão.
//        Esta classe deve disponibilizar funcionalidades que permitam:


import static java.lang.Math.abs;

public class Tempo {

    private int hora,minuto,segundo;

    private static int HORA_POR_OMISSAO = 0;
    private static int MINUTO_POR_OMISSAO = 0;

    private static int SEGUNDO_POR_OMISSAO = 0;

    public Tempo(int hora, int minuto, int segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Tempo(int hora,int minuto){
        this.hora = HORA_POR_OMISSAO;
        this.minuto = MINUTO_POR_OMISSAO;
        this.segundo = SEGUNDO_POR_OMISSAO;
    }

    public int getHora(){
        return this.hora;
    }

    public void setHora(int hora){
        this.hora = hora;
    }

    public int getMin(){
        return this.minuto;
    }

    public void setMin(int minuto){
        this.minuto = minuto;
    }

    public int getSeg(){
        return segundo;
    }

    public void setSeg(int segundo){
        this.segundo = segundo;
    }

//        a) Obter o estado de uma instância Tempo no formato:
//        § "hh:mm:ss";
//        § "hh:mm:ss AM (ou PM)".

    public String toString() {
        String periodo = (hora < 12)? "AM" : "PM";
        int novaHora = (hora > 12) ? hora - 12 : hora;
        return String.format("%02d:%02d,%02d %s",hora,minuto,segundo,periodo);
    }

//    b) Acrescentar 1 segundo a um dado tempo.

    public void acrescentarTempo(){
        segundo++;

        if (segundo >= 60){
            segundo = 0;
            minuto++;

            if (minuto >= 60){
                minuto = 0;
                hora++;
            }

            if (hora >= 24){
                hora = 0;
            }
        }
    }

//    c) Verificar se um dado tempo é maior do que outro. Este tempo deve poder ser representado por
//    uma instância de Tempo ou pelos valores simples das horas, minutos e segundos.

    public int toSegundos(){
        return hora * 3600 + minuto * 60 + minuto;
    }

    public boolean maiorTempo(Tempo outroTempo){
        return this.toSegundos() > outroTempo.toSegundos();
    }

//    d) Determinar a diferença entre dois tempos fornecidos:
//            § em segundos;
//      § em Tempo.

    public int diferencaTempo(Tempo outroTempo){
        return abs(this.toSegundos() - outroTempo.toSegundos());
    }


}
