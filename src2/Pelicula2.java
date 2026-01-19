public class Pelicula2 {
    private String titulo;
    private String director;
    private int anioEstreno;
    private int duracionMinutos;

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }
    public int getAnioEstreno() { return anioEstreno; }
    public void setAnioEstreno(int anioEstreno) { this.anioEstreno = anioEstreno; }
    public int getDuracionMinutos() { return duracionMinutos; }
    public void setDuracionMinutos(int duracionMinutos) { this.duracionMinutos = duracionMinutos; }

    public static void main(String[] args) {
        Pelicula2 p = new Pelicula2();
        p.setTitulo("Inception");
        p.setDirector("Christopher Nolan");
        p.setAnioEstreno(2010);
        p.setDuracionMinutos(148);
        System.out.println(p.getTitulo() + " dirigida por " + p.getDirector());
        p.setDirector(p.getDirector().toUpperCase());
        System.out.println("Director actualizado: " + p.getDirector());
    }
}
