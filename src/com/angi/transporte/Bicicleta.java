/**
 * Define un tipo de transporte
 */
package com.angi.transporte;

public class Bicicleta implements ITransportable {

    public Bicicleta() {
    }


    @Override
    public double costeTotal(Integer cp) {
        return 0;
    }

    @Override
    public Integer tipoEmbalaje(Float dimX, Float dimY, Float dimZ, Float peso) {
        return null;
    }
}
