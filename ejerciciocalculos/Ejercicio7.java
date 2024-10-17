
import java.util.Scanner;

 public class Ejercicio7 {


    public static void main(String[] args) {
        // TODO code application logic here
        
        String cad = "Volando, volando... siempre arriba";
        // fragmentacion la oracion
        String primeraparte = cad.substring(0,7);
        String segundaparte = cad.substring(cad.length()-7,cad.length()); 
        // es -7 porque en el enunciado te dice desde los ultimos 7 y lo he hecho con el lenght para que desde el final le reste los 7. 
        
        // buscar las d 
        int buscar1 = primeraparte.indexOf("d");
        int buscar2 = segundaparte.indexOf("d");
        
        System.out.println(buscar1);
        System.out.println(buscar2);
        
    }

}
