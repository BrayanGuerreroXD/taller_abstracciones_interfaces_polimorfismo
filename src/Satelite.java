/**
 *
 *
 * @author Brayan Stewart Guerrero Ordoñez
 */
public class Satelite extends VehiculoEspacial implements NaveRobotica{
    public int cantidadInformacion; //Cantidad en Gb de información

    public Satelite(){
        super();
        this.cantidadInformacion = 0;
    }

    public Satelite(String nombre, String pais, String combustible, int cantidadCombustible, int cantidadInformacion){
        this.nombre = nombre;
        this.pais = pais;
        this.combustible = combustible;
        this.cantidadCombustible = cantidadCombustible;
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

    @Override
    public void acelerar() {
        this.cantidadCombustible--;
    }
}
