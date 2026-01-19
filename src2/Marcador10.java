package ejercicios;

public class Marcador10 {
    private String equipoLocal;
    private String equipoVisitante;
    private int golesLocal;
    private int golesVisitante;

    public Marcador10(String equipoLocal, String equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesLocal = 0;
        this.golesVisitante = 0;
    }

    public void golLocal() {
        this.golesLocal++;
    }

    public void golVisitante() {
        this.golesVisitante++;
    }

    public String resultado() {
        return golesLocal + " - " + golesVisitante;
    }

    public static void main(String[] args) {
        Marcador10 partido = new Marcador10("Real Madrid", "Barcelona");
        partido.golLocal();
        partido.golVisitante();
        partido.golLocal();
        System.out.println("Resultado final: " + partido.resultado());
    }
}
