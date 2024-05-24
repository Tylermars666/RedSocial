package co.edu.uniquindio.redsocial.model;

import co.edu.uniquindio.redsocial.structures.cola.Cola;
import co.edu.uniquindio.redsocial.structures.lista.ListaSimple;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

public class Post implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Vendedor vendedor;
    private LocalDate fecha;
    private Producto producto;
    private String descripcion;
    private int likes;
    private Cola<Comentario> comentarios;

    public Post(Vendedor vendedor, LocalDate fecha, Producto producto, String descripcion) {
        this.vendedor = vendedor;
        this.fecha = fecha;
        this.producto = producto;
        this.descripcion = descripcion;
        this.comentarios = new Cola<>();
    }

    public Post() {

        this.comentarios = new Cola<>();
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getLikes() {
        return likes;
    }

    public void setLike() {
        this.likes++;
    }

    public Cola<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentario(Comentario comentario) {
        this.comentarios.encolar(comentario);
    }
}
