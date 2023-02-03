package efinal.ejercicio1;

public class PruebaJugador {

        public static void main(String[] args) {
            Jugador j1;
            Jugador j2;

            j1 = new Jugador("Juan", "enano");
            j2 = new Jugador("Pedro", "elfo");

            System.out.println("Primer Jugador " + j1);
            System.out.println("Segundo Jugador " + j2);

            j1.cambiarPerfil(3, 4, 5);
            j2.cambiarPerfil(5, 6, 7);

            System.out.println("Primer Jugador " + j1);
            System.out.println("Segundo Jugador " + j2);

            j1.intercambiarPersonaje(j2);
            System.out.println("Primer Jugador " + j1);
            System.out.println("Segundo Jugador " + j2);

            System.out.println(j1.ganaAJugador(j2) ? "Gana el jugador 1 \n" + j1 : "Gana el jugador 2 \n" + j2);
        }
}
