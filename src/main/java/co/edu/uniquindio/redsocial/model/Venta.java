package co.edu.uniquindio.redsocial.model;

import java.io.Serializable;

public class Venta implements Serializable {

    private Vendedor vendedor;
    private Vendedor comprador;
    private Producto productoComprado;

    public Venta(Vendedor vendedor, Vendedor comprador, Producto productoComprado) {
        this.vendedor = vendedor;
        this.comprador = comprador;
        this.productoComprado = productoComprado;
    }

    public Venta() {
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Vendedor getComprador() {
        return comprador;
    }

    public void setComprador(Vendedor comprador) {
        this.comprador = comprador;
    }

    public Producto getProductoComprado() {
        return productoComprado;
    }

    public void setProductoComprado(Producto productoComprado) {
        this.productoComprado = productoComprado;
    }
}
