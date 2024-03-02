package edu.katheryn_azano.reto5.ejercicio1;

import edu.katheryn_azano.reto5.ejercicio1.Propiedad;
import edu.katheryn_azano.reto5.ejercicio1.Ubicacion;

import java.util.ArrayList;
import java.util.List;

public class Buscador {

    private final List<Propiedad> propiedades;

    public Buscador(List<Propiedad> propiedades) {
        this.propiedades = propiedades;
    }

    public List<Propiedad> buscarPropiedadesCercanas(Ubicacion ubicacion) {
        // Suponiendo que la clase Propiedad tiene un método getCoordenadas() que devuelve un objeto Ubicacion
        // Debes implementar la lógica para determinar si la propiedad está cerca de la ubicación
        // Aquí simplemente agregamos todas las propiedades a propiedadesCercanas
        return new ArrayList<>(propiedades);
    }

    public List<Propiedad> buscarPropiedadesPorFiltro(String filtro) {
        List<Propiedad> propiedadesFiltradas = new ArrayList<>();
        for (Propiedad propiedad : propiedades) {
            // Suponiendo que la clase Propiedad tiene un método que devuelve el tipo de propiedad
            // Debes implementar la lógica para filtrar las propiedades según el filtro proporcionado
            if (propiedad.getTipoDePropiedad().equalsIgnoreCase(filtro)) {
                propiedadesFiltradas.add(propiedad);
            }
        }
        return propiedadesFiltradas;
    }
}
