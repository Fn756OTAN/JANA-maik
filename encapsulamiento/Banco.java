package poo;

import java.util.Scanner;

// Clase Bancas con encapsulamiento

public class Bancas {
    private String titular;
    private Integer numeroCuenta;
    private Integer saldo;
    private Scanner scanner;

    public Bancas(String titular, Integer numeroCuenta, Integer saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    // Getters y Setters (solo los necesarios)

    public String getTitular() {
        return titular;
    }

    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public Integer getSaldo() {
        return saldo;
    }

    private Scanner getScanner() {
        if (this.scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    public void mostrarCuenta() {
        System.out.println("El titular es " + titular);
        System.out.println("El número de la cuenta es: " + numeroCuenta);
        System.out.println("El saldo es " + saldo);
    }

    public void depositar() {
        Scanner msd = this.getScanner();
        System.out.println("Ingrese lo que quiere depositar");
        int depositado = msd.nextInt();

        if (depositado <= 0) {
            System.out.println("El monto a depositar debe ser mayor a cero.");
            return;
        }

        saldo += depositado;
        System.out.println("Se ha depositado " + depositado);
        System.out.println("Depósito hecho correctamente, su saldo total es de: " + saldo);
    }

    public void retirar() {
        Scanner sc = this.getScanner();
        System.out.println("Ingrese monto a retirar");
        int retirado = sc.nextInt();

        if (retirado <= 0) {
            System.out.println("El monto a retirar debe ser mayor a cero.");
            return;
        }

        if (retirado > saldo) {
            System.out.println("Saldo insuficiente para retirar esa cantidad.");
            return;
        }

        saldo -= retirado;
        System.out.println("Se han retirado " + retirado);
        System.out.println("Su saldo quedó en " + saldo);
    }

    public void transferir(Bancas objetivo) {
        Scanner sdc = this.getScanner();
        System.out.println("Ingrese la cantidad que quiere transferir");
        int transferido = sdc.nextInt();

        if (transferido <= 0) {
            System.out.println("El monto a transferir debe ser mayor a cero.");
            return;
        }

        if (transferido > saldo) {
            System.out.println("Saldo insuficiente para transferir esa cantidad.");
            return;
        }

        saldo -= transferido;
        objetivo.saldo += transferido;

        System.out.println("... Transacción hecha a " + objetivo.titular);
        System.out.println("El total de su saldo, " + titular + ", es de " + saldo);
    }

    public static void main(String[] args) {
        Bancas uno = new Bancas("Juan Esteban Valencia Montoya", 200719, 100000000);
        Bancas dos = new Bancas("Mariana Gonzales", 201012, 1000000);
        Bancas tres = new Bancas("Carlos Peñaloza", 200508, 10000000);
        Bancas cuatroI = new Bancas("Silvia Alejandra", 201032, 10000023);
        Bancas cinco = new Bancas("Maik Aguirre", 200122, 100);

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

        // Ejemplo de retirar y transferir con validación
        cinco.retirar();
        System.out.println();
        uno.transferir(cinco);
    }
}
