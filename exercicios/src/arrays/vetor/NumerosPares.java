package arrays.vetor;

import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int cont = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe o valor da posição " + i);
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 == 0) {
                cont++;
            }
        }
        if (cont > 0) {
            System.out.println("O vetorA possui " + cont + " números pares");
        }
    }
}
