package com.angi.transporte;

public class Transporte {

    public static void main(String[] args) {

        ITransportable transporte = FactoriaTransporte.getTransporte(FactoriaTransporte.CAMION);
        System.out.println("Coste Total= "+transporte.costeTotal(46000));
        System.out.println("Tipo de Embalaje: "+transporte.tipoEmbalaje(1f,0.8f,2.2f, 50.0f));


    }
}