
package ejerciciocondicionales;
import java.util.Scanner;

public class Ejercicio_24_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new
        Scanner (System.in);
        
        System.out.println("Dime tu nombre");
        String lanzada1 = scanner.next();
        
        System.out.println("Dime tu segundo nombre");
        String lanzada2 = scanner.next();
        
        int dado = (int) (Math.random()*(6+1));
        int dado2 = (int) (Math.random()*(6+1));
        
        if(dado > dado2 )
        {
            System.out.println("Ha ganado eljugar con el nombre de " + lanzada1);
        }
        
        else if (dado < dado2)
        {
            System.out.println("Ha ganado el segundo jugador con el nombre de " + lanzada2);
        }
        
        else
        {
            System.out.println("No ha ganado ninguno ha sido empate tecnico");
        }
                
           scanner.close();
    }
    
}
