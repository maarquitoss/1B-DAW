
package bucles;
import java.util.Scanner;

    public class ejercicio_46_3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        //Pide el numero al usuario
        System.out.println("Dime un numero");
        int num=scanner.nextInt();
        //La maquina saca el numero que tiene que adivinar el usuario
        int num2 = (int) (Math.random()*(100+1));
        int contador=0; // Para contar los intentos 
        System.out.println("El numero es " + num2);
            while(num!=num2) // El bucle sirve para decir que si es diferente tiene que seguir probando
             {
                 if(num<0||num>100) System.out.println("ERROR"); //Si metes un numero mayor sale error y baja hasta que te pide otro numero
                 else if (num<num2) // Dice que el numero introducido es menor al que la maquina ha creado
                 {
                     System.out.println("El numero introducido es menor");
                 }
                 else if (num>num2) // Dice que el numero es mayor al que la maquina ha creado
                 {
                     System.out.println("El numero introducido es mayor");
                 }
                 //Te pide que lo intentes de nuevo
                System.out.println("Dime nuevamente el numero porque no es el mismo que la maquina a buscado");
                num = scanner.nextInt();
                contador++;     // Contador de intentos
               }
            System.out.println("Has ganado el juego en " + contador + " intentos");  
            //Sale del bucle y te sale que has ganado y en los intentos que lo has conseguido
           }
                
            }
    
