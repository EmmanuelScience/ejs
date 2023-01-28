package org.example;

public abstract class Habitacion implements Impresion {
    private int numero;
    private double precio;
    private boolean conBano;

    public Habitacion(int numero, double precio, boolean conBano) {
        this.numero = numero;
        this.precio = precio;
        this.conBano = conBano;
    }

    public Habitacion() {
        this.numero = 0;
        this.precio = 0;
        this.conBano = false;
    }



    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        } else {
            System.out.println("El numero de habitacion debe ser mayor que 0");
        }

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio de la habitacion debe ser mayor que 0");
        }
    }

    public boolean getConBano() {
        return conBano;
    }

    public void setConBano(boolean conBano) {
        this.conBano = conBano;
    }

    @Override
    public abstract void  imprimirTodo();

}
