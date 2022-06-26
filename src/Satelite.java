/**
 * Representa a un satélite que orbita la Tierra
 *
 * @author Brayan Stewart Guerrero Ordoñez
 */
public class Satelite extends VehiculoEspacial implements NaveRobotica{
    /**
     * Variable que representa la cantidad en Gb de información que almacena el satélite.
     */
    public int cantidadInformacion;
    /**
     * Variable que representa el estado del satélite.
     */
    private boolean enOrbita;

    /**
     * Representa una instancia de la clase Satelite pero vacio.
     */
    public Satelite(){
        super();
        this.cantidadInformacion = 0;
        this.enOrbita = false;
    }

    /**
     * Representa una instancia de la clase Satelite con parametros de entrada.
     * @param nombre nombre del satélite
     * @param pais pais al que pertenece el satélite
     * @param combustible combustible que utiliza el satélite
     * @param cantidadCombustible cantidad de combustible que dispone el satélite
     * @param cantidadInformacion cantidad de información que almacena el stélite
     * @param enOrbita estado del satélite
     */
    public Satelite(String nombre, String pais, String combustible, int cantidadCombustible, int cantidadInformacion, boolean enOrbita){
        this.nombre = nombre;
        this.pais = pais;
        this.combustible = combustible;
        this.cantidadCombustible = cantidadCombustible;
        this.cantidadInformacion = cantidadInformacion;
        this.enOrbita = enOrbita;
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
     * Función que retorna el estado del satélite.
     * @return estado del satélite
     */
    public boolean isEnOrbita() {
        return enOrbita;
    }

    /**
     * Función que almacena el estado del satélite.
     * @param enOrbita estado del satélite
     */
    public void setEnOrbita(boolean enOrbita) {
        this.enOrbita = enOrbita;
    }

    /**
     * Función que retorna el toString con la información destacable de el satélite.
     * @return toString
     */
    @Override
    public String toString() {
        return "Satelite{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", combustible='" + combustible + '\'' +
                '}';
    }
}
