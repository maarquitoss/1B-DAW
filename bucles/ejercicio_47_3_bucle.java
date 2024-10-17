

package bucles;
import java.util.Scanner;

    public class ejercicio_47_3_bucle {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el  numero de bolas que tiene la urna");
        int numero= scanner.nextInt();
                while(numero<=0)
        {
            System.out.println("Dime el  numero de bolas que tiene la urna");
            numero= scanner.nextInt();
        }
        int turno = (int) (Math.random()*2+1);
        
        while(numero>0)
        {
                if (turno == 1)
                {
                    System.out.println("Le toca a la maquina");
                    int numeromaquinas = (int) (Math.random()*3+1);
                    numero-=numeromaquinas;
                    turno =2;
                    }
                else
                        {
                            System.out.println("Le toca al usuario");
                            int numerousuario = scanner.nextInt();
                            numero-= numerousuario;
                            turno=1;
                        }
                System.out.println("Quedan " + numero);
                }
         if(numero <=0)
                {
                    numero=0;
                }
         if(turno==1)
            {
                System.out.println("Pierde la maquina");
            }
         else
               {
                 System.out.println("Pierde el usuario");
                }
     
    }

}
