package ec.edu.ups.poo.clases.individuo;

import ec.edu.ups.poo.clases.Direccion;
import ec.edu.ups.poo.clases.Vinculo;

import java.util.List;

public class Administrador extends Persona {
    private List<String> cargos;
    private List<String> responsibles;

    public Administrador(String nombre, String apellido, String cedula, String correo, String telefono, List<Direccion> direcciones, List<Vinculo> vinculos, List<String> cargos, List<String> responsibles) {
        super(nombre, apellido, cedula, correo, telefono, direcciones, vinculos);
        this.cargos = cargos;
        this.responsibles = responsibles;
    }

    public List<String> getCargos() {
        return cargos;
    }

    public void setCargos(List<String> cargos) {
        this.cargos = cargos;
    }

    public List<String> getResponsibles() {
        return responsibles;
    }

    public void setResponsibles(List<String> responsibles) {
        this.responsibles = responsibles;
    }
}
