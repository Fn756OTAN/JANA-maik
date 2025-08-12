package poo;

public class Personaje {
    String nombre;
    String raza;
    Integer ki;
    Integer vida;
    Integer edad;
    Integer attack;

    public Personaje(String nombre, String raza, Integer ki, Integer vida, Integer edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.ki = ki;
        this.vida = vida;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("La raza es: " + raza);
        System.out.println("El ki es: " + ki);
        System.out.println("La vida es: " + vida);
        System.out.println("La edad es: " + edad);
    }

    public void ataque (Personaje objetivo) {
        objetivo.vida -= ki;
        System.out.println(nombre + " ataco a " + objetivo.nombre + " y le quito" + ki + " de vida " + objetivo.nombre + "quedo con" + objetivo.vida + "ccoad");
    }

    public void darki (Personaje objetivo) {
        ki = ki / 2;
        objetivo.ki = ki + objetivo.ki;
        System.out.println( nombre + " le dio " + ki + " de ki a " + objetivo.nombre + " se recupero ");
    }

    public static void main(String[] args) {
        Personaje goku = new Personaje("Gokú", "Sayayin", 1000, 100, 38);

        Personaje vegetta = new Personaje("Vegetta", "Sayayin", 800, 100, 40);
        Personaje krillin = new Personaje("krillin", "terricola", 350, 100, 28);
    
        goku.mostrarInfo();
        System.out.println();
        krillin.mostrarInfo();
        System.out.println();
        krillin.darki(vegetta);
        System.out.println();
        vegetta.mostrarInfo();

    }
}
