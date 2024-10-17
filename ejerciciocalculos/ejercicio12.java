import java.util.Scanner;
public class ejercicio12 {


    public static void main(String[] args) {
       Scanner scanner = new
       Scanner (System.in);
       
        System.out.println("Programa que pasa de MegaBytes (MB) a MebiBytes (MiB)");
        System.out.println("-------------------------------------------COMIENZO-------------------------------------------------");
        System.out.println("------------------------------------------------------PRIMERA PARTE ------------------------------------------");
        System.out.println("Dime los MB");
        double mb = scanner.nextDouble();
        double mbequivale = 0.953674;
        double tranformacion1 = (mb*mbequivale);
        System.out.println("El transpaso de MB a MiB es " + tranformacion1);
        System.out.println("------------------------------------------------------SEGUNDA PARTE ------------------------------------------");
        System.out.println("Programa que pasa de MebiBytes (MiB) a Megabits (Mb)");
        System.out.println("-------------------------------------------COMIENZO-------------------------------------------------");
        System.out.println("Dime los Mib");
        double mib = scanner.nextDouble();
        double mibequivale = 1.04858;
        double tranformacion2 = (mib*mibequivale);
        System.out.println("El transpaso de Mib a MB es " + tranformacion2);
        System.out.println("-----------------------------------------------------FINAL DEL PROGRAMA-----------------------------------------------");
        
       scanner.close();
    }

}
