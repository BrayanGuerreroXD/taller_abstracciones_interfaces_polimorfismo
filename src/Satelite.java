/**
 * Representa a un satelite que orbita la Tierra
 *
 * @author Brayan Stewart Guerrero Ordoñez
 */
public class Satelite extends VehiculoEspacial implements NaveRobotica{
    public int cantidadInformacion; //Cantidad en Gb de información
    private boolean enOrbita;

    public Satelite(){
        super();
        this.cantidadInformacion = 0;
        this.enOrbita = false;
    }

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

    public boolean isEnOrbita() {
        return enOrbita;
    }

    public void setEnOrbita(boolean enOrbita) {
        this.enOrbita = enOrbita;
    }

    @Override
    public String toString() {
        return "Satelite{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", combustible='" + combustible + '\'' +
                '}';
    }
}
