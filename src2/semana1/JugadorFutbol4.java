package semana1;

public class JugadorFutbol4 {
    private String nombre;
    private String equipo;
    private int dorsal;
    private String position;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getEquipo() { return equipo; }
    public void setEquipo(String equipo) { this.equipo = equipo; }
    public int getDorsal() { return dorsal; }
    public void setDorsal(int dorsal) { this.dorsal = dorsal; }
    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    public static void main(String[] args) {
        JugadorFutbol4 j = new JugadorFutbol4();
        j.setNombre("Messi");
        j.setEquipo("Inter Miami");
        j.setDorsal(10);
        j.setPosition("Delantero");
        System.out.println(j.getNombre() + " juega en " + j.getEquipo() + " con el " + j.getDorsal());
        j.setEquipo("Barcelona");
        j.setDorsal(30);
        System.out.println("Actualizado: " + j.getNombre() + " juega en " + j.getEquipo() + " con el " + j.getDorsal());
    }
}
