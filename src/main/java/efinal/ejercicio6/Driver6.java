package efinal.ejercicio6;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Driver6 {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        ArrayList<Persona> personas = new ArrayList<Persona>();
        Scanner sc = new Scanner(System.in);
        String nombre;
        double peso;
        double altura;
        String respuesta;
        do {
            System.out.println("Introduce el nombre");
            nombre = sc.nextLine();
            System.out.println("Introduce el peso");
            peso = sc.nextDouble();
            System.out.println("Introduce la altura");
            altura = sc.nextDouble();
            sc.nextLine();
            Persona p = new Persona(nombre, peso, altura);
            personas.add(p);
            System.out.println("¿Quieres introducir otra persona? (s/n)");
            respuesta = sc.nextLine();
        } while (respuesta.equalsIgnoreCase("s"));

        // Guardar los datos en un fichero
        BufferedWriter bw = new BufferedWriter(new FileWriter("personas.txt"));
        for (Persona p : personas) {
            bw.write(p.getNombre() + " " + p.getPeso() + " " + p.getAltura());
            bw.newLine();
        }
        bw.close();

        // Leer los datos del fichero
        ArrayList<Persona> personas2 = new ArrayList<Persona>();
        BufferedReader br = new BufferedReader(new FileReader("personas.txt"));
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(" ");
            Persona p = new Persona(datos[0], Double.parseDouble(datos[1]), Double.parseDouble(datos[2]));
            personas2.add(p);
        }
        double alturaMayor = 0;
        double alturaMenor = personas2.get(0).getAltura();
        String nombreMayor = "";
        String nombreMenor = "";
        for (Persona p : personas2) {
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
