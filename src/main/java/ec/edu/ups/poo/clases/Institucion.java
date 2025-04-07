package ec.edu.ups.poo.clases;

import ec.edu.ups.poo.clases.individuo.Persona;

import java.util.List;

public class Institucion {
    private String idInstitucion;
    private List<Direccion> ubicaciones;

    public Institucion(String idInstitucion, List<Direccion> ubicaciones) {
        this.idInstitucion = idInstitucion;
        this.ubicaciones = ubicaciones;
    }

    public String getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(String idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    public List<Direccion> getUbicaciones() {
        return ubicaciones;
    }

    public void setUbicaciones(List<Direccion> ubicaciones) {
        this.ubicaciones = ubicaciones;
    }
}
