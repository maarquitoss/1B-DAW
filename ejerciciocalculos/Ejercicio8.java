import java.util.Scanner;
public class Ejercicio8 {


    public static void main(String[] args) {
        Scanner scanner = new
        Scanner (System.in);
        
        System.out.println("Programa que simula el lanzamiento de un dado");
        System.out.println("-------------------------------------------------------COMIENZO----------------------------------------------------------");
        System.out.println("Dime las caras del dado");
        int n = scanner.nextInt();
        int a = (int)(Math.random()*n)+1;   //El +1 es para que no salga 0 ya que es imposible que cuando lanzes un dado no caiga en una cara 
        System.out.println("La cara que sale es " + a);
        scanner.close();
    }

}
