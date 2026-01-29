package semana2;

public class sem2ascensor23 {
    private int plantaActual;

    public sem2ascensor23(int plantaInicial) {
        if (plantaInicial >= 0 && plantaInicial <= 10) {
            this.plantaActual = plantaInicial;
        } else {
            this.plantaActual = 0;
        }
    }

    public void subir() {
        if (plantaActual < 10) {
            plantaActual++;
        } else {
            System.out.println("Error: Ya estás en la planta máxima.");
        }
    }

    public void bajar() {
        if (plantaActual > 0) {
            plantaActual--;
        } else {
            System.out.println("Error: Ya estás en la planta mínima.");
        }
    }

    public void mostrarPlanta() {
        System.out.println("Ascensor en planta: " + plantaActual);
    }

    public static void main(String[] args) {
        sem2ascensor23 ascensor = new sem2ascensor23(3);

        ascensor.mostrarPlanta();
        ascensor.subir();
        ascensor.subir();
        ascensor.mostrarPlanta();
        ascensor.bajar();
        ascensor.mostrarPlanta();

        // Probar límites
        for (int i = 0; i < 10; i++) {
            ascensor.subir();
        }
        ascensor.mostrarPlanta();
    }

}
