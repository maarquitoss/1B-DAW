
import java.util.Scanner;

    public class apunte1 {


    public static void main(String[] args) {
            
            
     Scanner scanner = new
     Scanner (System.in);
     System.out.println("Introduce edad ");
     int numero = scanner.nextInt();
     System.out.println(" Tu edad es " + numero );
     scanner.nextLine();

     System.out.println("Dime tu nombre");
     String nombre = scanner.nextLine();
     System.out.println("Tu nombre es " + nombre);
    
     System.out.println("Dime tu calle");
     int ca = scanner.nextInt();
     System.out.println(ca);
     
     System.out.println("Dime el numero de tu mama");
     int numero2 = scanner.nextInt();
     System.out.println("El nombre de tu madre es " + numero2 );
     scanner.nextLine();
     
     System.out.println("Dime tu mama nombre");
     String nombre2 = scanner.nextLine();
     System.out.println("El nombre de tu mama es  " + nombre2);
     
        System.out.println("El scanner.nextLine(); se pone antes de cualquier scanner que sea de string si es de numero no hace falta ponerlo IMPORTANTE!!!! ");
  
     scanner.close();
   
    }

}
