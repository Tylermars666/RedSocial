package co.edu.uniquindio.redsocial.model;

import co.edu.uniquindio.redsocial.structures.lista.ListaSimple;

import java.io.Serial;
import java.io.Serializable;

public class Muro implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private ListaSimple<Post> publicaciones;

    public Muro() {
        publicaciones = new ListaSimple<>();
    }


    public ListaSimple<Post> getPublicaciones() {
        return publicaciones;
    }

    public void setPublicacion(Post publicacion) {
        this.publicaciones.agregarfinal(publicacion);
    }
}
