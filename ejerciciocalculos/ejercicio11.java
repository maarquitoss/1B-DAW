import java.util.Scanner;
    public class ejercicio11 {


    public static void main(String[] args) {
        Scanner scanner = new
        Scanner (System.in);
        System.out.println("Dime los MBPS");
        double num1 = scanner.nextDouble();
        double mibs = 0.11920928955078;
        double tranformacion1 = (num1*mibs);
        System.out.println("En MIB/S es " + tranformacion1);
        scanner.close();
    }

}
