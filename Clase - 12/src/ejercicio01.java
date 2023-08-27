import javax.swing.*;

public class ejercicio01 {
    public static void main(String[] args) {
        int numero;
        int cuadrado;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digitie un número: "));

        while (numero >= 0) {
            cuadrado = (int) Math.pow(numero, 2); // Método para sacar la potencia de un número
            System.out.println("El número " + numero + " elevado al cuadrado es " + cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digitie otro número: "));
        }
        System.out.println("Programa finalizado por número negativo");
    }
}
