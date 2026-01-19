public class Skin5 {
    private String nombre;
    private String videojuego;
    private String rareza;
    private int precioMonedas;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getVideojuego() { return videojuego; }
    public void setVideojuego(String videojuego) { this.videojuego = videojuego; }
    public String getRareza() { return rareza; }
    public void setRareza(String rareza) { this.rareza = rareza; }
    public int getPrecioMonedas() { return precioMonedas; }
    public void setPrecioMonedas(int precioMonedas) { this.precioMonedas = precioMonedas; }

    public static void main(String[] args) {
        Skin5 s1 = new Skin5();
        s1.setNombre("Renegade"); s1.setVideojuego("Fortnite"); s1.setRareza("Rara"); s1.setPrecioMonedas(1200);
        Skin5 s2 = new Skin5();
        s2.setNombre("Skull Trooper"); s2.setVideojuego("Fortnite"); s2.setRareza("Epica"); s2.setPrecioMonedas(1500);
        
        System.out.println("Skin 2: " + s2.getNombre() + " (" + s2.getRareza() + ", " + s2.getPrecioMonedas() + " monedas)");
        s2.setRareza("Legendaria");
        s2.setPrecioMonedas(2000);
        System.out.println("Skin 2 actualizada: " + s2.getRareza() + ", " + s2.getPrecioMonedas() + " monedas");
    }
}
