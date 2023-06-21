public class Main {
    public static void main(String[] args) {
        // Operadores unarios: Cambio de signo
        var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);

        // Operador de negación
        var varC = true;
        var varD = !varC; // Inverimos el valor de true a false y si estuviese en fasle se invierte a true
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);

        // Variables por incremento
        var varE = 9;
        var varF = ++varE;
        System.out.println("varE = " + varE);
        System.out.println("varF = " + varF);

        var varG = 3;
        var varH = varG++; // no incrementa en 1 ya que lee primero la variable antes del incremento
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);

        // variables por decremento
        var varI = 20;
        var varJ = --varI;
        System.out.println("varI = " + varI);
        System.out.println("varJ = " + varJ);

        var varK = 30;
        var varL = varK++;
        System.out.println("varK = " + varK);
        System.out.println("varL = " + varL);

        // Operadores de Igualdad
        var aNum = 4;
        var bNum = 5;
        var cNum = aNum == bNum;
        System.out.println("cNum = " + cNum); // false

        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum); // true

        // Operadores de igualdad con cadenas
        var cadenaA = "Hola";
        var cadenaB = "Chau";
        var rCadena = cadenaA.equals(cadenaB); // Hacmos un comparador de igualdad entre cadenaA y cadenaB
        System.out.println("rCadena = " + rCadena);

        // Operadores relacionales
        var gVar = aNum <= bNum;
        System.out.println("gVar = " + gVar);
    }
}