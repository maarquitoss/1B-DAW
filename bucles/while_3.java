

package bucles;
import java.util.Scanner;

    public class while_3 {


    public static void main(String[] args) {
        // TODO code application logic here
              Scanner scanner = new
           Scanner (System.in);
              System.err.println("Dime el numero");
              int numero = scanner.nextInt();
              while(numero<150){
                     if(numero%2==0)
                {
                     System.out.println("El numero es par y es VERDE");
                 }
                  else
                     System.out.println("Es impar y es ROJO");
                     
                     System.out.println("Dime el numero");
                     numero = scanner.nextInt();
              }
                System.out.println("PUTA ");
 
    }

}
