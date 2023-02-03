package efinal.ejercicio1;

public class Jugador {
    private String nombre;
    private String personaje;
    private Perfil perfil;

    public Jugador(String nombre, String  personaje) {
        this.nombre = nombre;
        this.personaje = personaje;
        this.perfil = new Perfil(0, 0, 0);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return nombre + " , " + personaje + "\n" + perfil;
    }

    public void cambiarPerfil(int valor, int carisma, int suerte) {
        perfil = new Perfil(valor, carisma, suerte);
    }

    public void intercambiarPersonaje(Jugador j) {
        String p = j.getPersonaje();
        j.setPersonaje(personaje);
        personaje = p;
    }

    public boolean ganaAJugador(Jugador j) {
        return perfil.nivelPerfil() > j.getPerfil().nivelPerfil();
    }
}
