/**
 * Representa una sonda que analiza algun astro
 *
 * @author Brayan Stewart Guerrero Ordoñez
 */
public class Sonda extends VehiculoEspacial implements NaveRobotica{
    /**
     * Variable que representa el destino al que se dirige la sonda.
     */
    public String destino;
    /**
     * Variable que representa la cantidad en Gb de información que almacena la sonda.
     */
    public int cantidadInformacion;

    /**
     * Representa una instancia de la clase Sonda pero vacio.
     */
    public Sonda(){
        super();
        this.destino = null;
        this.cantidadInformacion = 0;
    }

    /**
     * Representa una instancia de la clase Sonda con parametros de entrada.
     * @param nombre nombre de la sonda
     * @param pais pais al que pertenece la sonda
     * @param combustible combustible que utiliza la sonda
     * @param cantidadCombustible cantidad de combustible que almacena la sonda
     * @param destino destino al que se dirige la sonda
     * @param cantidadInformacion cantidad de información que almacena la sonda
     */
    public Sonda(String nombre, String pais, String combustible, int cantidadCombustible, String destino, int cantidadInformacion) {
        this.nombre = nombre;
        this.pais = pais;
        this.combustible = combustible;
        this.cantidadCombustible = cantidadCombustible;
        this.destino = destino;
        this.cantidadInformacion = 0;
    }

    @Override
    public void recibir() {
        this.cantidadInformacion++;
    }

    @Override
    public void transimitir() {
        this.cantidadInformacion--;
    }

    /**
     * Función que retorna el destino de la sonda.
     * @return destino de la sonda
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Función que retorna el toString con la información destacable de la sonda.
     * @return toString
     */
    @Override
    public String toString() {
        return "Sonda{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", destino='"+ destino + '\'' +
                ", combustible='" + combustible + '\'' +
                '}';
    }
}
