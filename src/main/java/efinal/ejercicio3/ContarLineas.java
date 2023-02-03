package efinal.ejercicio3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContarLineas {

    public static void main(String[] args) {
        // contar lineas de un archivo
        String archivo = "src\\main\\java\\efinal\\ejercicio2\\palabras.txt";
        int numeroLineas = contarLineas(archivo);
        System.out.println("El archivo " + archivo + " tiene " + numeroLineas + " lineas");
    }

    /*
    contar el número de líneas de un fichero de texto
     */
    public static int contarLineas(String archivo) {
        int contador = 0;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            while (reader.readLine() != null) {
                contador++;
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }

        return contador;
    }

}
