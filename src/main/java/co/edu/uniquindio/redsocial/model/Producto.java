package co.edu.uniquindio.redsocial.model;

import co.edu.uniquindio.redsocial.model.Enums.CategoriaProducto;
import co.edu.uniquindio.redsocial.model.Enums.EstadoProducto;

import java.io.Serial;
import java.io.Serializable;

public class Producto implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String nombre;
    private Imagen imagen;
    private CategoriaProducto categoria;
    private double precio;
    private EstadoProducto estado;


    public Producto(String nombre, Imagen imagen, CategoriaProducto categoria, double precio, EstadoProducto estado) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.categoria = categoria;
        this.precio = precio;
        this.estado = estado;
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Imagen getImagen() {
        return imagen;
    }

    public void setImagen(Imagen imagen) {
        this.imagen = imagen;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public EstadoProducto getEstado() {
        return estado;
    }

    public void setEstado(EstadoProducto estado) {
        this.estado = estado;
    }
}
