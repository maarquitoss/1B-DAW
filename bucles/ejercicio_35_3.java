
package bucles;

import java.util.Scanner;

public class ejercicio_35_3 {

    public static void main(String[] args) {
        // TODO code application logic here
        //Pide los numeros
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime n");
        int n = scanner.nextInt();
        System.out.println("Dime m");
        int m = scanner.nextInt();
        String lista = "";
        
        int limite=n*m; // Hace el maximo
        int i = n; // sirve para controlar el bucle y que no sea infinito
        // para sacar los multiplos
        // para detener el codigo
        if(n==0)
        {
            System.out.println("No tiene multiplos");
                    
        }
        
        else{
            while (i<=limite) //Si n es menos o igual a limite que vaya comprobando los multiplos
            {
                i+=n;
                lista +=i+"," ;
                
            }
           
        }
        System.out.println(lista);
        
    }
}

//EXPLICAR
