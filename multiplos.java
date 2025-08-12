import java.util.Scanner;

public class multiplos {
    public static void main(String[] args) {

        Integer i = 1, c = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un Número para ver sus multiplos");

        Integer nn = sc.nextInt();

        while(i <= nn){
            if(i % 3 == 0){
                c++;
            }
            i++;
        }
        System.out.print("La cantidad de números múltiplos de 3 son: " + c);


        sc.close();


    }
    
}
