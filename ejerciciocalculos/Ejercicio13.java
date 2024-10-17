import java.util.Scanner;
public class Ejercicio13 {


    public static void main(String[] args) {
        Scanner scanner = new
        Scanner (System.in);
        
        
        
        System.out.println("Dime las dimensiones de tu habitacion en m");
        
        System.out.println("Dime la altura");
        double altura = scanner.nextDouble();
        
        System.out.println("Dime la anchura ");
        double anchura = scanner.nextDouble();
        
        System.out.println("Dime las mediciones de las baldosas en cm");
        double baldosas = scanner.nextDouble();
        double areabaldosa = (baldosas*baldosas)/1000;
        
        System.out.println("Cuanto cuesta cada baldosa");
        double precio = scanner.nextDouble();
        
        double baldosas1 = (altura*anchura)/(areabaldosa);
        System.out.println("Las baldosas que necesita la supercifie es " + baldosas1);
        
        double costesuperficie = (precio*baldosas1);
        System.out.println("El precio que necesitas para comprar las baldosas que rellene toda la superficie " + costesuperficie); 
        
      scanner.close();
     }

}
