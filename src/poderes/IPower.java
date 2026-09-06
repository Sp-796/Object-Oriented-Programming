// las interfaces son plantillas que nos permiten definir Types que tienen
// un comportamiento comun, pero no tienen implementacion
// es decir, solo se declara el nombre (signature) del comportamiento
// pero no se implementa, es decir no tiene codigo
// las interfaces tambien pueden tener definiciones de atributos static

// empaquetar clases publicas e importar las necesarias
package poderes;

public interface IPower {
    public void dispararPoder();
}