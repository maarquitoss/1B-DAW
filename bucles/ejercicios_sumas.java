

package bucles;
import java.util.Scanner;

    public class ejercicios_sumas {


    public static void main(String[] args) {
        // TODO code application logic here
            Scanner scanner = new
           Scanner (System.in);
            System.out.println("Dime el tope");
            int tope = scanner.nextInt();
            while(tope<2)
            {
                System.out.println("Mal, pon otro numero");
                tope = scanner.nextInt();
            }
           int sumatorio = 0;
           int sumatorio2 = 0;
           
           while (sumatorio!=tope)
           {
               sumatorio ++;
               sumatorio2 = (sumatorio2+sumatorio);
               
           System.out.println("El numero es " + sumatorio);
           

           }
           System.out.println("La suma final es " + sumatorio2);
    }

}
// ESTA BIEN 