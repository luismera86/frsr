import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite las tres calificaciones");
        float nota1 = Float.parseFloat(entrada.nextLine());
        float nota2 = Float.parseFloat(entrada.nextLine());
        float nota3 = Float.parseFloat(entrada.nextLine());

        float suma = nota1 + nota2 + nota3;
        System.out.println("La suma de las tres notas es  = " + suma);
    }
}
