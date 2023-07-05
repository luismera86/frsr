public class Ejercicio1 {

    public static void main(String[] args) {
        var numero = 2;
        var numeroTexto = "Número desconocido";

        if(numero == 1) {
            numeroTexto = "Número uno";
        } else if (numero == 2) {
            numeroTexto = "Número 2";

        } else if (numero == 3) {
            numeroTexto = "Número 3";
        } else if (numero == 4) {
            numeroTexto = "Número 4";
        } else {
            numeroTexto = "Número no encontrado";
        }

        System.out.println("numeroTexto = " + numeroTexto);
    }
}
