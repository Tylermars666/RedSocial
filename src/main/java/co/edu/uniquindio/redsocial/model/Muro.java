package co.edu.uniquindio.redsocial.model;

import co.edu.uniquindio.redsocial.structures.lista.ListaSimple;

import java.io.Serializable;

public class Muro implements Serializable {

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
