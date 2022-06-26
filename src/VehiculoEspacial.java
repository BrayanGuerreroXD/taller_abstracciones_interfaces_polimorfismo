/**
 * Representa a un vehículo espacial con sus atributos básicos
 *
 * @author Brayan Stewart Guerrero Ordoñez
 */
public abstract class VehiculoEspacial {
    /**
     * Representa la variable donde se almacena el nombre del vehiculo espacial.
     */
    public String nombre;
    /**
     * Representa la variable del pais de donde pertenece el vehiculo espacial.
     */
    public String pais;
    /**
     * Representa la variable que indica el combustible que utiliza el vehiculo espacial.
     */
    public String combustible;
    /**
     * Representa la variable que indica la cantidad de combustible que dispone el vehiculo espacial.
     */
    public int cantidadCombustible; //Toneladas o litros

    /**
     * Representa una instancia de la clase VehiculoEspacial.
     */
    public VehiculoEspacial() {
        this.nombre = null;
        this.pais = null;
        this.combustible = null;
        this.cantidadCombustible = 0;
    }

    /**
     * Función que representa la aceleración del vehiculo espacial.
     */
    public void acelerar(){
        this.cantidadCombustible--;
    }

    public abstract String toString();
}
