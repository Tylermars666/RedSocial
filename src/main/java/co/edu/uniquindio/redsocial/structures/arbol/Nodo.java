package co.edu.uniquindio.redsocial.structures.arbol;

public class Nodo<T extends Comparable<T>> {
    T valor;
    Nodo<T> nodoIzquierdo;
    Nodo<T> nodoDerecho;

    Nodo(T valor) {
        this.valor = valor;
        this.nodoIzquierdo = null;
        this.nodoDerecho = null;
    }
}
