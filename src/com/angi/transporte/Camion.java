package com.angi.transporte;

/**
 * Define el tipo de transporte camión.
 */
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
            coste = Float.valueOf((CP - cp) * 0.9f);
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
     * @return tipo de embalaje
     */
    @Override
    public TipoEmbalaje tipoEmbalaje(Float dimX, Float dimY, Float dimZ, Float peso) {
        Integer tipo = null;
        Float volumen = dimX * dimY * dimZ;
        if (volumen >= 1000) {
            return TipoEmbalaje.PALET;
        } else {
            if (peso < 5) {
                return TipoEmbalaje.CAJA_CARTON;
            } else {
                return TipoEmbalaje.CAJA_MADERA;
            }
        }
    }
}
