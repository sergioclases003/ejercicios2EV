public class Youtuber {
    private String nombreCanal;
    private String categoria;
    private int suscriptores;

    public String getNombreCanal() { return nombreCanal; }
    public void setNombreCanal(String nombreCanal) { this.nombreCanal = nombreCanal; }
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public int getSuscriptores() { return suscriptores; }
    public void setSuscriptores(int suscriptores) { this.suscriptores = suscriptores; }

    public static void main(String[] args) {
        Youtuber y1 = new Youtuber();
        y1.setNombreCanal("ElRubius"); y1.setCategoria("Gaming"); y1.setSuscriptores(40000000);
        Youtuber y2 = new Youtuber();
        y2.setNombreCanal("Ibai"); y2.setCategoria("Entretenimiento"); y2.setSuscriptores(15000000);
        Youtuber y3 = new Youtuber();
        y3.setNombreCanal("AuronPlay"); y3.setCategoria("Comedia"); y3.setSuscriptores(29000000);
        
        System.out.println(y2.getNombreCanal() + " tiene " + y2.getSuscriptores() + " subs.");
        y2.setSuscriptores(16000000);
        System.out.println("Actualizado: " + y2.getNombreCanal() + " tiene " + y2.getSuscriptores() + " subs.");
    }
}
