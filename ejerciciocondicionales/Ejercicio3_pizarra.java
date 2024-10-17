

package ejerciciocondicionales;

import java.util.Scanner;


    public class Ejercicio3_pizarra {


    public static void main(String[] args) {
         Scanner scanner = new
     Scanner (System.in);
        System.out.println("Dime el primer numero");
     int num1 = scanner.nextInt();
     System.out.println("Dime el segundo numero" );
        int num2 = scanner.nextInt();
          System.out.println("Dime el tercer numero" );
        int num3 = scanner.nextInt();
        if(num1 > num2 && num1>num3 )
        {
            System.out.println("El numero mayor es primero que es " + num1);
        }

        else if(num2 > num1  &&  num2> num3)
        {
            System.out.println("El numero mayor es el segundo que es " + num2);
        }
        else if(num3 > num2  &&  num3 > num1 )
        {
            System.out.println("El numero mayor es tercero que es " + num3);
        }
        
        //------------------------------------------------------------------------------------------------------------------------------------------------------------------------------SEGUNDO APARTADO--------------------------------------------------------------------------------------------------------------------------------------------
                 if(num1 < num2 && num1<num3 )
        {
            System.out.println("El numero menor es primero que es " + num1);
        }

        else if(num2 < num1  &&  num2< num3)
        {
            System.out.println("El numero menor es el segundo que es " + num2);
        }
        else if(num3 < num2  &&  num3 < num1 )
        {
            System.out.println("El numero menor es tercero que es " + num3);
        }
        scanner.close();

    }

}
