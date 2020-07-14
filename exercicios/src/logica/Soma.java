package logica;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        int num1 = scan.nextInt();

        System.out.println("Informe o segundo número: ");
        int num2 = scan.nextInt();

        System.out.println("A soma dos dois números é: " + (num1 + num2));
    }

}
