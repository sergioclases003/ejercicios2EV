package semana2_extra;

public class Luchador {

    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;

    public Luchador(String nombre, int vida, int ataque, int defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public String getNombre() { return nombre; }
    public int getVida() { return vida; }
    public int getAtaque() { return ataque; }
    public int getDefensa() { return defensa; }

    public int ataca() {
        return ataque;
    }

    public boolean recibeDanho(int danhoRecibido) {
        int danhoReal = danhoRecibido - defensa;
        if (danhoReal < 0) danhoReal = 0;

        vida -= danhoReal;
        if (vida < 0) vida = 0; // vida no puede ser negativa

        System.out.println(nombre + " recibe " + danhoReal + " de daño. Vida restante: " + vida);
        return vida <= 0;
    }
}
