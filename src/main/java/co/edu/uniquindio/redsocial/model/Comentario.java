package co.edu.uniquindio.redsocial.model;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

public class Comentario implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String comentario;
    private LocalDate fecha;

    public Comentario(String comentario, LocalDate fecha) {
        this.comentario = comentario;
        this.fecha = fecha;
    }

    public Comentario() {
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
