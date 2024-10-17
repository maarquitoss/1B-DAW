
package ejerciciocondicionales;
import java.util.Scanner;

    public class Ejercicio_26_2 {
        


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new
        Scanner (System.in);
        System.out.println("Dime tu nick");
        String nick = scanner.next();
        System.out.println("Dime tu email");
        String email = scanner.next();
        System.out.println("Dime tu contraseña");
        int contraseña = scanner.nextInt();
        if( email.equals ("marcoscabello")  && contraseña == 12345  )
        {
            System.out.println("Es correcto");
            int numero = (int)(Math.random()*(9999-1000+1)+1000);
            System.out.println("El numero de seguridad es " + numero );
            System.out.println("Dime nuevamente el correo,la contraseña y el numero de seguridad");
               email = scanner.next();
               int  contraseña2 = scanner.nextInt();
               int numero2 = scanner.nextInt();
               if (email.equals("marcoscabello") && contraseña2 == 12345 && numero2 == numero)
               {
                   System.out.println("Verificación aceptada.");
               }
          
                else
                     {
                             System.out.println("Error");
                        }
        }
        
        else
        {
            System.out.println("El email y la contraseña es incorrecta por lo tanto no puedes hacer la verificacion en dos pasos");
        }
        
        scanner.close();
   }

}
