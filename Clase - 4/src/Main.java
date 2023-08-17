
public class Main {
    public static void main(String[] args) {
        // Tipos primitivos byte, short, int y long

        // byte es el más pequeño 8 bits
        byte numeroEnteroByte = 127; // está en el valor máximo
        byte convertirNumero = (byte) 129; // fuerza al compilador a que lo tome como un número de tipo byte
        // Valoes máximos y mínimos de byte
        System.out.println("Valor mínimo del byte " + Byte.MIN_VALUE); // -128
        System.out.println("Valor máximo del byte " + Byte.MAX_VALUE); // 127
        System.out.println("convertirNumero = " + convertirNumero); // Devuelve el valor de -127 ya que se ocuparon los 127 números positivos de byte

        // short
        short numeroEnteroShort = 32767;
        System.out.println("Valor mínimo del short " + Short.MIN_VALUE); // -32768
        System.out.println("Valor máximo del short " + Short.MAX_VALUE); // 32767

        // int
        int numeroEnteroInt = 2147483647;
        System.out.println("Valor mínimo del int " + Integer.MIN_VALUE); // -2147483648
        System.out.println("Valor máximo del int " + Integer.MAX_VALUE); // 2147483647

        // long
        long numeroEnteroLong = 9223372036854775807L; // Se debe colocar la L al final del número para indicarle que es un long ya que java por defecto toma los enteros como int
        System.out.println("Valor mínimo del long " + Long.MIN_VALUE); // -9223372036854775808
        System.out.println("Valor máximo del long " + Long.MAX_VALUE); // 9223372036854775807

        // Tipos Primitivos tipos Flotantes  tenmos float 32 bits y doble 64 bits

        // Float
        float numFloat = (float) 3.4028235E38; // Tenemos que poner la letra F o (float) delante, por default java toma los decimales como double
        System.out.println("Valor mínimo del float " + Float.MIN_VALUE); // 1.4E-45 La E quiere decir Exponencial
        System.out.println("Valor máximo del float " + Float.MAX_VALUE); // 3.4028235E38

        // Double
        double numeroDouble = 1.7976931348623157E308;
        System.out.println("Valor mínimo del double " + Double.MIN_VALUE); // 4.9E-324 La E quiere decir Exponencial
        System.out.println("Valor máximo del double " + Double.MAX_VALUE); // 1.7976931348623157E308

    }
}