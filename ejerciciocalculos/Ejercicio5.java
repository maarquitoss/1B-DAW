import java.util.Scanner;
public class Ejercicio5 {


    public static void main(String[] args) {
        Scanner scanner = new
        Scanner (System.in);
        System.out.println("Dime un tiempo expresado en segundos");
        int numero1 = scanner.nextInt();
        int minutos = numero1/60;
        int horas = (numero1/60)/60;
        int segundos = numero1/1;
        System.out.println("Los horas son " + horas);
        System.out.println("Los minutos son " + minutos);
        System.out.println("Los segundos son " + segundos);
        
        
        
        scanner.close();
        
    }

}
