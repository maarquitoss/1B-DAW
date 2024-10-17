

package practica;

import java.util.Scanner;


    public class T1P1E4 {


    public static void main(String[] args) {
        // DECLARO EL SCANNER
        
        Scanner scanner = new Scanner(System.in);
        
        //PIDO EL NUMEROS
        
        System.out.print("Introduce un numero positivo(numero negativo para salir): ");
        int numero = scanner.nextInt();
        
        //DECLARO VARIABLES PARA POSTERIORMENTE REALIZAR LOS CALCULOS
        int suma = 0;
        int contador= 0;
        double media;
        
        // CALCULOS PARA TENER EN CUENTA EL PRIMER  NUMERO QUE HA INTRODUCIDO EL USUARIO
        
        suma += numero;
        contador ++;
        
     //COMIENZO DEL BUCLE CON EL FIN DE QUE SI METE UN NUMERO NEGATIVO QUE ACABE EL PROGRAMA
     
        while (numero>0)
        {
            System.out.print("Introduce un numero positivo (numero negativo para salir):  ");
            numero = scanner.nextInt();
            
            // CREO EL FIN PARA QUE SI METE UN NUMERO NEGATIVO QUE NO CUENTE EN LOS CALCULOS,MEDIA E INTENTOS
            
            //EN CASO DE QUE SEA NEGATIVO 
            
            if(numero<0)
            {
              System.out.print(" ");  
            }
            
            // EN CASO DE QUE SEA POSITIVO
            
            else
            {
            contador++; //SUMA LOS NUMEROS INTRODUCIDOS
            suma += numero;  //VA SUMANDO LOS NUMEROS QUE HA INTRODUCIDO EL USUARIO
            } 
        }
        
        //RESULTADO DE LOS CALCULOS
        
        System.out.println("Se ha introducido " + contador + " numeros"); 
        System.out.println("La suma de todo ellos es " + suma);
         media = suma/contador;
        System.out.println("La media de todos ellos es  " + media);
        
    }

}
