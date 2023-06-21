import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
       // Operadores aritméticos
        int num1 = 5, num2 = 4;
        var solucion = num1 + num2;
        System.out.println("solucion de la  suma = " + solucion);
        solucion = num1 - num2;
        System.out.println("solucion de la resta = " + solucion);
        solucion = num1 * num2;
        System.out.println("solucion de la multiplicación = " + solucion);
        solucion = num1 / num2;
        System.out.println("solucion de la división = " + solucion);
        solucion = num1 % num2;
        System.out.println("solucion el residuo es = " + solucion);

        if(num1 % 2 == 0) {
            System.out.println("Es un número par");
        } else {
            System.out.println("Es un número impar");
        }

        // Operadores de asignación
        int varNum1 = 1, varNum2 = 4;
        int varNum3 = varNum1 + 6 - varNum2;
        System.out.println("varNum3 = " + varNum3);

        // Operador de composición
        varNum1 += 1;
        System.out.println("varNum1 = " + varNum1);
        varNum1 -= 1;
        System.out.println("varNum1 = " + varNum1);
        varNum1 *= 1;
        System.out.println("varNum1 = " + varNum1);
        varNum1 /= 1;
        System.out.println("varNum1 = " + varNum1);
        varNum1 %= 1;
        System.out.println("varNum1 = " + varNum1);
    }
}