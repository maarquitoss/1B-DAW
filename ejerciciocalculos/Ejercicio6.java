import java.util.Scanner;
  public class Ejercicio6 {


    public static void main(String[] args) {
        
        
     String cadena = "LA LLUVIA EN SEVILLA ES UNA MARAVILLA";
    
      String sevilla = cadena.substring(12,cadena.length());
      System.out.println(sevilla);
      String lluvia = cadena.substring(0,9);
      String maravilla = cadena.substring(21, cadena.length());
      System.out.println(lluvia + " " +  maravilla);
     }   
}
