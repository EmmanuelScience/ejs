package efinal.ejercicio1;

public class Perfil {
    private int valor;
    private int carisma;
    private int suerte;

    public Perfil(int valor, int carisma, int suerte) {
        this.valor = valor;
        this.carisma = carisma;
        this.suerte = suerte;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }

    public int getSuerte() {
        return suerte;
    }

    public void setSuerte(int suerte) {
        this.suerte = suerte;
    }

    @Override
    public String toString() {
        return  "Valor: " + valor + "\n" +
                "Carisma: " + carisma + "\n" +
                "Suerte: " + suerte;
    }

    public int nivelPerfil() {
        return valor + carisma + suerte;
    }
}
