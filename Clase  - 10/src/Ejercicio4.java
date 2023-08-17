import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un número entre 0 y 10");
        var calificacion = Integer.parseInt(entrada.nextLine());

        if (calificacion >= 9 && calificacion < 10) {
            System.out.println("A");
        } else if (calificacion >= 8 && calificacion < 9) {
            System.out.println("B");
        } else if (calificacion >= 7 && calificacion < 8) {
            System.out.println("C");
        } else if (calificacion >= 6 && calificacion < 7) {
            System.out.println("D");
        } else if (calificacion >= 0 && calificacion < 6) {
            System.out.println("F");
        } else {
            System.out.println("Fuera del rango de calificación");
        }

        // Otra forma de hacerlo con switch

        switch (calificacion) {
            case 9: case 10:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 0: case 1: case 2: case 3: case 4: case 5:
                System.out.println("F");
                break;
            default:
                System.out.println("Fuera del rango de calificación");
        }

    }
}
