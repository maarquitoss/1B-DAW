
package bucles;
import java.util.Scanner;

    public class ejercicio_46_3_bucle {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num=scanner.nextInt();
        int num2 = (int) (Math.random()*(100+1));
        int contador=0;
        System.out.println("El numero es " + num2);
            while(num!=num2)
             {
                 if(num<0||num>100) System.out.println("ERROR");
                 else if (num<num2)
                 {
                     System.out.println("El numero introducido es menor");
                 }
                 else if (num>num2)
                 {
                     System.out.println("El numero introducido es mayor");
                 }
                System.out.println("Dime nuevamente el numero porque no es el mismo que la maquina a buscado");
                num = scanner.nextInt();
                contador++;     
               }
            System.out.println("Has ganado el juego en " + contador + " intentos");
           }
                
            }
    
