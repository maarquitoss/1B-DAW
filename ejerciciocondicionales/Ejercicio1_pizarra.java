
package ejerciciocondicionales;

import java.util.Scanner;


    public class Ejercicio1_pizarra {


    public static void main(String[] args) {
         Scanner scanner = new
        Scanner (System.in);
         
         System.out.println("Dime un numero");
         int num = scanner.nextInt();
       
          
         if  (num%2 == 0 )
          {
              System.err.println("Es par");
          }
          else
          {
              System.err.println("Es impar");
          }
         
         
    }

}
