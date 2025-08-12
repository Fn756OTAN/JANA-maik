import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("ingrese un numero para comprobar si es primo");
        Integer numero = scan.nextInt();
        Integer resultado = numero % 2;
        if( resultado != 0){
            System.out.println("Su número es primo");
        }else{
            System.out.println("Su número no es primo");
        }
        scan.close();
        
    }
    
}
