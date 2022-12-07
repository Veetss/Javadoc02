/**
 * Questa la mia classe main in cui andrò a stampare i risultati dei calcoli richiesti.
 *
 * @author Vittoria Vassarotti
 */

public class Tester {

    /**
     * Metodo MAIN con il quale vado a stampare tutte le richieste poste dall'esercizio
     * richiamando quindi i metodi della classe ArithmeticOperators (per poter appunto
     * stampare i risultati dei calcoli).
     * @param args
     */
    public static void main(String[] args) {
        ArithmeticOperators arithmeticOperators = new ArithmeticOperators();
        ArithmeticOperators.sum();
        ArithmeticOperators.sub();
        ArithmeticOperators.mul();
        ArithmeticOperators.div();
    }
}
