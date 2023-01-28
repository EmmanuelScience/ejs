package org.example;

import java.util.GregorianCalendar;

public class Reserva implements Impresion {
    private Habitacion habitacion;
    private GregorianCalendar fechaInicio;
    private GregorianCalendar fechaFin;

    public Reserva(Habitacion habitacion, GregorianCalendar fechaInicio, GregorianCalendar fechaFin) {
        //La fecha de inicio siempre debe ser posterior a la de
        // finalización. Si esto no  se  cumple  en  alguna
        // operación,  incluido  el  constructor,  debe  lanzar
        // la excepción IllegalArgumentException.
        if (fechaInicio.after(fechaFin)) {
            throw new IllegalArgumentException("La fecha de inicio debe ser posterior a la de finalización");
        }
        this.habitacion = habitacion;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public GregorianCalendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(GregorianCalendar fechaInicio) {
        if (fechaInicio.after(fechaFin)) {
            throw new IllegalArgumentException("La fecha de inicio debe ser posterior a la de finalización");
        }
        this.fechaInicio = fechaInicio;
    }

    public GregorianCalendar getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(GregorianCalendar fechaFin) {
        if (fechaInicio.after(fechaFin)) {
            throw new IllegalArgumentException("La fecha de inicio debe ser posterior a la de finalización");
        }
        this.fechaFin = fechaFin;
    }

    public Reserva clone() throws CloneNotSupportedException {
        return (Reserva) super.clone();
    }

    @Override
    public void imprimirTodo() {
        System.out.println("Habitacion: " + habitacion.getNumero());
        System.out.println("Precio: " + habitacion.getPrecio());
        System.out.println("Con bano: " + habitacion.getConBano());
        System.out.println("Fecha inicio: " + fechaInicio.getTime());
        System.out.println("Fecha fin: " + fechaFin.getTime());
    }


}
