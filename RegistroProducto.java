import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RegistroProducto {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Producto> listaProductos = new ArrayList<>();

        String continuar;
        do {
            System.out.println("Ingrese datos del producto:");

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Limpiar el salto de línea

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Marca: ");
            String marca = scanner.nextLine();

            System.out.print("Precio: $");
            double precio = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el salto de línea

            // Crear y agregar el nuevo producto a la lista
            Producto producto = new Producto(id, nombre, marca, precio);
            listaProductos.add(producto);

            System.out.print("¿Desea registrar otro producto? (s/n): ");
            continuar = scanner.nextLine().trim();
        } while (continuar.equalsIgnoreCase("s"));

        // Mostrar productos usando Iterator
        System.out.println("\n--- Productos Registrados ---");
        Iterator<Producto> iterador = listaProductos.iterator();
        while (iterador.hasNext()) {
            Producto p = iterador.next();
            System.out.println(p);
        }

        scanner.close();   
    }
}
