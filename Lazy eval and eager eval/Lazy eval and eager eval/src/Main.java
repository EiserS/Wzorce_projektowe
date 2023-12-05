//Damian Pawlik 109484
import java.util.function.Supplier;

class LazyEvaluation {
    // Klasa reprezentująca opóźnioną ewaluację wyrażenia
    static class DelayedEval {
        private final Supplier<Integer> supplier;

        // Konstruktor, który przyjmuje wyrażenie jako funkcję dostawcy (Supplier)
        DelayedEval(Supplier<Integer> supplier) {
            this.supplier = supplier;
        }

        // Metoda do obliczenia wartości opóźnionego wyrażenia
        int eval() {
            return supplier.get(); // Pobranie wartości z dostawcy (Supplier)
        }
    }

    public static void main(String[] args) {
        // Ewaluacja wyrażenia natychmiastowa (eager)
        int n = 3 + 4;
        System.out.println(n);
        System.out.println("Eager evaluation result: " + n);

        // Opóźniona ewaluacja wyrażenia (lazy)
        DelayedEval delayedEval = new DelayedEval(() -> 3 + 4);
        System.out.println(delayedEval);
        System.out.println("Lazy evaluation result: " + delayedEval.eval());

        // jak widać powyższy przykład wykonuje się nieco później w porówaniu z pierwszym, który jest natychmiastowy
        // w 1 dodkonujemy natychmiastowej, gdy w późniejszej Tworzymy obiekt, któremu przekazujemy wartości funkcją strzałkową.
    }
}
