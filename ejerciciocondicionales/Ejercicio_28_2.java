
package ejerciciocondicionales;
import java.util.Scanner;
public class Ejercicio_28_2 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new 
        Scanner  (System.in);
        
        System.out.println("Dime el numero a desglosar");
        int dinero = scanner.nextInt();

        
      
        if (dinero >= 500)
        {
            int billete500 = dinero / 500; // se tiene que declarar las variables dentro para que cuando se vaya ejecutando el programa se guarde la nueva cantidad tras realizar los calculos
            System.out.println("La cantidad de billetes de 500 son " + billete500);
             dinero %= 500;  // esto sirve como el contador de 1 billete de 200 y cuando se vaya al siguinte if no cuente desde la cantidad que ha introudcido el usuarioS
        }
        if (dinero >= 200)
        {
            int billete200 = dinero/200;
            System.out.println("La cantidad de billetes de 200 son " + billete200);
           dinero %= 200;
        } 
        if (dinero >= 50)        
        {
            int billete50 = dinero/50; 
            System.out.println("La cantidad de billetes de 50 son " + billete50);
            dinero %= 50;
        }
        if(dinero >= 20)
        {
            int billete20 = dinero/20;
            System.out.println("La cantidad de billetes de 20 son " + billete20);
           dinero %= 20;
            
        }
        
        if( dinero >= 10)
        {
            int billete10 = dinero/10;
            System.out.println("La cantidad de billetes de 10 son " + billete10);
            dinero %= 10;
        }
        if (dinero >= 5 )
        {
            int billete5 = dinero/5;
             System.out.println("La cantidad de billetes de 5 son " + billete5);
           dinero %= 5;
        }
        if (dinero >= 2 )
        {   
            int moneda2 = dinero/2; 
             System.out.println("La cantidad de moneda de 2 son " + moneda2);
             dinero %= 2;
           
        }
        if (dinero >= 1)
        {
             int moneda1 = dinero/1;
            System.out.println("La cantidad de monedas es " + moneda1);
                  
        }
        
                scanner.close();
            
    }
    
}
