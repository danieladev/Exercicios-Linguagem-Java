package logica;

import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        float nota1 = scan.nextFloat();

        System.out.println("Informe a segunda nota: ");
        float nota2 = scan.nextFloat();

        System.out.println("Informe a terceira nota: ");
        float nota3 = scan.nextFloat();

        System.out.println("Informe a quarta nota: ");
        float nota4 = scan.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A media das quatro notas é: " + media);

    }
}
