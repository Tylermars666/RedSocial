package co.edu.uniquindio.redsocial.structures.grafo;

import co.edu.uniquindio.redsocial.model.Vendedor;
import co.edu.uniquindio.redsocial.structures.lista.ListaSimple;

public class Grafo {
    private int numVertices;
    private ListaSimple<ListaSimple<Vendedor>> listaAdyacencias;

    public Grafo(int numVertices) {
        this.numVertices = numVertices;
        listaAdyacencias = new ListaSimple<>();
        for (int i = 0; i < numVertices; i++) {
            listaAdyacencias.agregarfinal(new ListaSimple<>());
        }
    }

    public void agregarArista(Vendedor origen, Vendedor destino) {
        int indiceOrigen = obtenerIndiceVendedor(origen);
        int indiceDestino = obtenerIndiceVendedor(destino);
        if (indiceOrigen != -1 && indiceDestino != -1) {
            listaAdyacencias.obtenerValorNodo(indiceOrigen).agregarfinal(destino);
            listaAdyacencias.obtenerValorNodo(indiceDestino).agregarfinal(origen);
        }
    }

    public ListaSimple<Vendedor> obtenerAdyacentes(Vendedor vendedor) {
        int indiceUsuario = obtenerIndiceVendedor(vendedor);
        if (indiceUsuario != -1) {
            return listaAdyacencias.obtenerValorNodo(indiceUsuario);
        }
        return null;
    }

    private int obtenerIndiceVendedor(Vendedor vendedor) {
        // Implementa la lógica para obtener el índice del vértice en la lista
        // Puede ser a través de un identificador único o algún otro criterio
        // Si no se encuentra, devuelve -1

        for(Vendedor vendedor: lis)
        return 0;
    }
}