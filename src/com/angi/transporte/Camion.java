/**
 * Define un tipo de transporte
 */
package com.angi.transporte;

public class Camion implements ITransportable {
    /**
     * Constructor
     */
    public Camion() {
    }

    /**
     * Método que calcula el coste total del envío del paquete.
     *
     * @param cp Código Posta de destino
     * @return coste total
     */
    @Override
    public Float costeTotal(Integer cp) {
        Float coste = null;
        if (CP > cp) {
            coste = Float.valueOf((CP - cp) * 1.0f);
        } else {
            coste = Float.valueOf((cp - CP) * 1.0f);
        }
        return coste;
    }

    /**
     * Método que indica el tamaño de embalaje del paquete.
     *
     * @param dimX largo del paquete
     * @param dimY alto del paquete
     * @param dimZ ancho del paquete
     * @param peso del paquete
     * @return tipo de embalaje 0=palet, 1=caja de cartón, 2=caja de madera
     */
    @Override
    public Integer tipoEmbalaje(Float dimX, Float dimY, Float dimZ, Float peso) {
        Integer tipo = null;
        Float volumen = dimX * dimY * dimZ;
        if (volumen >= 1000) {
            return 0;
        } else {
            if (peso < 5) {
                return 1;
            } else {
                return 2;
            }
        }
    }
}
