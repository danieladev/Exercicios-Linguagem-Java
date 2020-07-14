package estruturasDeDecisao.switchCase;

import java.util.Scanner;

public class DiaDaSemana {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um dia da semana de (1-7): ");
        int diaSemana = scan.nextInt();

        switch (diaSemana) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("É dia da semana.");
                break;
            case 1:
            case 7:
                System.out.println("É final de semana.");
                break;
            default:
                System.out.println("Não é um dia da semana válido.");
        }
    }
}