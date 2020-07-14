package classes.fibonacci;

public class Fibonacci {

    public static int fibonacciCalcular(int num) {

        if (num < 2) {
            return 1;
        }

        return fibonacciCalcular(num - 1) + fibonacciCalcular(num - 2);
    }

}