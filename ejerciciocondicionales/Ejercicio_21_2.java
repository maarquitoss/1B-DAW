

package ejerciciocondicionales;

import java.util.Scanner;


    public class Ejercicio_21_2 {


    public static void main(String[] args) {
        // Programa que te dice si un año es bisiesto o no
        Scanner scanner = new
        Scanner (System.in);
        System.out.println("Dime un año");
        int año = scanner.nextInt();
        if (año %4 == 0 || año % 400 == 0 && año%100 !=0 )
        {
            System.out.println("Es bisiesto");
        }
        
        else
        {
            System.out.println("No Es bisiesto");
        }
        
            scanner.close();
    }

}
