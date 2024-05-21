package co.edu.uniquindio.redsocial.model;

import co.edu.uniquindio.redsocial.structures.cola.Cola;
import co.edu.uniquindio.redsocial.structures.lista.ListaSimple;

import java.io.Serializable;
import java.time.LocalDate;

public class Post implements Serializable {

    private Vendedor vendedor;
    private LocalDate fecha;
    private Producto producto;
    private String descripcion;
    private int likes;
    private Cola<String> comentarios;

}
