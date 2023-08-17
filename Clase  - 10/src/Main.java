
public class Main {
    public static void main(String[] args) {
       // If else
        var condicion = true;

        if (condicion) {
            System.out.println("Condición verdadera");
        } else {
            System.out.println("Condición falsa");
        }

        // Switch
        var numero = 2;
        var numeroTexto = "Número desconocido";

        switch (numero) {
            case 1:
                numeroTexto = "Número uno";
                break;
            case 2:
                numeroTexto = "Número dos";
                break;
            case 3:
                numeroTexto = "Número tres";
                break;
            case 4:
                numeroTexto = "Número cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}