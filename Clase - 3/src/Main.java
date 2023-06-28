import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
       /* int miVaribale = 10;
        System.out.println("miVaribale = " + miVaribale);
        int miVariableEntera = 2;
        System.out.println("miVariableEntera = " + miVariableEntera);
        String nombre = "Luis";
        System.out.println("Nombre \n " + nombre);
        */
        
        // Clase Scanner
        Scanner entrada = new Scanner(System.in); // Inicializamos la clase Scanner
        System.out.println("Digite su Nombre:");
        var usuario = entrada.nextLine(); // Generamos un propmt de entrada por consola
        System.out.println("usuario = " + usuario);
        System.out.println("Escriba el título:");
        var titulo = entrada.nextLine();
        System.out.println("Resultado " + titulo + " " + usuario);
    }
}