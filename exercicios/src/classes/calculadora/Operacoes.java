package classes.calculadora;

import static java.lang.Math.pow;

public class Operacoes {

    public static int somar(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    public static int mutiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static int dividir(int num1, int num2) {
        return num1 / num2;
    }

    public static int potencia(int num1, int num2) {
        return (int) pow(num1, num2);
    }

    public static int fatorialRecursivo(int num) {
        if (num == 0) {
            return 1;
        }
        return num * fatorialRecursivo(num - 1);
    }
}