import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la cantidad de dinero que tiene Guillermo");
        float guillermo = Float.parseFloat(entrada.nextLine());
        float luis = guillermo /2;
        float juan = luis /2;

        System.out.println("Guillermo tiene la cantidad " + guillermo);
        System.out.println("Luis tiene la cantidad " + luis);
        System.out.println("Juan tiene la cantidad " + juan);
    }
}
