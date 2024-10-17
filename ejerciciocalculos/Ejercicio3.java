import java.util.Scanner;
public class Ejercicio3 {


    public static void main(String[] args) {
     Scanner scanner = new
     Scanner (System.in);
     System.out.println("Dime el primer numero");
     float numero1 = scanner.nextInt();
     System.out.println("Dime el segundo numero");
     float numero2 = scanner.nextInt();
     System.out.println("Dime el tercer numero");
     float numero3 = scanner.nextInt();
     System.out.println("Dime el cuarto numero");
    float numero4 = scanner.nextInt();
     System.out.println("Dime el quinto numero");
     float numero5 = scanner.nextInt();
     float suma = numero1 + numero2 + numero3 + numero4 + numero5;
     float media = suma / 5 ;
     
     System.out.println(suma);
     System.out.println("La media es " + media);
     
 scanner.close();
    }

}
