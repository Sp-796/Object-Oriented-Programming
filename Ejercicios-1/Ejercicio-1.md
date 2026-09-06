FuelStation
    Atributos:

        - nombre : text
        - ubicación : text
        - bombas : List<FuelPump>
        - transacciones : List<Transaction>

    Métodos:

        - registrarTransacción(transacción : Transaction)
        - obtenerTotalVentas() : float

FuelPump
    
    Atributos:

        - id : number
        - tiposCombustible : List<FuelType>

    Métodos:

        - seleccionarCombustible(tipo : FuelType)
        - despacharCombustible(vehículo : Vehicle, cantidad : float)

FuelType
    
    Atributos:

        - nombre : text (ej. regular, premium, diesel)
        - precioPorUnidad : float

Vehicle

    Atributos:

        - placa : text
        - tipo : text (auto, camión, moto)
        - tanqueCapacidad : float
        - nivelActual : float

    Métodos:

        - solicitarReabastecimiento(pump : FuelPump, cantidad : float)
        - actualizarNivel(cantidad : float)

Transaction

    Atributos:

        - id : number
        - vehículo : Vehicle
        - bomba : FuelPump
        - tipoCombustible : FuelType
        - cantidad : float
        - costo : float
        - fechaHora : datetime

@startuml

class FuelStation {
  - nombre : text
  - ubicación : text
  - bombas : List<FuelPump>
  - transacciones : List<Transaction>
  + registrarTransacción(transacción : Transaction)
  + obtenerTotalVentas() : float
}

class FuelPump {
  - id : number
  - tiposCombustible : List<FuelType>
  + seleccionarCombustible(tipo : FuelType)
  + despacharCombustible(vehículo : Vehicle, cantidad : float)
}

class FuelType {
  - nombre : text
  - precioPorUnidad : float
}

class Vehicle {
  - placa : text
  - tipo : text
  - tanqueCapacidad : float
  - nivelActual : float
  + solicitarReabastecimiento(pump : FuelPump, cantidad : float)
  + actualizarNivel(cantidad : float)
}

class Transaction {
  - id : number
  - vehículo : Vehicle
  - bomba : FuelPump
  - tipoCombustible : FuelType
  - cantidad : float
  - costo : float
  - fechaHora : datetime
}

FuelStation "1" --> "*" FuelPump
FuelStation "1" --> "*" Transaction
FuelPump "1" --> "*" FuelType
Transaction "1" --> "1" Vehicle
Transaction "1" --> "1" FuelType

@enduml

Nota aclaratoria:

El "1" representa una relación única, es decir, una instancia.
El "*" representa una relación hacia muchas instancias (cero o más)