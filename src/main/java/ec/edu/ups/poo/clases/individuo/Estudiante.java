package ec.edu.ups.poo.clases.individuo;

import ec.edu.ups.poo.clases.Direccion;
import ec.edu.ups.poo.clases.Vinculo;

import java.util.List;

public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String nombre, String apellido, String cedula, String correo, String telefono, List<Direccion> direcciones, List<Vinculo> vinculos, String carrera) {
        super(nombre, apellido, cedula, correo, telefono, direcciones, vinculos);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
