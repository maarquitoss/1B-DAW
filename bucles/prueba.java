import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el primer número (n)
        System.out.print("Introduce el primer número (n): ");
        int n = scanner.nextInt();

        // Pedir al usuario que ingrese el segundo número (m)
        System.out.print("Introduce el segundo número (m): ");
        int m = scanner.nextInt();

        // Calcular el límite superior (m*n)
        int limite = m * n;

        System.out.println("Los múltiplos de " + n + " entre " + n + " y " + limite + " son:");

        // Variable para el múltiplo actual
        int multiplo = n + n;  // Comenzamos desde el segundo múltiplo

        // Usar un bucle while para mostrar los múltiplos de n
        while (multiplo <= limite) {
            System.out.print(multiplo);
            multiplo += n; // Incrementar el múltiplo
            if (multiplo <= limite) {
                System.out.print(", "); // Mostrar la coma entre múltiplos
            }
        }
        System.out.println(); // Para saltar a la siguiente línea después de mostrar los múltiplos

        // Cerrar el Scanner
        scanner.close();
    }
}