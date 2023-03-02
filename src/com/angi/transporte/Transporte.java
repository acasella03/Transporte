package com.angi.transporte;

public class Transporte {
    public static void main(String[] args) {

        ITransportable transporte = FactoriaTransporte.getTransporte(FactoriaTransporte.CAMION);
        System.out.println(transporte.costeTotal(36400));
        System.out.println(transporte.tipoEmbalaje(1f,0.8f,2.2f, 2000.0f));


    }
}