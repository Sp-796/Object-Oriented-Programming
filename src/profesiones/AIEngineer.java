// empaquetar clases publicas e importar las necesarias
package profesiones;
import personas.Persona;
import poderes.IPower;

public class AIEngineer extends Persona {
    private int creditosCloud;
    private final int COSTO_MODELO = 1000;
    private int modelosDesplegados;

    public AIEngineer(byte pEdad, String pNombre, int pCreditosCloud) {
        super(pEdad, pNombre);
        this.creditosCloud = pCreditosCloud;
        this.modelosDesplegados = 0;
    }

    public int desplegarModelos(int pCantidad) {
        int desplegados = 0;
        int costoTotal = pCantidad * COSTO_MODELO;

        if (costoTotal <= this.creditosCloud) {
            desplegados = pCantidad;
        } else {
            desplegados = this.creditosCloud / COSTO_MODELO;
        }

        this.creditosCloud -= desplegados * COSTO_MODELO;
        this.modelosDesplegados += desplegados;

        System.out.println("Cluster activo. Se desplegaron " + desplegados + " modelos.");
        return desplegados;
    }

    public void reiniciarCluster() {
        System.out.println("Reiniciando servidores y limpiando memoria GPU....");
    }
}