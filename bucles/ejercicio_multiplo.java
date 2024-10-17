import java.util.Scanner;

public class ejercicio_multiplo {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el número base
        System.out.print("Introduce un número para encontrar sus múltiplos: ");
        int numero = scanner.nextInt();

        // Pedir al usuario cuántos múltiplos desea ver
        System.out.print("¿Cuántos múltiplos deseas ver?: ");
        int cantidadMultiplos = scanner.nextInt();

        // Inicializar el contador de múltiplos
        int contador = 1;

        // Usar un bucle while para mostrar los múltiplos
        System.out.println("Los primeros " + cantidadMultiplos + " múltiplos de " + numero + " son:");
        while (contador <= cantidadMultiplos) {
            System.out.println(numero * contador);
            contador++; // Incrementar el contador para obtener el siguiente múltiplo
        }

        // Cerrar el Scanner
        scanner.close();
    }
}