public class sem2reproductormusica24 {
    private int volumen;

    public sem2reproductormusica24(int volInicial) {
        setVolumen(volInicial);
    }

    private void setVolumen(int v) {
        if (v < 0) this.volumen = 0;
        else if (v > 100) this.volumen = 100;
        else this.volumen = v;
    }

    public void subirVolumen() {
        setVolumen(volumen + 1);
    }

    public void bajarVolumen() {
        setVolumen(volumen - 1);
    }

    public void mostrarVolumen() {
        System.out.println("Volumen: " + volumen);
    }

    public static void main(String[] args) {
        sem2reproductormusica24 reproductor = new sem2reproductormusica24(50);

        reproductor.mostrarVolumen();
        reproductor.subirVolumen();
        reproductor.subirVolumen();
        reproductor.mostrarVolumen();
        reproductor.bajarVolumen();
        reproductor.mostrarVolumen();

        // Probar límites
        for (int i = 0; i < 60; i++) {
            reproductor.subirVolumen();
        }
        reproductor.mostrarVolumen();
    }

}
