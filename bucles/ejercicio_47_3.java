

package bucles;
import java.util.Scanner;

    public class ejercicio_47_3 {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        //Pide el numero de bolas que debe de tener la urna
        System.out.println("Dime el  numero de bolas que tiene la urna");
        int numero= scanner.nextInt();
           while(numero<=0) // Este bucle se ejecuta cuando metes un numero menos a 0 por lo que te pide un numero valido
        {
            System.out.println("Dime el  numero de bolas que tiene la urna");
            numero= scanner.nextInt();
        }
        int turno = (int) (Math.random()*2+1); // Saca a suerte quien tiene el turno
        
        while(numero>0) //Este bucle se ejecuta siempre haya 1 o mas bolas en la urna
        {
                if (turno == 1) // Turno de la maquina si en el random sale 1
                {
                    System.out.println("Le toca a la maquina");
                    int numeromaquinas = (int) (Math.random()*3+1); //Elije un numero del uno al tres y se lo resta a la urna
                    System.out.println("La maquina ha quitado " + numeromaquinas);
                    numero-=numeromaquinas; // Operacion de resta
                    turno =2; //Cambia de turno para que se pueda seguir jugando
                    }
                else // Si en el random de los turnos ha salido 2 pues le toca al usuario
                        {
                            System.out.println("Le toca al usuario");
                            int numerousuario = scanner.nextInt(); // Pide el numero de bolas que quiere sacar
                            numero-= numerousuario; // Operacion de resta
                            turno=1; // Pasa el turno a la maquina
                        }
                        if(numero <=0)
                        {
                //Esto es para que no salgan numeros negativos cuando se reste ya que si numero es 0 en la variable se guarda 0  
                            numero=0; 
                        }
                
                System.out.println("Quedan " + numero);
                } //FIN DEL BUCLE
        
         if(turno==1) //Esto es para saber quien gana o quien pierde
 // Cuando sale del bucle en turno se queda un numero almacenado el que se quede almacenado es el que ha perdido
            {
                System.out.println("Pierde la maquina");
            }
         else
               {
                 System.out.println("Pierde el usuario");
                }
     scanner.close();
    }

}
