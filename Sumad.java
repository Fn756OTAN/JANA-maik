import java.util.Scanner;

public class Sumad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un número para proceder con la sumatoria de sus números");
        
        Integer numero = scan.nextInt();
        
        System.out.println("Su número es: " + numero);

        Integer suma = 0;

        while(numero > 0 ){
            Integer digito = numero%10;
            suma += digito;
            numero = numero / 10;

        }

        System.out.println("suma: " + suma);    
        

        
        
        scan.close();
        
    }
    
}
