package poo;

import java.util.Scanner;

public class Bancas {
    String titular;
    Integer numeroCuenta;
    Integer saldo;


    public Bancas(String titular, Integer numeroCuenta, Integer saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public void mostrarCuenta(){
        System.out.println("El titular es " + titular);
        System.out.println("El número de la cuenta es: " + numeroCuenta);
        System.out.println("El saldo es " + saldo);
    }

    public void depositar(){
        Scanner msd = new Scanner(System.in);
        System.out.println("Ingrese lo que quiere depositar");
        Integer depositado = msd.nextInt();
        System.out.println("Se ha depositado " + depositado);
        saldo = saldo + depositado;
        System.out.println("Deposito hecho correctamente su saldo total es de: " + saldo);

        msd.close();

        //System.out.println( titular + " acaba de positar " + saldo + " a " + objetivo.titular + " su saldo es de " + objetivo.saldo);
        
    }

    public void retirar(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese monto al retirar");
        Integer retirado = sc.nextInt();
        System.out.println("Se han retirado " + retirado);
        saldo = saldo - retirado;
        System.out.println("Su saldo quedo en " + saldo);
        sc.close();
        
    }


    public void transferir(Bancas objetivo) {
        Scanner sdc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de su saldo que quiere tranferir ");
        Integer transferido = sdc.nextInt();
        System.out.println("La cantidad que va a transferir es " + transferido);
        saldo = saldo - transferido;
        objetivo.saldo = objetivo.saldo + transferido; 
        System.out.println("..... transaccion hecha a " + objetivo.titular);
        System.out.println("el total de su saldo " + titular + " es de " + saldo);

        sdc.close();

    }

    public static void main(String[] args){
        Bancas uno = new Bancas("Juan Esteban Valencia Montoya", 200719, 100000000);
        Bancas dos = new Bancas("Mariana Gonzales", 201012, 1000000);
        Bancas tres = new Bancas("Carlos Peñaloza", 200508, 10000000);
        Bancas cuatroI = new Bancas("silvia alejandra", 201032, 10000023);
        Bancas cinco = new Bancas("maik aguirre", 200122, 100);

        System.out.println();
        uno.mostrarCuenta();
        System.out.println();
        dos.mostrarCuenta();
        System.out.println();
        tres.mostrarCuenta();
        System.out.println();
        cuatroI.mostrarCuenta();
        System.out.println();
        cinco.mostrarCuenta();
        System.out.println();
        System.out.println();
        uno.transferir(cinco);


    }
    
}
