package co.edu.uniquindio.redsocial.model;

import java.io.Serializable;

public class Solicitud implements Serializable {

    private Vendedor remitente;

    public Solicitud(Vendedor remitente) {
        this.remitente = remitente;
    }

    public Solicitud() {
    }

    public Vendedor getRemitente() {
        return remitente;
    }

    public void setRemitente(Vendedor remitente) {
        this.remitente = remitente;
    }
}
