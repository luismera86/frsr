
public class Main {
    public static void main(String[] args) {
        // Inferencia de tipos var y tipos primitivos
        
        var numEntero = 20; // Las literales sin punto automáticamente son de tipo int.
        System.out.println("numEntero = " + numEntero);
        
        var numFloat = 10.0;
        System.out.println("numFloat = " + numFloat);
        
        var numDouble = 12.00;
        System.out.println("numDouble = " + numDouble);

        // Tipos primitivos char

        char miVariableChar = 'a'; // solo puede ir un caracter y con comillas simples
        System.out.println("miVariableChar = " + miVariableChar);
        // Se rigen por una lista de caracteres Unicode
        
        char varCharacter = '\u0024'; // indicamos el valor unicode
        System.out.println("varCharacter = " + varCharacter); // $
        
        char varCharacterSimbol = '$'; // Asignamos directamente el caracter especial
        System.out.println("varCharacterSimbol = " + varCharacterSimbol);
        
        var character = '\u0024'; // Infiere que es de tipo char
        System.out.println("character = " + character);
        
        var characterSimbol = '$';
        System.out.println("characterSimbol = " + characterSimbol);
    }
}