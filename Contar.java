import java.util.Scanner;

public class Contar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("ingrese su número");
        

        Integer numero = scan.nextInt();
        
        for(Integer i = 0; i <= numero; i++){
            System.out.println("su  numero es " + i );
            String palabra = i.toString();
            int contar = palabra.length();
            System.out.println("el número de digitos es " + contar);

        }
        scan.close();
    }
}