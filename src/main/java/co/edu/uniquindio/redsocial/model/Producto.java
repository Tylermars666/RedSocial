package co.edu.uniquindio.redsocial.model;

import co.edu.uniquindio.redsocial.model.Enums.CategoriaProducto;
import co.edu.uniquindio.redsocial.model.Enums.EstadoProducto;

import java.io.Serializable;

public class Producto implements Serializable {

    private String nombre;
    private Imagen imagen;
    private CategoriaProducto categoria;
    private double precio;
    private EstadoProducto estado;


}
