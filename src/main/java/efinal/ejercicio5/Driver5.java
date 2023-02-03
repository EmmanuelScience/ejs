package efinal.ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver5 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<Persona> personas = new ArrayList<Persona>();
        Scanner sc = new Scanner(System.in);
        String nombre;
        double peso;
        double altura;
        String respuesta;
        do {
            System.out.println("Introduce el nombre ");
            nombre = sc.nextLine();
            System.out.println("Introduce el peso ");
            peso = sc.nextDouble();
            System.out.println("Introduce la altura ");
            altura = sc.nextDouble();
            sc.nextLine();
            Persona p = new Persona(nombre, peso, altura);
            personas.add(p);
            System.out.println("¿Quieres introducir otra persona? (s/n)");
            respuesta = sc.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));
        double alturaMayor = 0;
        double alturaMenor = personas.get(0).getAltura();
        String nombreMayor = "";
        String nombreMenor = "";
        for (Persona p : personas) {
            if (p.getAltura() > alturaMayor) {
                alturaMayor = p.getAltura();
                nombreMayor = p.getNombre();
            }
            if (p.getAltura() < alturaMenor) {
                alturaMenor = p.getAltura();
                nombreMenor = p.getNombre();
            }
        }
        System.out.println("La persona de mayor altura es " + nombreMayor + " con " + alturaMayor + " metros");
        System.out.println("La persona de menor altura es " + nombreMenor + " con " + alturaMenor + " metros");
        
        
    }

}
