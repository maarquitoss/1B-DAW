import java.util.Scanner;


public class ejercicio4 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Dime un numero");
        int m = scanner.nextInt();
       
        System.out.println("Dime otro");
        int n = scanner.nextInt();
        
       
        
        
        double primeraop = m / n * (m - n);
        double segundaop = 12.3 / m + 5 - n * 9;
        double terceraop = m * 2048 / n * 1024 - Math.pow(m,n);
        double cuartaop = Math.pow(3203 /m-n, n) % (Math.pow(n,2)*Math.pow(m,2));
      
        
        System.out.println(primeraop);
        System.out.println(segundaop);
        System.out.println(terceraop);
        System.out.println(cuartaop);
        scanner.close();
    }
}
