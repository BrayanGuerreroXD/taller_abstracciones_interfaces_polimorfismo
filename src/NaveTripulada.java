/**
 * Representa una nave espacial tripulada con sus atributos y funciones
 *
 * @author Brayan Stewart Guerrero Ordoñez
 */
public class NaveTripulada extends VehiculoEspacial{
    /**
     * Variable que representa la cantidad de tripulantes que tiene la nave.
     */
    public int tripulantes;
    /**
     * Variable que representa el destino al que se dirige la nave.
     */
    public String destino;
    /**
     * Variable que representa el estado de la velocidad de la nave.
     */
    public int velocidad;

    /**
     * Representa una instancia de la clase NaveTripulada pero vacio.
     */
    public NaveTripulada(){
        super();
        this.tripulantes = 0;
        this.destino = null;
        this.velocidad = 0;
    }

    /**
     * Representa una instancia de la clase NaveTripulada con parametros de entrada.
     * @param nombre nombre de la nave.
     * @param pais pais al que pertenece la nave.
     * @param combustible combustible que utiliza la nave.
     * @param cantidadCombustible cantidad de combustible que almacena la nave.
     * @param tripulantes cantidad de tripulantes en la nave.
     * @param destino destino al que se dirige la nave.
     */
    public NaveTripulada(String nombre, String pais, String combustible, int cantidadCombustible, int tripulantes, String destino){
        this.nombre = nombre;
        this.pais = pais;
        this.combustible = combustible;
        this.cantidadCombustible = cantidadCombustible;
        this.tripulantes = tripulantes;
        this.destino = destino;
        this.velocidad = 0;
    }

    /**
     * Función sobreescrita que representa la aceleración de la nave.
     */
    @Override
    public void acelerar(){
        this.velocidad++;
        this.cantidadCombustible--;
    }

    /**
     * Función que representa a la nave frenando.
     */
    public void frenar(){
        this.velocidad--;
    }

    /**
     * Función que representa a la nave apagando sus motores.
     */
    public void apagarMotores(){
        this.velocidad = 0;
    }

    /**
     * Función que retorna el destino de la nave
     * @return destino de la nave
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Función que almacena el destino de la nave
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * Función que retorna el toString con la información destacable de la nave.
     * @return toString
     */
    @Override
    public String toString() {
        return "NaveTripulada{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", triulantes='"+ tripulantes + '\'' +
                ", destino='"+ destino + '\'' +
                ", combustible='" + combustible + '\'' +
                '}';
    }
}
