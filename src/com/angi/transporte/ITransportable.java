package com.angi.transporte;

/**
 * Interface que tiene los métodos comunes a todos tipos de transporte.
 */
public interface ITransportable {
    /**
     * Indica un código postal.
     */
    static final int CP = 36500;

    /**
     * método que calcula el coste total del envío del paquete.
     */
    Float costeTotal(Integer cp);

    /**
     * método que indica el tipo de embalaje del paquete.
     */
    TipoEmbalaje tipoEmbalaje(Float dimX, Float dimY, Float dimZ, Float peso);
}
