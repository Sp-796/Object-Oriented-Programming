// empaquetar clases publicas e importar las necesarias
package profesiones;
import personas.Persona;
import poderes.IPower;

public class Profesor extends Persona {
    private int cantidadCursos;
    private final int PAGO_POR_CURSO = 150000;
    private int salarioTotal;

    public Profesor(byte pEdad, String pNombre, int pCantidadCursos) {
        super(pEdad, pNombre);
        this.cantidadCursos = pCantidadCursos;
        this.salarioTotal = 0;
    }

    public int impartirClases(int pCursosNuevos) {
        int cursosAsignados = 0;
        if (pCursosNuevos <= this.cantidadCursos) {
            cursosAsignados = pCursosNuevos;
        } else {
            cursosAsignados = this.cantidadCursos;
        }

        this.salarioTotal += cursosAsignados * PAGO_POR_CURSO;
        this.cantidadCursos -= cursosAsignados;

        System.out.println("Estudiante feliz aprendiendo con " + cursosAsignados + " curso(s) impartido(s).");
        return cursosAsignados;
    }

    public void suspenderClase() {
        System.out.println("Me fui, hay huelga....");
    }
}