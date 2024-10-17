import java.util.Scanner;
public class Ejercicio2 {


    public static void main(String[] args) {
    Scanner scanner = new
    Scanner (System.in);
        System.out.println("Dime el primer numero");
        int numero1 = scanner.nextInt();
        System.out.println("Dime el segundo numero");
        int numero2 = scanner.nextInt();
        int suma = numero1+numero2;
        int resta = numero1-numero2;
        int multi = numero1*numero2;
        int division = numero1/numero2;
        double elevado = Math.pow(numero1, numero2);
        
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es " + suma);
        System.out.println("La resta de " + numero1 + " y " + numero2 + " es " + resta);
        System.out.println("La multiplicacion de " + numero1 + " y " + numero2 + " es " + multi);
        System.out.println("La division de " + numero1 + " y " + numero2 + " es " + division);
        System.out.println(+ numero1 + " elevado a  " + numero2 + " da " + elevado);
        
        
        
        
        
        
        
        
        
   } 
}
