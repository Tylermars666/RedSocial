package co.edu.uniquindio.redsocial.model;

import co.edu.uniquindio.redsocial.structures.lista.ListaSimple;

import java.io.Serial;
import java.io.Serializable;

public class Admin extends Usuario implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public Admin() {
    }

    public Admin(String nombre, String id, Muro muro, String usuario, String clave, String apellido) {
        super(nombre, id, muro, usuario, clave, apellido);
    }
}
