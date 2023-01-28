package org.example;

public class HabitacionSimple extends Habitacion implements Impresion {

    private  boolean tv;
    public HabitacionSimple(int numero, double precio, boolean conBano, boolean tv) {
        super(numero, precio, conBano);
        this.tv = tv;
    }

    public boolean getTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    @Override
    public void imprimirTodo() {
        System.out.println("Habitación simple");
        System.out.println("Número: " + getNumero());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Con baño: " + getConBano());
        System.out.println("Con TV: " + tv);
    }

}
