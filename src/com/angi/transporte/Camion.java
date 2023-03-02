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
     * @return los datos del embalaje
     */
    @Override
    public Integer tipoEmbalaje(Float dimX, Float dimY, Float dimZ, Float peso) {
        Integer tipo = null;
        switch (tipo) {
            case 0:
                System.out.println("Palet");
                break;
            case 1:
                System.out.println("Caja de Cartón");
                break;
            case 2:
                System.out.println("Caja de Madera");
                break;
            default:
                return null;
        }
        return tipo;
    }

}
