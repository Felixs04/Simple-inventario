import java.util.Scanner;

public class SimpleInventary {

   public static String obtenerNombreArticulo(){
       Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del articulo: ");
        String nombre = scanner.nextLine();
        System.out.println("Usted ha ingresado el articulo: "+ nombre);
        return nombre;
   }
   public static void agregararticulo(String articulo) {
    }
    public static void removerarticulo(int id) {
    }
    public static double obtenrprecioarticulo(int id) {
        return 0.00;
    }
    public static void imprimirinventario(){
       Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
         String usuario = scanner.nextLine();
        System.out.println("Bienvenido " + usuario );
        String articuloexistente = obtenerNombreArticulo();
        System.out.println("Articulo existente: " + articuloexistente );

    }
    public static void main(String[] args) {
        imprimirinventario();
    }
}
