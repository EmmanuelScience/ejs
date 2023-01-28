package org.example;

public class HabitacionOcupadaException extends Throwable {
    public HabitacionOcupadaException(String laHabitacionNoExiste) {
        super(laHabitacionNoExiste);
    }
}
