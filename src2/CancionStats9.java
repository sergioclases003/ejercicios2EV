

public class CancionStats9 {
    private String titulo;
    private int numeroReproducciones;

    public CancionStats9(String titulo) {
        this.titulo = titulo;
        this.numeroReproducciones = 0;
    }

    public void reproducir() {
        this.numeroReproducciones++;
    }

    public int getNumeroReproducciones() {
        return numeroReproducciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public static void main(String[] args) {
        CancionStats9 cancion = new CancionStats9("Bohemian Rhapsody");
        for (int i = 0; i < 5; i++) {
            cancion.reproducir();
        }
        System.out.println("La canción '" + cancion.getTitulo() + "' tiene un total de " + cancion.getNumeroReproducciones() + " reproducciones.");
    }
}
