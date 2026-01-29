package semana2;

public class sem2jugador25 {
    private String nombre;
    private int experiencia;

    public sem2jugador25(String nombre, int expInicial) {
        this.nombre = nombre;
        this.experiencia = Math.max(0, expInicial);
    }

    public void ganarExperiencia(int puntos) {
        if (puntos > 0) {
            experiencia += puntos;
            System.out.println(nombre + " ganó " + puntos + " puntos de experiencia.");
        }
    }

    public void mostrarNivel() {
        int nivel = experiencia / 100;
        System.out.println("Jugador: " + nombre + " | Experiencia: " + experiencia + " | Nivel: " + nivel);
    }

    public static void main(String[] args) {
        sem2jugador25 jugador = new sem2jugador25("Alex", 50);

        jugador.mostrarNivel();
        jugador.ganarExperiencia(30);
        jugador.mostrarNivel();
        jugador.ganarExperiencia(100);
        jugador.mostrarNivel();
        jugador.ganarExperiencia(250);
        jugador.mostrarNivel();
    }

}
