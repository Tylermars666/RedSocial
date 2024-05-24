package co.edu.uniquindio.redsocial.model;

import java.io.Serial;
import java.io.Serializable;

public class Solicitud implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

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
