package bucles;

import java.util.Scanner;

public class ejercico_29_3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime los segundos transcurridos");
        int segundos = scanner.nextInt();

        while (segundos > 5400) {
            System.out.println("Mete unumero mas pequeño");
            segundos = scanner.nextInt();
        }
        while (segundos >= 0 && segundos <= 5400) {
            if (segundos >= 0 && segundos <= 5400) {
                int totaldesegundos = (segundos / 60)+1 ; // el +1 sirve para que se cumplan las condiciones que si del 0 al 59 sea del minito uno y si es del 60 al 119 es el minuto 2
                System.out.println("El minuto en el que nos encontramos es " + totaldesegundos);
            }
            System.out.println("Dime mas segundos");
            segundos = scanner.nextInt();

        }

        while (segundos < 0) {
            System.out.println("Fin del programa");
            return;
        }

        scanner.close();

    }
}
