package ec.edu.ups.poo.clases.individuo;

import ec.edu.ups.poo.clases.Direccion;
import ec.edu.ups.poo.clases.Vinculo;

import java.util.List;

public class Persona {
    private String nombre;
    private String apellido;
    private String cedula;
    private String correo;
    private String telefono;
    private List<Direccion> direcciones;
    private List<Vinculo> vinculos;

    public Persona(String nombre, String apellido, String cedula, String correo, String telefono, List<Direccion> direcciones, List<Vinculo> vinculos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
        this.direcciones = direcciones;
        this.vinculos = vinculos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public List<Vinculo> getVinculos() {
        return vinculos;
    }

    public void setVinculos(List<Vinculo> vinculos) {
        this.vinculos = vinculos;
    }
}
