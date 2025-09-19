import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static final int QUANTUM = 3;

    public static void main(String[] args) {
        Queue<Proceso> procesos = new LinkedList<>();

        int numeroAleatorio = (int) (Math.random() * (99) + 1);
        procesos.add(new Proceso("Suma hasta el numero 100", numeroAleatorio, 100));
        numeroAleatorio = (int) (Math.random() * (50) + 100);
        procesos.add(new Proceso("Suma hasta el numero 150", numeroAleatorio, 150));

        while (!procesos.isEmpty()) {
            Proceso p = procesos.poll();
            int ciclosTrabajar = Math.min(p.ciclosRestantes(), QUANTUM);
            System.out.println("Ejecutando el proceso '" + p.nombre + "' en " + ciclosTrabajar + " ciclos con numero actual de "+ p.getNumeroActual());
            p.actuar(ciclosTrabajar);
            if (p.terminoProceso()) {
                System.out.println("Proceso '" + p.nombre + "' ha terminado!");
            } else {
                procesos.add(p);
            }
        }

        System.out.println("Todos los procesos han terminado");
    }
}