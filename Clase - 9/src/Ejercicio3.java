import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        final int salario = 1000;
        int comision = 150;

        System.out.println("Digite la cantidad de autos vendidos");
        int cantidadVenta = Integer.parseInt(entrada.nextLine());

        System.out.println("Digite el precio del auto");
        float ventaAuto = Float.parseFloat(entrada.nextLine());

        comision *= cantidadVenta;
        float totalPrecio = ventaAuto * cantidadVenta;
        float porcentajeVenta = totalPrecio * 0.5f;
        float salarioMensual = salario + comision + porcentajeVenta;

        System.out.println("salarioMensual = " + salarioMensual);


    }
}
