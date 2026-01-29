package semana2;

public class sem2personaje18 {
    private String nombre;
    private int vida;

    public sem2personaje18(String nombre, int vidaInicial) {
        this.nombre = nombre;
        this.vida = Math.max(0, Math.min(100, vidaInicial));
    }

    public void recibirDanho(int danho) {
        vida -= danho;
        if (vida < 0) vida = 0;
        System.out.println(nombre + " recibió " + danho + " de daño.");
    }

    public void curarse(int cura) {
        vida += cura;
        if (vida > 100) vida = 100;
        System.out.println(nombre + " se curó " + cura + " puntos.");
    }

    public void mostrarEstado() {
        System.out.println("Personaje: " + nombre + " | Vida: " + vida);
    }

    public static void main(String[] args) {

        // Crear un personaje
        sem2personaje18 heroe = new sem2personaje18("Arthas", 80);

        // Probar los métodos
        heroe.mostrarEstado();
        heroe.recibirDanho(30);
        heroe.mostrarEstado();
        heroe.curarse(20);
        heroe.mostrarEstado();
    }

}