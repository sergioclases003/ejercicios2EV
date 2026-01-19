public class EquipoEsports8 {
    private String nombre;
    private String juego;
    private String pais;
    private int rankingMundial;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getJuego() { return juego; }
    public void setJuego(String juego) { this.juego = juego; }
    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }
    public int getRankingMundial() { return rankingMundial; }
    public void setRankingMundial(int rankingMundial) { this.rankingMundial = rankingMundial; }

    public static void main(String[] args) {
        EquipoEsports8 e = new EquipoEsports8();
        e.setNombre("G2 Esports");
        e.setJuego("League of Legends");
        e.setPais("Alemania");
        e.setRankingMundial(5);
        System.out.println(e.getNombre() + " Ranking: " + e.getRankingMundial());
        e.setRankingMundial(1);
        System.out.println("Actualizado: " + e.getNombre() + " Ranking: " + e.getRankingMundial());
    }
}
