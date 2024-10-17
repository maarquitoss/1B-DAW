
package bucles;

import java.util.Scanner;

public class ejercicio_47_mejorado {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        //Pide el numero total de las bolas que tiene la urna
        System.out.println("Dime las bolas que quiere que tenga la urna");
        int numero = scanner.nextInt();
        //Este while es para que tenga que meter un numero postivo SI O SI
        while(numero<0)
        {
            System.out.println("Dime el numero de bolas");
            numero = scanner.nextInt();
            
        }
            // Atraves de dos numeros saca quien comienza a traves del azar
            int turno = (int) (Math.random()*2+1);
            while(numero>0)
            {
                    if(turno == 1) //EL RANDOM SACA 1 COMIENZA LA MAQUINA
                    {
                        System.out.println("Le toca a la maquina");
                        int bolasrestamaquina = (int)(Math.random()*3+1);
                        System.out.println("La maquina saca " + bolasrestamaquina + " bolas");
                        numero-=bolasrestamaquina;
                        turno = 2;
                    }
                    else //EL RANDOM SACA 2 COMIENZA EL USUARIO
                    {
                        System.out.println("Le toca al usuario");
                        int restausuario = scanner.nextInt();
                       while(restausuario <= 0 ||   restausuario  >= 4) 
                    //Esto es para controlar el numero que mete el usuario
                        {
                             System.out.println("Introduce nuevamente las bolas que quieres retirar");
                             restausuario = scanner.nextInt();
                        }
                            numero-=restausuario; 
                           turno =1;          
            }
            if (numero<0) numero=0;
            System.out.println("Quedan " + numero );
            }
            if (turno==1) System.out.println("Pierde la maquina");
            else System.out.println("Pierde el usuario");
            
            scanner.close();
        }
   
         
    }

