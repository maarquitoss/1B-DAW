
package bucles;

import java.util.Scanner;

public class menu_switch_repetitivo {


    public static void main(String[] args) {
        // TODO code application logic here
            Scanner scanner = new 
            Scanner (System.in);
           
           char opcion = 0;

            while (opcion != 'd' )   {
                
           System.out.println("Dime el primer numeros");
           int num = scanner.nextInt();
           System.out.println("Dime el segundo numero");
           int num2 = scanner.nextInt();
                  
            System.out.println("A. Suma");
            System.out.println("B. Resta");
            System.out.println("C. Division"); 
            System.out.println("D. SALIR ");
            opcion = scanner.next().charAt(0);
           

           switch (opcion) 
            
            {
               case 'a' :
                     
                       int suma = num + num2;
                       System.out.println("La suma es "  +  suma);
    
                break;
                
                case 'b' :
                    
                       int resta = num - num2;
                       System.out.println("La resta es "  + resta);
                       
                break;
                
                case 'c' :
                    
                            int division = num/num2;
                            System.out.println("La division es "  + division);
                     
                   break;
                    
              
               }             
 
    }
            scanner.close();

}
}
