import java.util.Scanner;

public class Reves {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese Numero para mostrarselo al reves");

        Integer numero = scan.nextInt();
        
        while(numero > 0){
            Integer digito = numero%10;
            System.out.println(digito);
            numero = numero/10;
        

        }

        scan.close();
    }
    
}
