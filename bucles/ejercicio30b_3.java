package bucles;
import  java.util.Scanner;


    public class ejercicio30b_3 {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime el primer numero");
        int numero= scanner.nextInt();
        System.out.println("Dime el segundo numero");
        int numero2= scanner.nextInt();
        int min =0;
        int max=0;
        String lista="";
        if(numero<numero2)
        {
            min=numero;
            System.out.println("El minimo es "+ min);
            max=numero2;
            System.out.println("El maximo es " +max);
            }
            else 
            {
               max=numero;
                System.out.println("El maximo es "+ max);
                min=numero2;
                System.out.println("El minimo es "+ min);
                
            }
        int numero3=min;
        
        if(min%2!=0)
            {
                    min++;
             }
        else
        {
            System.out.println("Es par " + min );
        }
        while (min<max)
        {
               min+=2;
                lista+=min+",";

        }
        
        System.out.println("Los numeros pares son "+ numero3 + "," + lista);

        }     
    }
