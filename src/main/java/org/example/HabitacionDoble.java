package org.example;

public class HabitacionDoble extends Habitacion implements Impresion, Cloneable {
    private int maxPersonas;
    public HabitacionDoble(int numero, double precio, boolean conBano, int maxPersonas) {
        super(numero, precio, conBano);
        this.maxPersonas = maxPersonas;
    }

    public int getMaxPersonas() {
        return maxPersonas;
    }

    public void setMaxPersonas(int maxPersonas) {
        this.maxPersonas = maxPersonas;
    }

    @Override
    public void imprimirTodo() {
        System.out.println("Habitacion doble");
        System.out.println("Numero: " + getNumero());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Con bano: " + getConBano());
        System.out.println("Max personas: " + maxPersonas);
    }
}
