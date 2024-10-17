

package practica;

import java.util.Scanner;


    public class T1P1E3 {


    public static void main(String[] args) {
        //DECLARO EL SCANNER
        
        Scanner scanner = new Scanner(System.in);
        
        //DECLARO VARIABLES PARA POSTERIORMENTE PODER REALIZAR LOS IF 
        
        String  tarta = "tarta";
        String palmera = "palmera";
        String  mixto = "mixto";
        String pitufo = "pitufo";
        String  tomate ="tomate";
        String infusion ="infusion";
        String  cafe ="cafe";
        double precio =0;
        double precio2 =0;
        
        //LE PIDO AL USUARIO LO QUE QUIERE
        
        System.out.print("Que ha tomado de comer (palmera,tarta o pitufo):");
        String comida = scanner.next();
        
        // REALIZO LAS CONDICIONES PARA DETERMINAR EL PRECIO DE LA COMIDA
        
        if (comida.equals(palmera))
        {
            double palmeraprecio = 1.40;
            System.out.println("Palmera: " + palmeraprecio ); 
            precio =palmeraprecio;
        }
        else if (comida.equals(tarta))
        {
            double tartaprecio = 1;
            System.out.println("Tarta: " + tartaprecio ); 
            precio = tartaprecio;
        }
        else if (comida.equals(pitufo))
        {
            System.out.println("Que pitufo quiere");
            String pitufo2 =scanner.next();
                if(pitufo2.equals(mixto))
                {
                    double mixtoprecio = 1.60;
                     System.out.println("Pitufo mixto: " + mixtoprecio ); 
                     precio = mixtoprecio;
                 }
                 else if (pitufo2.equals(tomate))
                 {
                     double tomateprecio = 1.20;
                     System.out.println("Pitufo con tomate " + tomateprecio);
                     precio = tomateprecio;
                 }
           }
        
        //PIDO AL USUARIO LO QUE QUIERE BEBER
        
                System.out.println("Que ha tomado de beber");
                String bebida = scanner.next();
                
          // REALIZO LAS CONDICIONES PARA DETERMINAR EL PRECIO DE LA COMIDA
                
                if( bebida.equals(infusion))
                {
                    double infusionprecio = 1.25;
                    System.out.println("Infusion: " + infusionprecio);
                    precio2 = infusionprecio;
                }
                else if (bebida.equals(cafe))
                {
                    double cafeprecio = 1.50;
                    System.out.println("Cafe: " + cafeprecio);
                    precio2 = cafeprecio;
                }
                
                // TOTAL A PAGAR 
                
                double cuenta = precio+precio2;
                System.out.println("Total desayuno: " + cuenta);
    
    }

}
