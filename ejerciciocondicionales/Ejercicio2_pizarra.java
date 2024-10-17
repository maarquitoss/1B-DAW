
package ejerciciocondicionales;
import java.util.Scanner;

   public class Ejercicio2_pizarra {
   public static void main(String[] args) {
         Scanner scanner = new
     Scanner (System.in);
         
          System.out.println("Dime la primera edad");
     int edad1 = scanner.nextInt();
     System.out.println(" Dime la segunda edad" );
        int edad2 = scanner.nextInt();
        
        if(edad1>edad2)
        {
                System.out.println("La edad  mas joven es la segunda que es " + edad2);
                System.out.println("La edad mas mayor es " + edad1);
        }
        
        else if (edad1<edad2)
        {
            System.out.println("La edad mas joven es la primera que es " +  edad1);
            System.out.println("La edad mas mayor es " + edad2);
        }
        
        else
        {
              System.out.println("Son de la misma edad");
        }
        
        scanner.close();
    }
}
