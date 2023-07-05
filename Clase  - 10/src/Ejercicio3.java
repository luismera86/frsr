import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        // Calcular la estación del año con switch

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el mes del año: ");
        var mes = Integer.parseInt(entrada.nextLine());
        var estacion = "Estación desconocida";

        switch (mes) {
            case 1: case 2: case 3:
                estacion = "Verano";
                break;
            case 4: case 5: case 6:
                estacion = "Otoño";
                break;
            case 7: case 8: case 9:
                estacion = "Invierno";
                break;
            case 10: case 11: case 12:
                estacion = "Primavera";
                break;
            default:
                estacion = "Estación desconocida";
        }
        System.out.println("La estación para el mes " + mes + " es: " + estacion);
    }
}
