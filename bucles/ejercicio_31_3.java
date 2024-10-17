

package bucles;
import java.util.Scanner;

    public class ejercicio_31_3 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Dime tus numeros");
        int numero= scanner.nextInt();
        int divisor=1;
        if(numero==0)
        {
            System.out.println("No tiene divisores");
        }
        else 
        {
            while(divisor<=numero)
            {
              
               if(numero%divisor==0)
               {
                   System.out.println("Los divisores son " +  divisor); 
               }
               divisor++;
            }
        }
    }

}
