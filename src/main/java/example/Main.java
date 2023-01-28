package org.example;

import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) throws HabitacionOcupadaException {
        Hotel hotel = new Hotel("Hotel 1", 7);
        //Cree  3  habitaciones  simples,  3  habitaciones  dobles  y  2  suites,  con  los datos que considere.
        HabitacionSimple habitacionSimple1 = new HabitacionSimple(1, 10, true, true);
        HabitacionSimple habitacionSimple2 = new HabitacionSimple(2, 10, true, true);
        HabitacionSimple habitacionSimple3 = new HabitacionSimple(3, 10, true, true);
        HabitacionDoble habitacionDoble1 = new HabitacionDoble(4, 10, true, 5);
        HabitacionDoble habitacionDoble2 = new HabitacionDoble(5, 10, true, 5);
        HabitacionDoble habitacionDoble3 = new HabitacionDoble(6, 10, true, 5);
        HabitacionSuite habitacionSuite1 = new HabitacionSuite(7, 10, true, 10);
        HabitacionSuite habitacionSuite2 = new HabitacionSuite(8, 10, true, 10);
        //Añada todas las habitaciones creadas al hotel
        //copy hotel by cloning
        //Hotel hotel2 = (Hotel) hotel.clone();
        hotel.anadirHabitacion(habitacionSimple1);
        hotel.anadirHabitacion(habitacionSimple2);
        hotel.anadirHabitacion(habitacionSimple3);
        hotel.anadirHabitacion(habitacionDoble1);
        hotel.anadirHabitacion(habitacionDoble2);
        hotel.anadirHabitacion(habitacionDoble3);
        hotel.anadirHabitacion(habitacionSuite1);
        hotel.anadirHabitacion(habitacionSuite2);

        //Reserve   una   habitación   simple   desde   el 21/12/2012   hasta   el 24/12/2012.
        GregorianCalendar fechaEntrada = new GregorianCalendar(2012, 11, 21);
        GregorianCalendar fechaSalida = new GregorianCalendar(2012, 11, 24);
        hotel.anadirReserva(habitacionSimple1, fechaEntrada, fechaSalida);
        //Reserve una habitación doble del 26/11/2012 al 30/11/2012.
        fechaEntrada = new GregorianCalendar(2012, 10, 26);
        fechaSalida = new GregorianCalendar(2012, 10, 30);
        hotel.anadirReserva(habitacionDoble1, fechaEntrada, fechaSalida);
        //Reserve una suite del 01/01/2013 al 3/1/2013.
        fechaEntrada = new GregorianCalendar(2013, 0, 1);
        fechaSalida = new GregorianCalendar(2013, 0, 3);
        hotel.anadirReserva(habitacionSuite1, fechaEntrada, fechaSalida);
        //Reserve la misma suite del 2/1/2013 al 4/1/2013.
        fechaEntrada = new GregorianCalendar(2013, 0, 2);
        fechaSalida = new GregorianCalendar(2013, 0, 4);

        try {
            hotel.anadirReserva(habitacionSuite1, fechaEntrada, fechaSalida);
        } catch (HabitacionOcupadaException e) {
            System.out.println(e.getMessage());
        }

        //Escribir el listado de ocupación del hotel.
        hotel.listarOcupacion();
        //Llamar a imprimirCompleto del hotel.
        hotel.imprimirTodo();

    }
}