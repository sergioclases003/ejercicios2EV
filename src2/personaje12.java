
public class personaje12 {
    private String nombre;
    private int vida;
    private int ataque;

    public personaje12(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = Math.min(100, Math.max(0, vida));
        this.ataque = ataque;
    }

    public void recibirDaño(int daño) {
        this.vida = Math.max(0, this.vida - daño);
        System.out.println(nombre + " recibe " + daño + " de daño. Vida: " + vida);
    }

    public void curarse(int cantidad) {
        this.vida = Math.min(100, this.vida + cantidad);
        System.out.println(nombre + " se cura " + cantidad + ". Vida: " + vida);
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public static void main(String[] args) {
        personaje12 heroe = new personaje12("Guerrero", 100, 20);
        personaje12 monstruo = new personaje12("Orco", 50, 10);

        System.out.println("¡Comienza el combate!");
        heroe.recibirDaño(30);
        monstruo.recibirDaño(25);
        heroe.curarse(10);

        if (heroe.estaVivo()) {
            System.out.println(heroe.nombre + " sigue en pie.");
        }
    }
}
