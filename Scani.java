import java.util.Scanner;

public class Scani {
    public static void main(String[]arg){
        Scanner scan = new Scanner(System.in);
        System.out.print("Coloca tu nombre ");
        String nombre = scan.nextLine();

        System.out.println("Tu nombre es " + nombre);
        
        scan.close();

    }
}