import java.util.Scanner;
public class Ejercicio1 {


    public static void main(String[] args) {
       Scanner scanner = new
       Scanner (System.in);
       System.out.println("Dime tu nombre");
       String nombre = scanner.next();
       
       System.out.println("Dime tu DNI ");
       String dni = scanner.next();
        
        
       System.out.println("Dime tu fecha de nacimiento");
       String fecha = scanner.next();
        
       System.out.println("Tu nombre es ...............; " + nombre);
       System.out.println("Tu DNI es ...............; " + dni);
       System.out.println("Tu fecha de nacimiento es ...............; " + fecha);
  
       
       scanner.close();
    }
}
