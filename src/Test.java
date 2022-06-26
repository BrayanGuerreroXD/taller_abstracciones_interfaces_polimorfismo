import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 * Representa la clase donde se crearan los vehiculos espaciales
 *
 * @author Brayan Stewart Guerrero Ordoñez
 */
public class Test {
    private static final Scanner sc = new Scanner(System.in); //Se crea el lector;

    private static final Random rd = new Random();

    ArrayList<VehiculoEspacial> lista = new ArrayList<>();

    String[] nombresVehiculos = { "Mark", "Dragon", "Explorer", "Falcon", "Atlas", "Delta", "Apolo", "SkyWalker"};
    String[] nombresPaises = { "EEUU", "Rusia", "Corea del Sur", "Japón", "China"};
    String[] nombresCombustible = { "Queroseno", "Solido", "Liquido", "Solido + Liquido", "Panel Solar", "Aerozina"};
    String[] nombresDestino = { "Luna", "Marte", "Jupiter", "Saturno", "Venus", "Plutón"};

    public static void main(String[] args) {
        Test test = new Test();

        System.out.println("¿Desea empezar el juego?");

        String seguir = sc.nextLine();

        while(true){
            if (!seguir.equals("Y") && !seguir.equals("y")) break;
            else {
                test.imprimirOpciones();
                int opcion = sc.nextInt();
                test.acciones(opcion);
            }
        }
    }

    public void imprimirOpciones(){
        System.out.println("Elige lo que haras:");
        System.out.println("1. Crear una lanzadera");
        System.out.println("2. Crear una nave espacial");
        System.out.println("3. Crear un satélite");
        System.out.println("4. Crear una sonda");
        System.out.println("5. Listar vehiculos espaciales");
        System.out.println("6. Buscar un vehiculo espacial");
        System.out.println("7. Terminar juego");
    }

    public void acciones(int opcion){
        switch (opcion){
            case 1: this.crearLanzadera();
            case 2: this.crearNaveEspacial();
            case 3: this.crearSatelite();
            case 4: this.crearSonda();
            case 5: this.listarVehiculosEspaciales();
            case 6: this.buscarVehiculoEspacial();
            default: break;
        }
    }

    public void crearLanzadera(){
        VehiculoEspacial lanzadera = new Lanzadera(
                getNombreVehiculo(this.nombresVehiculos),
                getPais(this.nombresPaises),
                getCombustible(this.nombresCombustible),
                getCantidadCombustible(),
                null
        );
        lista.add(lanzadera);
    }

    public void crearNaveEspacial(){
        VehiculoEspacial nave = new NaveTripulada(
                getNombreVehiculo(this.nombresVehiculos),
                getPais(this.nombresPaises),
                getCombustible(this.nombresCombustible),
                getCantidadCombustible(),
                (int) Math.floor(Math.random()*6+1),
                getDestino(this.nombresDestino)
        );
        lista.add(nave);
    }

    public void crearSatelite(){
        VehiculoEspacial satelite = new Satelite(
                getNombreVehiculo(this.nombresVehiculos),
                getPais(this.nombresPaises),
                getCombustible(this.nombresCombustible),
                getCantidadCombustible(),
                (int) Math.floor(Math.random()*6+1),
                rd.nextBoolean()
        );
        lista.add(satelite);
    }

    public void crearSonda(){
        VehiculoEspacial sonda = new Sonda(
                getNombreVehiculo(this.nombresVehiculos),
                getPais(this.nombresPaises),
                getCombustible(this.nombresCombustible),
                getCantidadCombustible(),
                getDestino(this.nombresDestino),
                (int) Math.floor(Math.random()*6+1)
        );
        lista.add(sonda);
    }

    public void listarVehiculosEspaciales(){
        for(VehiculoEspacial vehiculo: lista){
            vehiculo.toString();
            System.out.println("------------------");
        }
    }

    public void buscarVehiculoEspacial(){
        String respuesta = "No";
        String name = sc.nextLine();

        for(VehiculoEspacial vehiculo: lista){
            if(vehiculo.nombre.equals(name)){
                respuesta = "Si";
                break;
            }
        }
        System.out.println(respuesta);
    }

    public String getNombreVehiculo(String[] listado){
        int numero = (int) Math.floor(Math.random()*7+1);
        int serie = (int) Math.floor(Math.random()*10+1);
        return (listado[numero] + " "+serie);
    }

    public String getPais(String[] listado){
        int numero = (int) Math.floor(Math.random()*4+1);
        return listado[numero];
    }

    public String getCombustible(String[] listado){
        int numero = (int) Math.floor(Math.random()*6+1);
        return listado[numero];
    }

    public int getCantidadCombustible(){
        return (int) Math.floor(Math.random()*10+1)*1000;
    }

    public String getDestino(String[] listado){
        int numero = (int) Math.floor(Math.random()*5+1);
        return listado[numero];
    }
}
