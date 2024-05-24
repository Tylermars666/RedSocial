package co.edu.uniquindio.redsocial.model;

import java.io.Serial;
import java.io.Serializable;

public class Usuario implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String nombre;
    private String apellido;
    private String id;
    private Muro muro;
    private String usuario;
    private String clave;

    public Usuario() {
    }

    public Usuario(String nombre, String id, Muro muro, String usuario, String clave, String apellido) {
        this.nombre = nombre;
        this.id = id;
        this.muro = muro;
        this.usuario = usuario;
        this.clave = clave;
        this.apellido=apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Muro getMuro() {
        return muro;
    }

    public void setMuro(Muro muro) {
        this.muro = muro;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
