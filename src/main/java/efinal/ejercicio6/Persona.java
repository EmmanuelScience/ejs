package efinal.ejercicio6;

public class Persona {
    private String nombre;
    private double peso;
    private double altura;
    
    public Persona(String nombre, double peso, double altura) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", peso=" + peso + ", altura=" + altura + "]";
    }
    
}