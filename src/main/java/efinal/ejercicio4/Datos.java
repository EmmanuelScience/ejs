/**
Un programa que lea del fichero “datos.txt” que contiene nombres, peso y altura 
de personas (cada dato en una línea) y calcula el peso medio y la altura media.
 */

package efinal.ejercicio4;

import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;

import java.util.ArrayList;

import java.util.List;

public class Datos {

    public static void main(String[] args) {

        double sumaPeso = 0;
        double sumaAltura = 0;
        int contador = 0;
        double mediaPeso;
        double mediaAltura;


        try (BufferedReader br = new BufferedReader(new FileReader("src\\main\\java\\efinal\\ejercicio4\\datos.txt"))) {

            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(" ");
                sumaPeso += Double.parseDouble(datos[1]);
                sumaAltura += Double.parseDouble(datos[2]);
                contador++;
            }



        } catch (IOException e) {

            System.out.println("Error de lectura");

        }

        mediaPeso = sumaPeso / contador;
        mediaAltura = sumaAltura / contador;

        System.out.println("La media de peso es: " + mediaPeso);
        System.out.println("La media de altura es: " + mediaAltura);

    }

}