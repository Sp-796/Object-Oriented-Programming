// empaquetar clases publicas e importar las necesarias
package profesiones;
import personas.Persona;
import poderes.IPower;

public class Trader extends Persona {
    private int cantidadAcciones;
    private final int PRECIO_ACCION = 5000;
    private int capital;

    public Trader(byte pEdad, String pNombre, int pCantidadAcciones) {
        super(pEdad, pNombre);
        this.cantidadAcciones = pCantidadAcciones;
        this.capital = 0;
    }

    public int venderAcciones(int pCantidad) {
        int vendidas = 0;
        if (pCantidad <= this.cantidadAcciones) {
            vendidas = pCantidad;
        } else {
            vendidas = this.cantidadAcciones;
        }

        this.capital += vendidas * PRECIO_ACCION;
        this.cantidadAcciones -= vendidas;

        System.out.println("Trader exitoso con " + vendidas + " acciones vendidas.");
        return vendidas;
    }

    public void panicoBursatil() {
        System.out.println("¡Váyanse de la bolsa, todo desplomándose!");
    }
}