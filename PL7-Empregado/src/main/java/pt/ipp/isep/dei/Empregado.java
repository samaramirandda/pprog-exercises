package pt.ipp.isep.dei;

import pt.ipp.isep.dei.Tempo;
import pt.ipp.isep.dei.Data;

public class Empregado {

    private String primeiroNome, ultimoNome;
    private Data dataContrato;
    private Tempo horaEntrada;
    private Tempo horaSaida;

    public Empregado(String primeiroNome, String ultimoNome, int anoContrato, int mesContrato, int diaContrato, int horaEntrada, int minutoEntrada, int horaSaida, int minutoSaida) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.dataContrato = new Data(anoContrato, mesContrato, diaContrato);
        this.horaEntrada = new Tempo(horaEntrada, minutoEntrada);
        this.horaSaida = new Tempo(horaSaida, minutoSaida);
    }

    public Data getDataContrato() {
        return new Data(dataContrato);
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }


    public void setHoraEntrada(Tempo horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public void setHoraSaida(Tempo horaSaida) {
        this.horaSaida = horaSaida;
    }

    public void setDataContrato(Data dataContrato) {
        this.dataContrato.setData(dataContrato.getAno(), dataContrato.getMes(), dataContrato.getDia());
    }

    public void setDataContrato(int ano, int mes, int dia) {
        this.dataContrato.setData(ano, mes, dia);
    }
    public float calcularHorasSemanais() {
        final int NUMERO_HORAS_DIA = 24;
        final int NUMERO_SEGUNDOS_HORA = 3600;
        final int NUMERO_DIAS_TRABALHO_SEMANA = 5;

        int segundos = horaSaida.diferencaEmSegundos(horaEntrada);

        if (horaEntrada.isMaior(horaSaida)) {
            segundos = NUMERO_HORAS_DIA * NUMERO_SEGUNDOS_HORA - segundos;
        }
        return (float) segundos / NUMERO_SEGUNDOS_HORA * NUMERO_DIAS_TRABALHO_SEMANA;
    }

    public int calcularAntiguidade() {
        Data dataAtual = Data.dataAtual();

        int anos = dataAtual.getAno() - dataContrato.getAno();
        if (anos > 0 && (dataContrato.getMes() > dataAtual.getMes() ||
                (dataContrato.getMes() == dataAtual.getMes() && dataContrato.getDia() > dataAtual.getDia()))) {
            anos--;
        }
        return anos;
    }
}
