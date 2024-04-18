package org.example;

public abstract class Empregados {
    private float RT;

    public float getRT(){ return RT; }

    public void setRT(float RT){
        this.RT = RT;
    }

    public float calcularImposto(){
        return calcularTaxaRT() + calcularTaxaOT();
    }

    public abstract float calcularTaxaRT();

    public abstract float calcularTaxaOT();

}
