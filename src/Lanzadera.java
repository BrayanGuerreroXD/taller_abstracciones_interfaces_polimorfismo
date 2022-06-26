/**
 * Representa el vehiculo lanzadera con sus atributos y funciones
 *
 * @author Brayan Stewart Guerrero Ordoñez
 */
public class Lanzadera extends VehiculoEspacial{
    public VehiculoEspacial carga;

    public Lanzadera(){
        super();
        this.carga = null;
    }

    public Lanzadera(String nombre, String pais, String combustible, int cantidadCombustible, VehiculoEspacial carga){
        this.nombre = nombre;
        this.pais = pais;
        this.combustible = combustible;
        this.cantidadCombustible = cantidadCombustible;
        this.carga = carga;
    }

    public boolean ceroCombustible(){
        return this.cantidadCombustible == 0;
    }

    public void soltarCarga(){
        if(ceroCombustible()) carga = null;
    }
}
