package org.example;

public class HabitacionSuite extends Habitacion implements Impresion, Cloneable {

    private double superficie;

    public HabitacionSuite(int numero, double precio, boolean conBano, double superficie) {
        super(numero, precio, conBano);
        this.superficie = superficie;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    @Override
    public void imprimirTodo() {
        System.out.println("Habitacion suite");
        System.out.println("Numero: " + getNumero());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Con bano: " + getConBano());
        System.out.println("Superficie: " + superficie);
    }

}
