package co.edu.uniquindio.redsocial.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Mensaje implements Serializable {

    private String cuerpo;
    private LocalDate fecha;

    public Mensaje(String cuerpo, LocalDate fecha) {
        this.cuerpo = cuerpo;
        this.fecha = fecha;
    }

    public Mensaje() {
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
