/**
 *
 *
 * @author Brayan Stewart Guerrero Ordoñez
 */
public class Sonda extends VehiculoEspacial implements NaveRobotica{
    public int cantidadInformacion; //Cantidad en Gb de información

    public Sonda(){
        super();
        this.cantidadInformacion = 0;
    }

    public Sonda(String nombre, String pais, String combustible, int cantidadCombustible, int cantidadInformacion) {
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
