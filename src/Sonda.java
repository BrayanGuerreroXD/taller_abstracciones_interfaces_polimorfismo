/**
 * Representa una sonda que analiza algun astro
 *
 * @author Brayan Stewart Guerrero Ordoñez
 */
public class Sonda extends VehiculoEspacial implements NaveRobotica{
    public String destino;
    public int cantidadInformacion; //Cantidad en Gb de información

    public Sonda(){
        super();
        this.destino = null;
        this.cantidadInformacion = 0;
    }

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

    public String getDestino() {
        return destino;
    }

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
