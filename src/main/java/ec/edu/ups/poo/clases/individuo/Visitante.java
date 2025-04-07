package ec.edu.ups.poo.clases.individuo;

import ec.edu.ups.poo.clases.Direccion;
import ec.edu.ups.poo.clases.Vinculo;

import java.util.GregorianCalendar;
import java.util.List;

public class Visitante extends Persona {
    private String motivo;
    private GregorianCalendar fechaEntrada;
    private GregorianCalendar fechaSalida;

    public Visitante(String nombre, String apellido, String cedula, String correo, String telefono, List<Direccion> direcciones, List<Vinculo> vinculos, String motivo, GregorianCalendar fechaEntrada, GregorianCalendar fechaSalida) {
        super(nombre, apellido, cedula, correo, telefono, direcciones, vinculos);
        this.motivo = motivo;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public GregorianCalendar getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(GregorianCalendar fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public GregorianCalendar getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(GregorianCalendar fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
}
