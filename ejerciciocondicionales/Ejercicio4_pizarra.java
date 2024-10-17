
package ejerciciocondicionales;

import java.util.Scanner;

public class Ejercicio4_pizarra {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new
        Scanner (System.in);
       System.out.println("Dime un numero");
       int num1 = scanner.nextInt();
       
       if (num1>=1 && num1<=12)  
           
           {
               if (num1 == 1 || num1 == 2 || num1 == 12)
               {
                   System.out.println("Estamos en Invierno");
               }
               
               else if (num1 == 3 || num1 == 4 || num1 == 5)
               {
                   System.out.println("Estamos en Primavera");
               }
               
               else if (num1 == 6 || num1 == 7 || num1 == 8 )
               {
                   System.out.println("Estamos en Veranito");
               }
               
               else if (num1 == 9 || num1 == 10 || num1 == 11)
               {
                   System.out.println("Estamos en otoño");
               } 
           }
       
      else
          {
              System.out.println("ERROR");
          }
       
     scanner.close();
    
    }
}
