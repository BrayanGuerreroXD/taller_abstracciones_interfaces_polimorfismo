import java.util.ArrayList;
import java.util.Scanner;

/**
 * Representa la clase donde se crearan los vehiculos espaciales
 *
 * @author Brayan Stewart Guerrero Ordoñez
 */
public class Test {
    private static final Scanner sc = new Scanner(System.in); //Se crea el lector;
    ArrayList<VehiculoEspacial> lista = new ArrayList<>();

    public static void main(String[] args) {
        Test test = new Test();

        System.out.println("¿Desea empezar el juego?");

        String seguir = sc.nextLine();

        while(true){
            if (!seguir.equals("Y") && !seguir.equals("y")) break;
            else {
                test.imprimirOpciones();
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

    public void crearVehiculoEspacial(int opcion){
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

    public VehiculoEspacial crearLanzadera(){

    }

    public VehiculoEspacial crearNaveEspacial(){

    }

    public VehiculoEspacial crearSatelite(){

    }

    public VehiculoEspacial crearSonda(){

    }

    public void listarVehiculosEspaciales(){
        for(VehiculoEspacial vehiculo: lista){
            vehiculo.toString();
            System.out.println("------------------");
        }
    }

    public String buscarVehiculoEspacial(){
        String respuesta = "No";
        String nonbre = sc.nextLine();

        for(VehiculoEspacial vehiculo: lista){
            if(vehiculo.nombre.equals(nombre)){
                respuesta = "Si";
                break;
            }
        }

        return respuesta;
    }
}
