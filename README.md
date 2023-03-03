# FACTORIA DE TRANSPORTE
## Se trata de una aplicación que permita calcular el coste y el tipo de embalaje de acuerdo a un tipo de transporte.

### Interfaz ITransportable:
Se encarga de crear un protocolo con declaración pública de lo que van a realizar las Clases de los tipos de transportes.

```
Float costeTotal(Integer cp);
Integer tipoEmbalaje(Float dimX, Float dimY, Float dimZ, Float peso);
```

![Interfaz](https://github.com/acasella03/Transporte/blob/main/ITransportable.jpg)

### Clase Camion:
Se encarga de desarrollar los métodos costeTotal y tipoEmpalaje de acuerdo a las especificaciones propias de éste tipo de transporte.

```
public Float costeTotal(Integer cp) {
        Float coste = null;
        if (CP > cp) {
            coste = Float.valueOf((CP - cp) * 0.9f);
        } else {
            coste = Float.valueOf((cp - CP) * 1.0f);
        }
        return coste;
    }

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
```

### Clase Bicicleta:
Se encarga de desarrollar los métodos costeTotal y tipoEmpalaje de acuerdo a las especificaciones propias de éste tipo de transporte.

```
public Float costeTotal(Integer cp) {
        Float coste = null;
        if (CP > cp) {
            coste = Float.valueOf((CP - cp) * 0.10f);
        } else {
            coste = Float.valueOf((cp - CP) * 0.1f);
        }
        return coste;
    }

public Integer tipoEmbalaje(Float dimX, Float dimY, Float dimZ, Float peso) {
        Float volumen = dimX * dimY * dimZ;
        if (volumen <= 10 && peso < 5) {
            return 1;
        }
        return 2;
    }
```

### Clase Factoria Transporte:
Se encarga generar las opciones correspondientes a los tipos de transporte para poder seleccionar cualquiera de ellas.

```
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
```

![Clase FactoriaTransporte](https://github.com/acasella03/Transporte/blob/main/FactoriaTransporte.jpg)

### Clase Transporte(main):
Se encarga de desarrollar la aplicación calculando el coste y tipo de embalaje de acuerdo a un tipo de transporte especificado, instanciando sólo un objeto de tipo ITransportable.

### Diagrama de Clases:
![DiagramaClases](https://github.com/acasella03/Transporte/blob/main/FactoriaDeTransporte.jpg)
