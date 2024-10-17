
package bucles;

import java.util.Scanner;

public class ejercicio_38_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            double nota1;
            double suma=0;
            double primernumero;
            
            
            int contador=1;
         
            System.out.println("Dime tu nota");
            nota1 = scanner.nextInt();
            primernumero=nota1;
            if(nota1 >0 && nota1 <=10)
            {
                System.out.println("El numero esta dentro de los parametros");
                while (nota1 != -1)
                {
                              
                    System.out.println("Usuario mete mas numeros ");
                    nota1 = scanner.nextInt();
                   suma+=nota1;
                    System.out.println(suma);
                    contador ++;
                }
                double media = primernumero+suma/contador;
                System.out.println("La media aritmetica es " + media);
    
        }
        else System.out.println("HAS METIDO UN NUMERO DIFERENTE ENTRE 0 Y 10");
            
            
    }

}
