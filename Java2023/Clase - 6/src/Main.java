import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Conversión de tipos primitivos
        
        var edad = Integer.parseInt("20"); // Convertimos un dato tipo String a un tipo Int
        System.out.println("edad = " + edad);

        var valorPI = Double.parseDouble("3.1416"); // Convertimos un String a un tipo Double
        System.out.println("valorPI = " + valorPI);

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su edad");/**/
        //edad = Integer.parseInt(entrada.nextLine());
        //System.out.println("edad = " + edad);

        // Conversión de tipos primitivos parte 2
        var edadTexto = String.valueOf(10); // Convertimos un tipo Int a un tipo String
        System.out.println("edadTexto = " + edadTexto);
        
        var fraseChar = "programadores".charAt(0); // Convertimos nuestro String en un Char que nosotros le asignemos en la posición índice
        System.out.println("fraseChar = " + fraseChar); // fraseChar = p
        // Convertimos el nextLine en un char para poder ingresar por prompt
         fraseChar = entrada.nextLine().charAt(5);
         System.out.println("fraseChar = " + fraseChar);

    }
}