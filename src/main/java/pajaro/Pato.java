package pajaro;

public class Pato extends Pajaro implements Volar, Nadar {
    public void volar() {
        System.out.println("Pato volando");
    }
    public void nadar() {
        System.out.println("Pato nadando");
    }
}
