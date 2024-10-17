

package practica;
import java.util.Scanner;

    public class T1P1E1 {
    public static void main(String[] args) {
        
        //DECLARO EL SCANNER
        
        Scanner scanner = new Scanner(System.in);
        
        //PIDO EL NUMERO AL USUARIO
        
        System.out.print("Introduzca un numero entre entero: ");
        int numero = scanner.nextInt();
        
        //TRAS PEDIR EL NUMERO COMIENZO A FILTAR EL NUMERO PARA ENCONTRAR LA SOLUCION
        
        if(numero %2==0 && numero%5!=0)
        {
            System.out.println("El numero es par pero no es divisible entre 5");
        }
        
        else if (numero %2==0 && numero%5==0) 
        {
            System.out.println("El numero es par y es divisible entre 5");
        }
        
        else if(numero % 2 !=0 && numero %5 != 0)
        {
            System.out.println("El numero no es par y tampoco es divisible entre 5 ");
        }
        
        else 
        {
            System.out.println("El numero no es par pero es divisible entre 5 ");
        }
        
        //CIERRO EL SCANNER
        
         scanner.close();
        
    }

}
