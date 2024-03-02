package edu.katheryn_azano.reto5.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {

    private List<Contacto> contactos;

    public AgendaTelefonica() {
        contactos = new ArrayList<>();
    }

    public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    public void eliminarContacto(Contacto contacto) {
        contactos.remove(contacto);
    }

    public void modificarContacto(Contacto contacto) {
        // TODO: Implementar este método.
    }

    public Contacto buscarContacto(String nombre) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre)) {
                return contacto;
            }
        }
        return null;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

}
