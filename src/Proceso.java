public class Proceso {
    String nombre;
    private final int metaSuma;
    private int numeroActual;

    public Proceso(String nombre, int numeroInicio, int metaSuma) {
        this.nombre = nombre;
        this.numeroActual = numeroInicio;
        this.metaSuma = metaSuma;
    }

    public void actuar(int ciclos) {
        for (int i = 0; (i < ciclos && numeroActual < metaSuma); i++) {
            numeroActual++;
        }
    }

    public boolean terminoProceso() {
        return numeroActual == metaSuma;
    }

    public int ciclosRestantes() {
        return metaSuma-numeroActual;
    }

    public int getNumeroActual() {
        return numeroActual;
    }
}
