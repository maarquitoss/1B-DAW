
package ejerciciocondicionales;

import java.util.Scanner;

public class Ejercicio_22_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new
        Scanner (System.in);
        System.out.println("Dime un mes");
        int mes = scanner.nextInt();
        System.out.println("Dime un año");
        int año = scanner.nextInt();
        if(mes > 0 && mes <= 12)
        {
            System.out.println(" ");
            
        if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 )
        {
            System.out.println("Tiene 31 dias");
        }
        
        else if( mes == 4 || mes == 6 || mes == 9 || mes == 11)
            
        {
            System.out.println("Tiene 30 dias ");
        }
        
        else if (mes == 2)
        {
             if (año %4 == 0 || año % 400 == 0 && año!=0 )
        {
            System.out.println("Es bisiesto por lo tanto tiene 28 dias");
        }
             else 
             {
                 System.out.println("Tiene 29 dias");
             }
        }
                    
        }
        
        else
        {
            System.out.println("Mal tiene que meter un numero entre el 1 y el 12 ");
            return;
        }
        
        

    }
    
}
