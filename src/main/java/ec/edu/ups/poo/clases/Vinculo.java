package ec.edu.ups.poo.clases;

import java.util.GregorianCalendar;
import java.util.List;

public class Vinculo {
    private String rol;
    private GregorianCalendar fechaInicio;
    private List<Institucion> instituciones;

    public Vinculo(String rol, GregorianCalendar fechaInicio, List<Institucion> instituciones) {
        this.rol = rol;
        this.fechaInicio = fechaInicio;
        this.instituciones = instituciones;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(GregorianCalendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public List<Institucion> getInstituciones() {
        return instituciones;
    }

    public void setInstituciones(List<Institucion> instituciones) {
        this.instituciones = instituciones;
    }
}
