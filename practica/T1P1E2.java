
package practica;

import java.util.Scanner;


    public class T1P1E2 {


    public static void main(String[] args) {
        
        //  DECLARO EL SCANNER
        
        Scanner scanner = new Scanner(System.in);
        
        //PIDO EL NUMERO AL USUARIO
        
        System.out.print("Introduzca un numero entre 15 y 27 : ");
        int num = scanner.nextInt();
        
        //REALIZO LA FUNCION PARA SACAR EL NUMERO ALEATORIO ENTRE EL 5 Y 50
        
        int maquina = (int) (Math.random()*(50)+5);
        
        //HAGO LA COMPROBACION DE SI EL NUMERO INTRODUCIDO ESTA ENTRE EL 15 Y 27 INCLUIDOS
        
        if(num<15 || num > 27)
        {
            System.out.println("ERROR: El numero introducido no esta en el rango indicado");
        }
        
        //SI ESTA DENTRO DEL RANGO COMIENZA EL JUEGO 
        
        else
        {
            System.out.println("La maquina ha sacado un " + maquina);
                    
            //COMPROBACION DE LOS NUMEROS PARA DETERMINAR EL GANADOR
            
                if(maquina>num)
               {
                   System.out.println("La maquina gana!!");
               }
               else if (maquina<num)
               {
                   System.out.println("Tu ganas!!!");
               }
               else
               {
                   System.out.println("Son iguales");
               }
                   
        }
        // CIERRO EL SCANNER
       
      scanner.close();
      
    }

}
