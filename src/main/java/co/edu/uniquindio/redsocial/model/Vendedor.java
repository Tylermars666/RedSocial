package co.edu.uniquindio.redsocial.model;

import co.edu.uniquindio.redsocial.structures.cola.Cola;
import co.edu.uniquindio.redsocial.structures.lista.ListaSimple;

import java.io.Serializable;

public class Vendedor implements Serializable {

    private String nombre;
    private String apellido;
    private String id;
    private String direccion;
    private String usuario;
    private String clave;
    private ListaSimple<Producto> listaProductos;
    private Muro muro;
    private Cola<Solicitud> solicitudes;
    private ListaSimple<Vendedor> contactos;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public ListaSimple<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ListaSimple<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public Muro getMuro() {
        return muro;
    }

    public void setMuro(Muro muro) {
        this.muro = muro;
    }

    public Cola<Solicitud> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(Cola<Solicitud> solicitudes) {
        this.solicitudes = solicitudes;
    }

    public ListaSimple<Vendedor> getContactos() {
        return contactos;
    }

    public void setContactos(ListaSimple<Vendedor> contactos) {
        this.contactos = contactos;
    }
}
