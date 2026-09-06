Bird

    Atributos:

        - id : number
        - especie : Species
        - dispositivo : TrackingDevice
        - posiciones : List<Position>

    Métodos:

        - registrarPosición(posición : Position)
        - obtenerRuta() : List<Position>

Species

    Atributos:

        - nombre : text
        - características : text

TrackingDevice

    Atributos:

        - id : number
        - bird : Bird

    Métodos:

        - registrarCoordenadas(latitud : float, longitud : float,fechaHora : datetime)

Position

Atributos:

        - latitud : float
        - longitud : float
        - fechaHora : datetime

Flock

    Atributos:

        - id : number
        - birds : List<Bird>
        - ruta : MigrationRoute

    Métodos:

        - agregarAve(bird : Bird)
        - obtenerPosiciones() : List<Position>

MigrationRoute
    
    Atributos:

        - id : number
        - waypoints : List<Waypoint>

Waypoint
    
    Atributos:

        - latitud : float
        - longitud : float
        - orden : number

@startuml

class Bird {
  - id : number
  - especie : Species
  - dispositivo : TrackingDevice
  - posiciones : List<Position>
  + registrarPosición(posición : Position)
  + obtenerRuta() : List<Position>
}

class Species {
  - nombre : text
  - características : text
}

class TrackingDevice {
  - id : number
  - bird : Bird
  + registrarCoordenadas(latitud : float, longitud : float, fechaHora : datetime)
}

class Position {
  - latitud : float
  - longitud : float
  - fechaHora : datetime
}

class Flock {
  - id : number
  - birds : List<Bird>
  - ruta : MigrationRoute
  + agregarAve(bird : Bird)
  + obtenerPosiciones() : List<Position>
}

class MigrationRoute {
  - id : number
  - waypoints : List<Waypoint>
}

class Waypoint {
  - latitud : float
  - longitud : float
  - orden : number
}

Bird "1" --> "1" Species
Bird "1" --> "1" TrackingDevice
Bird "1" --> "*" Position
Flock "1" --> "*" Bird
Flock "1" --> "1" MigrationRoute
MigrationRoute "1" --> "*" Waypoint

@enduml

Nota aclaratoria:

El "1" representa una relación única, es decir, una instancia.
El "*" representa una relación hacia muchas instancias (cero o más)