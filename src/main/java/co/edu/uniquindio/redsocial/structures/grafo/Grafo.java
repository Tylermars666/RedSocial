package co.edu.uniquindio.redsocial.structures.grafo;

import co.edu.uniquindio.redsocial.model.Usuario;
import co.edu.uniquindio.redsocial.structures.lista.ListaSimple;

public class Grafo {
    private int numNodos;
    private ListaSimple<Usuario> listaUsuarios;
    private ListaSimple<ListaSimple<Usuario>> listaAdyacencias;

    public Grafo(int numNodos) {
        this.numNodos = numNodos;
        listaAdyacencias = new ListaSimple<>();
        for (int i = 0; i < numNodos; i++) {
            listaAdyacencias.agregarfinal(new ListaSimple<>());
        }

        listaUsuarios = new ListaSimple<>();
    }

    public void agregarArista(Usuario origen, Usuario destino) {
        int indiceOrigen = obtenerIndiceVendedor(origen);
        int indiceDestino = obtenerIndiceVendedor(destino);
        if (indiceOrigen != -1 && indiceDestino != -1) {

            listaAdyacencias.obtenerValorNodo(indiceOrigen).agregarfinal(destino);
            listaAdyacencias.obtenerValorNodo(indiceDestino).agregarfinal(origen);
        }
    }

    public ListaSimple<Usuario> obtenerAdyacentes(Usuario usuario) {
        int indiceUsuario = obtenerIndiceVendedor(usuario);
        if (indiceUsuario != -1) {
            return listaAdyacencias.obtenerValorNodo(indiceUsuario);
        }
        return null;
    }

    private int obtenerIndiceVendedor(Usuario vendedor) {

        for(int i = 0; i<listaUsuarios.getTamanio()-1; i++){

            if(listaUsuarios.obtenerValorNodo(i).getId().equalsIgnoreCase(vendedor.getId())){

                return i;

            }

        }
        return -1;
    }

    public int getNumNodos() {
        return numNodos;
    }

    public void quitarVertice() {
        this.numNodos--;
    }

    public ListaSimple<Usuario> getListaVendedores() {
        return listaUsuarios;
    }

    public void setUsuario(Usuario usuario) {
        this.listaUsuarios.agregarfinal(usuario);
    }

    public ListaSimple<ListaSimple<Usuario>> getListaAdyacencias() {
        return listaAdyacencias;
    }
}