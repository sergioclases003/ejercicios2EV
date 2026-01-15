public class Pokemon {
    private String nombre;
    private String tipo;
    private int nivel;
    private int vida;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }
    public int getVida() { return vida; }
    public void setVida(int vida) { this.vida = vida; }

    public static void main(String[] args) {
        Pokemon poke = new Pokemon();
        poke.setNombre("Pikachu");
        poke.setTipo("Electrico");
        poke.setNivel(5);
        poke.setVida(20);
        System.out.println(poke.getNombre() + " Nivel: " + poke.getNivel() + " HP: " + poke.getVida());
        poke.setNivel(10);
        poke.setVida(45);
        System.out.println("Actualizado: " + poke.getNombre() + " Nivel: " + poke.getNivel() + " HP: " + poke.getVida());
    }
}
