/**
 * Representa una nave espacial tripulada con sus atributos y funciones
 *
 * @author Brayan Stewart Guerrero Ordoñez
 */
public class NaveTripulada extends VehiculoEspacial{
    public int tripulantes;
    public String destino;
    public int velocidad;

    public NaveTripulada(){
        super();
        this.tripulantes = 0;
        this.destino = null;
        this.velocidad = 0;
    }

    public NaveTripulada(String nombre, String pais, String combustible, int cantidadCombustible, int tripulantes, String destino){
        this.nombre = nombre;
        this.pais = pais;
        this.combustible = combustible;
        this.cantidadCombustible = cantidadCombustible;
        this.tripulantes = tripulantes;
        this.destino = destino;
        this.velocidad = 0;
    }

    @Override
    public void acelerar(){
        this.velocidad++;
        this.cantidadCombustible--;
    }

    public void frenar(){
        this.velocidad--;
    }

    public void apagarMotores(){
        this.velocidad = 0;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

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
