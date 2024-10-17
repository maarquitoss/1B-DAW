
package bucles;
import java.util.Scanner;

    public class BUCLES_APUNTES {


    public static void main(String[] args) {
        // TODO code application logic here
        // Hay varios tipos de bucles.
        Scanner scanner = new
           Scanner (System.in);
             //- -------------------------------------------------------------------------------------------------------------------------------------------WHILE
        
        System.out.println("Dime el numero");
        int num1 = scanner.nextInt();
        while (num1!=10)
        {
            System.out.println("Hazlo de nuevo es el numero incorrecto");
            System.out.println("Dime el numero");
           num1 = scanner.nextInt();
        }
        System.out.println("Bien has puesto el numero acertado");
         
        //- ---------------------------------------------------------------------------------------------------------------------------------2 TIPO

    }

}
