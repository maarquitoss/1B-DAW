import java.util.Scanner;
public class ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new
        Scanner (System.in);
        System.out.println("Dime la a");
        int a = scanner.nextInt();
        System.out.println("Dime la b");
        int b = scanner.nextInt();
        int ecuacion =-b/a;
        
        System.out.println("Ecuacion de primer grado " + ecuacion );
        scanner.close();
    }

}
