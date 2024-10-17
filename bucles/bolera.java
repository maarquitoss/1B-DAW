
// ARREGLARLO
package bucles;
import java.util.Scanner;

    public class bolera {
           

    public static void main(String[] args) {
        // TODO code application logic here
            Scanner scanner = new
           Scanner (System.in);
            int precio = 8;
            double precio1 = 0;
            int edad = 0;
            int preciototal= 0;
   
            
          
          System.out.println("Dime cuantas personas sois");
          int personas = scanner.nextInt();
         
          while (personas>0)
          {
               System.out.println("Dime tu edad");
               edad = scanner.nextInt(); 
               personas--;  // esto es para que cada vez que pase el bucle se le reste uno 
          
            
               if (edad<=5)
            {
                 System.out.println("NO PAGAN");
                 precio1 = 0;
            }
          
            if (edad<=5)
            {
                 System.out.println("NO PAGAN");
                 precio1 = 0;
            }
           else if ( edad >= 5 && edad <15)
            {
                 System.out.println("Descuento del 25%");
                 precio1 = (precio*0.75);
            }
           else if (edad>=15 && edad < 60)
            {
                   precio1= (precio*0.75);     
            }
           
           else if (edad >=61 && edad <= 73)
             {
                        System.out.println("PAGA EL 75% DE LA ENTRADA");
                       precio1 = (precio*0.75);
              }
           else 
               precio = 0; 
             }
            
                 System.out.println("-------------------------------------------TICKET-------------------------------------------");
                 System.out.println("----------------------------------------------BOLERA BOCADILLO DE GABI-------------------------------------");
                 System.out.println("Tiene " + edad + "años");
                 System.out.println("Precio es " + precio );
                 preciototal = preciototal+precio;
                 System.out.println("El precio total es " + preciototal);
         
    }      
    
    String lista = " "; 
    }

// preguntar cuanta gente viene y hacer el precio del total. HACER UN WHILE QUE SE COMA TODO

