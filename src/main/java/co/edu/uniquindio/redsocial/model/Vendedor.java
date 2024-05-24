package co.edu.uniquindio.redsocial.model;

import co.edu.uniquindio.redsocial.structures.cola.Cola;
import co.edu.uniquindio.redsocial.structures.lista.ListaSimple;

import java.io.Serial;
import java.io.Serializable;

public class Vendedor extends Usuario implements Serializable{

    @Serial
    private static final long serialVersionUID = 1L;

    private String direccion;
    private ListaSimple<Producto> listaProductos;
    private Cola<Solicitud> solicitudes;
    private ListaSimple<Vendedor> contactos;

    public Vendedor() {

        this.listaProductos = new ListaSimple<>();
        this.solicitudes = new Cola<>();
        this.contactos = new ListaSimple<>();
    }

    public Vendedor(String nombre, String id, Muro muro, String usuario, String clave, String direccion, String apellido) {
        super(nombre, id, muro, usuario, clave, apellido);
        this.direccion = direccion;

        listaProductos = new ListaSimple<>();
        solicitudes = new Cola<>();
        contactos = new ListaSimple<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ListaSimple<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setProducto(Producto producto) {
        this.listaProductos.agregarfinal(producto);
    }


    public Cola<Solicitud> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitudes.encolar(solicitud);
    }

    public ListaSimple<Vendedor> getContactos() {
        return contactos;
    }

    public void setContacto(Vendedor contacto) {
        this.contactos.agregarfinal(contacto);
    }
}
