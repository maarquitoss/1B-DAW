

package bucles;
import java.util.Scanner;

    public class while_lista {


    public static void main(String[] args) {
        Scanner scanner = new
           Scanner (System.in);
        // TODO code application logic here
        System.out.println("Dime el numero");
        int numeros = scanner.nextInt();
         int suma = 0;
         String lista = " ";
        while(numeros>=0) 
        {
            suma=(numeros+suma);
            System.out.println("La suma es " + suma);
            lista=numeros + lista+" ";
            numeros = scanner.nextInt();
        }
        System.out.println("Acabaste es numero negativo");
        System.out.println( lista);       
 }

}
