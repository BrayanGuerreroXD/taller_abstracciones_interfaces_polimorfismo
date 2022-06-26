/**
 * Representa el vehiculo lanzadera con sus atributos y funciones
 *
 * @author Brayan Stewart Guerrero Ordoñez
 */
public class Lanzadera extends VehiculoEspacial{
    public VehiculoEspacial carga;

    /**
     * Representa una instancia de la clase Lanzadera pero vacio
     */
    public Lanzadera(){
        super();
        this.carga = null;
    }

    /**
     * Representa una instancia de la clase Lanzadera con parametros de entrada
     * @param nombre nombre de la lanzadera
     * @param pais pais de donde proviene
     * @param combustible combustible que utiliza
     * @param cantidadCombustible cantidad de combustible del cual dispone
     * @param carga nave que transporta
     */
    public Lanzadera(String nombre, String pais, String combustible, int cantidadCombustible, VehiculoEspacial carga){
        this.nombre = nombre;
        this.pais = pais;
        this.combustible = combustible;
        this.cantidadCombustible = cantidadCombustible;
        this.carga = carga;
    }

    /**
     * Función que retorna si hay o no combustible
     * @return si hay o no combustible
     */
    public boolean ceroCombustible(){
        return this.cantidadCombustible == 0;
    }

    /**
     * Función que permite soltar la carga que transporta la lanzadera
     */
    public void soltarCarga(){
        if(ceroCombustible()) carga = null;
    }
}
