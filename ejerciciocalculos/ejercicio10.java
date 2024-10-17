import java.util.Scanner;
    public class ejercicio10 {


    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new
           Scanner (System.in);
         
         System.out.println("Dime la a");
         int a = scanner.nextInt();
          System.out.println("Dime la b");
         int b = scanner.nextInt();
         System.out.println("Dime la c");
         int c = scanner.nextInt();
         System.out.println("-----------------------------------------------------------------------------------------------------------------");
         System.out.println("LA SOLUCION ES: ");
           double ecuacion1 = (-b + Math.sqrt((Math.pow(b, 2) - (4 * a * c)) / (2 * a)));
           double ecuacion2 = (-b - Math.sqrt((Math.pow(b, 2) - (4 * a * c)) / (2 * a)));
           
           System.out.println(ecuacion1);
           System.out.println(ecuacion2);
           
    }

}
