/**
 * Questa è la classe in cui definisco il valore delle mie variabili e i metodi da
 * richiamare nel main per poter svolgere i calcoli richiesti.
 *
 * @author Vittoria Vassarotti
 */

public class ArithmeticOperators {

    static int num1 = 25;
    static int num2 = 5;

    /**
     * Metodo richiesto per stampare la SOMMA di num1, num2. 25+5=30.
     */
    static void sum() {
        System.out.println(num1 + num2);
    }

    /**
     * Metodo richiesto per stampare la SOTTRAZIONE di num1, num2. 25-5=20.
     */
    static void sub() {
        System.out.println(num1 - num2);
    }

    /**
     * Metodo richiesto per stampare la MOLTIPLICAZIONE di num1, num2. 25*5=125.
     */
    static void mul() {
        System.out.println(num1 * num2);
    }

    /**
     * Metodo richiesto per stampare la DIVISIONE di num1, num2. 25/5=5.
     */
    static void div() {
        System.out.println(num1 / num2);
    }
}
