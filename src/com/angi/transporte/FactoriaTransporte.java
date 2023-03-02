package com.angi.transporte;

public class FactoriaTransporte {
    public static final int CAMION = 1;
    public static final int BICICLETA = 2;

    public static ITransportable getTransporte(int tipoTransporte){
        switch (tipoTransporte){
            case CAMION:
                return new Camion();
            case BICICLETA:
                return new Bicicleta();
            default:
                return null;
        }
    }
}
