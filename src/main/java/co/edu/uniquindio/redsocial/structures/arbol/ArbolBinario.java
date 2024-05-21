package co.edu.uniquindio.redsocial.structures.arbol;

public class ArbolBinario<T extends Comparable<T>> {
    private Nodo<T> raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void insertar(T valor) {
        this.raiz = insertarRecursivo(this.raiz, valor);
    }

    private Nodo<T> insertarRecursivo(Nodo<T> nodo, T valor) {
        if (nodo == null) {
            return new Nodo<>(valor);
        }

        if (valor.compareTo(nodo.valor) < 0) {
            nodo.nodoIzquierdo = insertarRecursivo(nodo.nodoIzquierdo, valor);
        } else if (valor.compareTo(nodo.valor) > 0) {
            nodo.nodoDerecho = insertarRecursivo(nodo.nodoDerecho, valor);
        }

        return nodo;
    }

    public boolean buscar(T valor) {
        return buscarRecursivo(this.raiz, valor);
    }

    private boolean buscarRecursivo(Nodo<T> nodo, T valor) {
        if (nodo == null) {
            return false;
        }

        if (valor.compareTo(nodo.valor) == 0) {
            return true;
        }

        if (valor.compareTo(nodo.valor) < 0) {
            return buscarRecursivo(nodo.nodoIzquierdo, valor);
        } else {
            return buscarRecursivo(nodo.nodoDerecho, valor);
        }
    }

    public void eliminar(T valor) {
        this.raiz = eliminarRecursivo(this.raiz, valor);
    }

    private Nodo<T> eliminarRecursivo(Nodo<T> nodo, T valor) {
        if (nodo == null) {
            return null;
        }

        if (valor.compareTo(nodo.valor) < 0) {
            nodo.nodoIzquierdo = eliminarRecursivo(nodo.nodoIzquierdo, valor);
        } else if (valor.compareTo(nodo.valor) > 0) {
            nodo.nodoDerecho = eliminarRecursivo(nodo.nodoDerecho, valor);
        } else {
            if (nodo.nodoIzquierdo == null) {
                return nodo.nodoDerecho;
            } else if (nodo.nodoDerecho == null) {
                return nodo.nodoIzquierdo;
            }

            nodo.valor = encontrarMenor(nodo.nodoDerecho);
            nodo.nodoDerecho = eliminarRecursivo(nodo.nodoDerecho, nodo.valor);
        }

        return nodo;
    }

    private T encontrarMenor(Nodo<T> nodo) {
        while (nodo.nodoIzquierdo != null) {
            nodo = nodo.nodoIzquierdo;
        }
        return nodo.valor;
    }
}
