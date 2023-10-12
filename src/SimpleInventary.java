import java.util.Scanner;

public class SimpleInventary {

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

    public static void agregarArticulo(String articulo) {
        if (articulo.length() > 4) {
            System.out.println("Articulo agregado exitosamente!");

        } else {
            System.out.println("No se permite este articulo");
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
        System.out.println("Articulo existente: " + articuloexistente);

    }

    public static void main(String[] args) {
        obtenerNombreArticulo();

    }
}





