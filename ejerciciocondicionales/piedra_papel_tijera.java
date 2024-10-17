

package ejerciciocondicionales;

import java.util.Scanner;


    public class piedra_papel_tijera {


    public static void main(String[] args) {
        // TODO code application logic here
        String tijeras= "tijeras";
        String papel= "papel";
        String piedra= "piedra";
        
        Scanner scanner = new
        Scanner (System.in);
        System.out.println("Dime la eleccion de la primera persona");
       String juga1 = scanner.nextLine();
        System.out.println("Dime la eleccion de la segunda persona");
        String juga2 = scanner.nextLine();
       
        
        if (juga1.equals("piedra"))
        {
            System.out.println("");
        }
        else if (juga1.equals("papel"))
        {
            System.out.println("");
        }
        else if (juga1.equals("tijera"))
        {
            System.out.println("");
        }
        else
        {
            System.out.println("ERROR");
        }
        
        
           if (juga2.equals("piedra"))
        {
            System.out.println("");
        }
        else if (juga2.equals("papel"))
        {
            System.out.println("");
        }
        else if (juga2.equals("tijera"))
        {
            System.out.println("");
        }
        else
        {
            System.out.println("ERROR");
        }
           
          if(juga1.equals("piedra") && juga2.equals("tijera"))
                  {
                      System.out.println("Gana el jugador 1");
                  }
          
          else if(juga1.equals("tijera") && juga2.equals("papel"))
                  {
                      System.out.println("Gana el jugador 1");
                  }
          else  if(juga1.equals("papel") && juga2.equals("piedra"))
                  {
                      System.out.println("Gana el jugador 1");
                  }
          
          else if(juga2.equals("piedra") && juga1.equals("tijera"))
                  {
                      System.out.println("Gana el jugador 2");
                  }
          
          else if(juga2.equals("tijera") && juga1.equals("papel"))
                  {
                      System.out.println("Gana el jugador 2");
                  }
          else  if(juga2.equals("papel") && juga1.equals("piedra"))
                  {
                      System.out.println("Gana el jugador 2");
                  }
          
          else  
          {
              System.out.println("Empate");
          }
          
          
           
           
           
           
           
           
           
           
           
    }

}
