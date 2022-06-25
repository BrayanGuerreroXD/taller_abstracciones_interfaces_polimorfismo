/**
 *
 *
 * @author Brayan Stewart Guerrero Ordoñez
 */
public abstract class VehiculoEspacial {
    public String nombre;
    public String pais;
    public String combustible;
    public int cantidadCombustible; //Toneladas o litros

    public VehiculoEspacial() {
        this.nombre = null;
        this.pais = null;
        this.combustible = null;
        this.cantidadCombustible = 0;
    }

    public void acelerar(){
        this.cantidadCombustible--;
    }
}
