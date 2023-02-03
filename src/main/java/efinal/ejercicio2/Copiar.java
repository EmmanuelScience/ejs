package efinal.ejercicio2;

import java.io.*;

public class Copiar {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream  in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("src\\main\\java\\efinal\\ejercicio2\\palabras.txt");
            out = new FileOutputStream("src\\main\\java\\efinal\\ejercicio2\\copia.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } catch (IOException e) {
            System.out.println("Error de entrada/salida");
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                System.out.println("Error de entrada/salida");
            }
            try {
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                System.out.println("Error de entrada/salida");
            }
        }
    }
}
