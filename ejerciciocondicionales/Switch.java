
package ejerciciocondicionales;
import  java.util.Scanner;


    public class Switch {


    public static void main(String[] args) {
        // TODO code application logic here
            Scanner scanner = new 
            Scanner (System.in);
            
                        System.out.println("Dime el primer numeros");
                       int num = scanner.nextInt();
                       System.out.println("Dime el segundo numero");
                       int num2 = scanner.nextInt();
                       
            System.out.println("Dime la opcion");
            char opcion = scanner.next().charAt(0);
              
                       
            switch (opcion) 
            
            {
            
                case 'a' :
                     
                       int suma = num + num2;
                       System.out.println("La suma es "  +  suma);
                         
                break;
                
                case 'b' :
                    
                       int resta = num - num2;
                       System.out.println("La resta es "  + resta);
  
                break;
                
                case 'c' :
                        int division = num/num2;
                         System.out.println("La division es "  + division);
                    
               default: System.out.println("No es valido");
                           
            }
            
       scanner.close();
              
        
    }

}
