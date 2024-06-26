package co.edu.uniquindio.redsocial.model;

import java.io.Serial;
import java.io.Serializable;

public class Imagen implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String nombre;
    private byte[] contenido;

    public Imagen(){

    }

    public Imagen(String nombre, byte[] contenido){
        this.contenido = contenido;
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte[] getContenido() {
        return contenido;
    }

    public void setContenido(byte[] contenido) {
        this.contenido = contenido;
    }
}
