package org.example;

import java.util.GregorianCalendar;

public class Hotel implements Impresion, Cloneable {
    private String nombre;
    private Habitacion[] habitaciones;
    private Reserva[] reservas;

    public Hotel(String nombre, int numHabitaciones) {
        this.nombre = nombre;
        this.habitaciones = new Habitacion[numHabitaciones];
        this.reservas = new Reserva[200];
    }

    public void anadirHabitacion(Habitacion habitacion) {
        for (int i = 0; i < habitaciones.length; i++) {
            if (habitaciones[i] == null) {
                habitaciones[i] = habitacion;
                break;
            }
        }
    }

    //El método añadirReserva recibe una habitación y las fechas
    // de inicio y fin. Comprueba que la habitación existe en el hotel,
    // y que no está ya re-servada  para  las  fechas  indicadas.
    // En  este  caso  crea  una  reserva  y  la añade al array de reservas.
    // Si no puede crear la reserva debe generar la excepción HabitacionOcupadaException.

    // int[] array = {1,2,3}
    // h1 4/1 - 6/1
    // h2 5/1 - 7/1
    //1, 2,3
    public void anadirReserva(Habitacion habitacion, GregorianCalendar fechaInicio, GregorianCalendar fechaFin) throws HabitacionOcupadaException {
        boolean existe = false;
        boolean ocupada = false;
        for (int i = 0; i < habitaciones.length; i++) {
            if (habitaciones[i] == habitacion) {
                existe = true;
                break;
            }
        }
        if (existe) {
            for (Reserva reserva : reservas) {
                if (reserva != null) {
                    if (reserva.getHabitacion() == habitacion) {
                        if (reserva.getFechaInicio().compareTo(fechaInicio) <= 0 && reserva.getFechaFin().compareTo(fechaInicio) >= 0) {
                            ocupada = true;
                            break;
                        }
                        if (reserva.getFechaInicio().compareTo(fechaFin) <= 0 && reserva.getFechaFin().compareTo(fechaFin) >= 0) {
                            ocupada = true;
                            break;
                        }
                    }
                }
            }
            if (!ocupada) {
                for (int i = 0; i < reservas.length; i++) {
                    if (reservas[i] == null) {
                        reservas[i] = new Reserva(habitacion, fechaInicio, fechaFin);
                        break;
                    }
                }
            } else {
                throw new HabitacionOcupadaException("La habitación está ocupada");
            }
        }
        else {
            throw new HabitacionOcupadaException("La habitación no existe");
        }
    }

    public void setHabitaciones(Habitacion[] habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Habitacion[] getHabitaciones() {
        return habitaciones;
    }

    /*
    El método ListarOcupación escribe por pantalla todas las
    reservar cuya fecha de inicio es anterior a lafecha actual y
    fecha de fin es posterior a la fecha actual. Use compareTo de GregorianCalendar
     */

    public void listarOcupacion() {
        GregorianCalendar fechaActual = new GregorianCalendar();
        for (Reserva reserva : reservas) {
            if (reserva != null) {
                if (reserva.getFechaInicio().compareTo(fechaActual) < 0 && reserva.getFechaFin().compareTo(fechaActual) > 0) {
                    reserva.imprimirTodo();
                }
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public void imprimirTodo() {
        System.out.println("Hotel: " + nombre);
        System.out.println("Habitaciones: ");
        for (Habitacion habitacione : habitaciones) {
            if (habitacione != null) {
                habitacione.imprimirTodo();
            }
        }
        System.out.println("Reservas: ");
        for (Reserva reserva : reservas) {
            if (reserva != null) {
                reserva.imprimirTodo();
            }
        }
    }
}
