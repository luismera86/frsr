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

        // Operadores condicionales

        // Operador &&
        var valorA = 7;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;
        System.out.println("respuesta = " + respuesta);
        // Operador ||
        var vacaciones = false;
        var diaLibre = false;
        if (vacaciones || diaLibre)
            System.out.println("Papá puede asistir al juego de su hijo");
        else
            System.out.println("Papá no puede asistir al juego de su hijo");
        
        // Operador ternario
        var resultadoT = (5 > 4) ? "verdadero" : "Falso";
        System.out.println("resultadoT = " + resultadoT);
        var numeroT = 7; 
        resultadoT = (numeroT % 2 == 0) ? "Es par" : "Es impar";
        System.out.println("resultadoT = " + resultadoT);
    }
}