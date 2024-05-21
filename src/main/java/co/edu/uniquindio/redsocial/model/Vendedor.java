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
    //Lista de adyacencias?

}
