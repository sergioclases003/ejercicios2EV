public class sem2termómetro21 {
    private double temperatura;

    public sem2termómetro21(double tempInicial) {
        setTemperatura(tempInicial);
    }

    private void setTemperatura(double t) {
        if (t < -50) this.temperatura = -50;
        else if (t > 50) this.temperatura = 50;
        else this.temperatura = t;
    }

    public void subir(double grados) {
        setTemperatura(temperatura + grados);
    }

    public void bajar(double grados) {
        setTemperatura(temperatura - grados);
    }

    public void mostrarTemperatura() {
        System.out.println("Temperatura actual: " + temperatura + " grados.");
    }

    public static void main(String[] args) {
        sem2termómetro21 termometro = new sem2termómetro21(20);

        termometro.mostrarTemperatura();
        termometro.subir(15);
        termometro.mostrarTemperatura();
        termometro.subir(30); // intenta pasar de 50
        termometro.mostrarTemperatura();
        termometro.bajar(100); // intenta bajar de -50
        termometro.mostrarTemperatura();
    }

}
