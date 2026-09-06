// empaquetar clases publicas e importar las necesarias
package programaMutante;
import personas.Persona;
import profesiones.*;
import poderes.*;

public class quickstart {
    public static void main(String[] args) {
        System.out.println("Hello clase de Poo");

        Persona dani = new Persona();
        Persona p1 = new Persona("Pedro Lopez", (byte)22);

        System.out.println(dani.getNombre());
        dani.cantar();

        System.out.println("----------------------------");

        String nombreResultado = p1.getNombre();
        System.out.println(nombreResultado);
        p1.cantar();

        System.out.println("----------------------------");

        System.out.println("Edad de "+dani.getNombre()+" "+dani.getEdad());
        dani.setEdad((byte)18);
        System.out.println("Edad de "+dani.getNombre()+" "+dani.getEdad());

        System.out.println("----------------------------");

        Persona xyz = p1;
        System.out.println("Edad de "+p1.getNombre()+" "+p1.getEdad());
        System.out.println("Edad de "+xyz.getNombre()+" "+xyz.getEdad());

        xyz.setEdad((byte)27);
        System.out.println("Edad de "+p1.getNombre()+" "+p1.getEdad());

        System.out.println("----------------------------");
        Profesor miProfe = new Profesor((byte) 45, "Esteban", 3);
        System.out.println("Profesor: " + miProfe.getNombre());
        miProfe.impartirClases(2);
        miProfe.suspenderClase();

        System.out.println("----------------------------");
        Trader miTrader = new Trader((byte) 30, "Valeria", 10);
        System.out.println("Trader: " + miTrader.getNombre());
        miTrader.venderAcciones(4);
        miTrader.panicoBursatil();

        System.out.println("----------------------------");
        AIEngineer miAi = new AIEngineer((byte) 26, "Mateo", 5000);
        System.out.println("AI Engineer: " + miAi.getNombre());
        miAi.desplegarModelos(2);
        miAi.reiniciarCluster();

        System.out.println("----------------------------");

        // Todo esto va dentro del main para que Java no marque error de sintaxis
        Persona[] profesionales = new Persona[10];
        IPower[] poderesDisponibles = {new PowerFuego(), new PowerFuerza(), new PowerHielo(), new PowerRayo(), new PowerRoca()};

        for(int i = 0; i < profesionales.length; i++) {
            int tipoProfesion = (int)(Math.random() * 3);
            switch (tipoProfesion) {
                case 0:
                    profesionales[i] = new Profesor((byte) 35, "Profesor " + i, 3);
                    break;
                case 1:
                    profesionales[i] = new AIEngineer((byte) 28, "Ingeniero " + i, 5000);
                    break;
                case 2:
                    profesionales[i] = new Trader((byte) 30, "Trader " + i, 10);
                    break;
            }
            profesionales[i].setPower(poderesDisponibles[(int)(Math.random() * poderesDisponibles.length)]);
        }

        for(Persona p : profesionales) {
            System.out.println("Ataca " + p.getNombre());
            p.atacar();
        }
    }
}