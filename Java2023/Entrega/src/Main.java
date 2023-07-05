import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        System.out.println("Ingrese la altura del rectángulo");
        double altura = entrada.nextDouble();
        System.out.println("Ingrese la base del rectangulo");
        double base = entrada.nextDouble();
        double area = base * altura;
        double perimetro = (base * 2) + (altura + 2);
        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perímetro del rectangulo es: " + perimetro);
    }
}