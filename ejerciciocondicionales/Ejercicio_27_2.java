

package ejerciciocondicionales;
import java.util.Scanner;

    public class Ejercicio_27_2 {


    public static void main(String[] args) {
        // TODO code application logic here
            Scanner scanner = new
            Scanner (System.in);
            
            System.out.println("Dime el numero POOC");
            int pooc = scanner.nextInt();
            int p;
            int oo;
            int c ;
            
            
            {
                  p = (int) (pooc)/1000;
                  oo= (int) (pooc/10) %100;
                   c = (int) (pooc/10);
                System.out.println("El numero es valido");
                System.out.println("p " + p);
                System.out.println("oo " + oo);
                System.out.println("c" + c );
                
            }
          
                System.out.println("No es valido ");
    }

}
