
package bucles;
import java.util.Scanner;

public class while_4 {


    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new
         Scanner (System.in);
         System.out.println("Dime tu nick");
         String nick = scanner.next();
         System.out.println("Dime tu contraseña");
         String contrasena = scanner.next();
         int intentos =1;
         
             while((!nick.equals("mancos") ||!contrasena.equals("1234abc")) && intentos<=3)
             {
                  System.out.println("Dimelo de nuevo has fallado");
                             contrasena = scanner.next();
                             nick = scanner.next();
                             intentos ++;  
             }
             if (intentos>=3)
                 System.out.println("Error");
             else
                 System.out.println("Bien");  
                           
             }
    }