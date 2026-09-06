==== Description of the Program ====

This Java console application demonstrates object-oriented programming principles—specifically inheritance, polymorphism, encapsulation, and interface implementation—across a modular, package-based architecture. The program instantiates various professional profiles that inherit from a core Persona class, dynamically assigns them combat powers via an IPower interface, and executes polymorphically driven actions.

==== Class Descriptions ====

- Persona: The base class encapsulating common attributes like name and age, alongside methods for behavior and power delegation.  
- Profesor: A subclass of Persona representing a teacher with course management and strike simulation capabilities.  
- Trader: A subclass of Persona handling stock market metrics, capital accumulation, and market panic functions.  
- AIEngineer: A subclass of Persona managing cloud credits, model deployments, and GPU cluster reboots.  
- IPower: An interface establishing a common template for offensive power behaviors.  
- Power Classes (PowerFuego, PowerFuerza, PowerHielo, PowerRayo, PowerRoca): Concrete implementations of IPower providing unique visual output strings for attacks.  quickstart: The executable driver class containing the main method that orchestrates object creation, polymorphic array iteration, and execution.  

==== Project Architecture: ====

src/
├── programaMutante/
│   └── quickstart.java
├── personas/
│   └── Persona.java
├── profesiones/
│   ├── Profesor.java
│   ├── Trader.java
│   └── AIEngineer.java
└── poderes/
    ├── IPower.java
    ├── PowerFuego.java
    ├── PowerFuerza.java
    ├── PowerHielo.java
    ├── PowerRayo.java
    └── PowerRoca.java

==== Class Diagram using PlantUML ====

@startuml
package "programaMutante" {
    class quickstart {
        + {static} void main(String[] args)
    }
}

package "personas" {
    class Persona {
        ~ byte edad
        ~ String nombre
        - IPower power
        + Persona()
        + Persona(byte pEdad, String pNombre)
        + String getNombre()
        + byte getEdad()
        + void setEdad(byte pEdad)
        + void cantar()
        + void setPower(IPower pPower)
        + void atacar()
    }
}

package "profesiones" {
    class Profesor {
        - int cantidadCursos
        - int salarioTotal
        + Profesor(byte pEdad, String pNombre, int pCantidadCursos)
        + int impartirClases(int pCursosNuevos)
        + void suspenderClase()
    }
    class Trader {
        - int cantidadAcciones
        - int capital
        + Trader(byte pEdad, String pNombre, int pCantidadAcciones)
        + int venderAcciones(int pCantidad)
        + void panicoBursatil()
    }
    class AIEngineer {
        - int creditosCloud
        - int modelosDesplegados
        + AIEngineer(byte pEdad, String pNombre, int pCreditosCloud)
        + int desplegarModelos(int pCantidad)
        + void reiniciarCluster()
    }
}

package "poderes" {
    interface IPower {
        + void dispararPoder()
    }
    class PowerFuego
    class PowerFuerza
    class PowerHielo
    class PowerRayo
    class PowerRoca
}

Persona <|-- Profesor
Persona <|-- Trader
Persona <|-- AIEngineer
Persona o--> IPower : power
IPower <|.. PowerFuego
IPower <|.. PowerFuerza
IPower <|.. PowerHielo
IPower <|.. PowerRayo
IPower <|.. PowerRoca
quickstart ..> Persona
quickstart ..> IPower
@enduml    