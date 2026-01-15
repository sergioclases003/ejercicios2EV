public class Cancion {
    private String titulo;
    private String artista;
    private int duracionSegundos;

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getArtista() { return artista; }
    public void setArtista(String artista) { this.artista = artista; }
    public int getDuracionSegundos() { return duracionSegundos; }
    public void setDuracionSegundos(int duracionSegundos) { this.duracionSegundos = duracionSegundos; }

    public static void main(String[] args) {
        Cancion c1 = new Cancion();
        c1.setTitulo("Bohemian Rhapsody");
        c1.setArtista("Queen");
        c1.setDuracionSegundos(354);
        
        Cancion c2 = new Cancion();
        c2.setTitulo("Thriller");
        c2.setArtista("Michael Jackson");
        c2.setDuracionSegundos(357);
        
        System.out.println("Cancion 1: " + c1.getTitulo() + " - " + c1.getArtista() + " (" + c1.getDuracionSegundos() + "s)");
        System.out.println("Cancion 2: " + c2.getTitulo() + " - " + c2.getArtista() + " (" + c2.getDuracionSegundos() + "s)");
        
        c1.setDuracionSegundos(400);
        System.out.println("Nueva duracion Cancion 1: " + c1.getDuracionSegundos());
        
        if (c1.getDuracionSegundos() > c2.getDuracionSegundos()) {
            System.out.println("La cancion mas larga es: " + c1.getTitulo());
        } else {
            System.out.println("La cancion mas larga es: " + c2.getTitulo());
        }
    }
}
