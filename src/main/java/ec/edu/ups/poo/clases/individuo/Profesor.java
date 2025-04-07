package ec.edu.ups.poo.clases.individuo;

import ec.edu.ups.poo.clases.Direccion;
import ec.edu.ups.poo.clases.Vinculo;

import java.util.List;

public class Profesor extends Persona {
    private List<String> titulos;
    private List<String> areasEspecializacion;

    public Profesor(String nombre, String apellido, String cedula, String correo, String telefono, List<Direccion> direcciones, List<Vinculo> vinculos, List<String> titulos, List<String> areasEspecializacion) {
        super(nombre, apellido, cedula, correo, telefono, direcciones, vinculos);
        this.titulos = titulos;
        this.areasEspecializacion = areasEspecializacion;
    }

    public List<String> getTitulos() {
        return titulos;
    }

    public void setTitulos(List<String> titulos) {
        this.titulos = titulos;
    }

    public List<String> getAreasEspecializacion() {
        return areasEspecializacion;
    }

    public void setAreasEspecializacion(List<String> areasEspecializacion) {
        this.areasEspecializacion = areasEspecializacion;
    }
}
