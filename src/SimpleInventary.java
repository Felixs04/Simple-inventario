import java.util.Scanner;

public class SimpleInventary {

    static String [] articulos = new String [5];




    public static String obtenerNombreArticulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del articulo: ");
        String nombre = scanner.nextLine();
        if (nombre.length() > 3) {
            return nombre;
        } else {
            return " Error en operacion!";
        }

    }

    public static void agregarArticulo() {
      for (int i = 0; i < articulos.length; i++) {
          articulos[i] = obtenerNombreArticulo();
      }
    }

    public static void removerArticulo(int id) {
        if (id > 0) {
            System.out.println("Removido");
        }
    }

    public String obtenrprecioarticulo(String articulo, double precio) {
        double random = (Math.random() * 5000) + 100;
        if (articulo.startsWith("mar") && precio >= 0.00) {
            return "Articulo " + articulo + " tiene un valor de RD$ " + random;

        } else if (articulo.startsWith("tab") || precio >= 12000.0) {
            return "Articulo" + articulo + " tiene un valor que sobrepasa los 12,000.00." + " El monto es de RD$" + random;

        } else {
            return " Ninguno de los escenarios pudo aplicar";
        }

    }

    public static void imprimirinventario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String usuario = scanner.nextLine();
        System.out.println("Bienvenido " + usuario);
        String articuloexistente = obtenerNombreArticulo();
        System.out.println("Articulos resgistrados: ");
        for (String articulo : articulos) {
            System.out.println(articulo);
        }

    }
     public static void  modificarArticulo() {
         String nombre = obtenerNombreArticulo();
         double precio = (Math.random() * 5000) + 100;
         if (nombre.startsWith("A") || nombre.startsWith("D")) {

             if (precio > 150 && precio <= 250) {
                 precio = precio + (precio * 0.02);
                 System.out.println(nombre + precio);
             }

            else if (precio > 250 && precio <= 500) {
                 precio = precio + (precio * 0.08);
                 System.out.println(nombre + precio);

             }

            else if
             (nombre.startsWith("C") || nombre.startsWith("M")) {
                 precio = precio + (precio * 0.20);
                 System.out.println(nombre + precio);
             }

             else {
                 precio = precio + (precio * 0.12);
                 System.out.println(nombre + precio);
             }

         }
     }

    public static void main(String[] args) {
        agregarArticulo();
       imprimirinventario();


    }
}





