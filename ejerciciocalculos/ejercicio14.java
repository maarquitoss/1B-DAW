
import java.util.Scanner;

public class ejercicio14 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime los segundos transcurridos");
        int segundos = scanner.nextInt();
        if (segundos >= 5400)
        {
        System.out.println("Partido acabado");
        }
        else
        {
            int totaldesegundos = (segundos / 60)+1; // el +1 sirve para que se cumplan las condiciones que si del 0 al 59 sea del minito uno y si es del 60 al 119 es el minuto 2
            System.out.println("El minuto en el que nos encontramos es " + totaldesegundos);
        }
        
    scanner.close();

    }
}
