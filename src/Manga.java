public class Manga {
    private String titulo;
    private String autor;
    private int volumen;
    private boolean leido;

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
    public int getVolumen() { return volumen; }
    public void setVolumen(int volumen) { this.volumen = volumen; }
    public boolean isLeido() { return leido; }
    public void setLeido(boolean leido) { this.leido = leido; }

    public static void main(String[] args) {
        Manga m = new Manga();
        m.setTitulo("One Piece");
        m.setAutor("Eiichiro Oda");
        m.setVolumen(107);
        m.setLeido(false);
        System.out.println(m.getTitulo() + " Vol." + m.getVolumen() + " - Leido: " + m.isLeido());
        m.setLeido(true);
        System.out.println("Actualizado - Leido: " + m.isLeido());
    }
}
