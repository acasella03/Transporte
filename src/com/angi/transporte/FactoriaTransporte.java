package com.angi.transporte;

/**
 * Se encarga de almacenar la elección de los tipos de transportes.
 */

public class FactoriaTransporte {
    /**
     * Opción camión.
     */
    public static final int CAMION = 1;
    /**
     * Opción bicicleta.
     */
    public static final int BICICLETA = 2;

    /**
     * Método para seleccionar el tipo de transporte.
     *
     * @param tipoTransporte opción elegida.
     * @return tipo de transporte elegido.
     */
    public static ITransportable getTransporte(int tipoTransporte) {
        switch (tipoTransporte) {
            case CAMION:
                return new Camion();
            case BICICLETA:
                return new Bicicleta();
            default:
                return null;
        }
    }
}
