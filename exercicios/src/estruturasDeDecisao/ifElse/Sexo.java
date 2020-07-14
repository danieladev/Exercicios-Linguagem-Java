package estruturasDeDecisao.ifElse;

import java.util.Scanner;

public class Sexo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o sexo (F ou M): ");
        String input = scan.next();

        if (input.equalsIgnoreCase("F")) {
            System.out.println("F - Feminino");
        } else if (input.equalsIgnoreCase("M")) {
            System.out.println("M - Masculino");
        } else {
            System.out.println("Sexo inválido");
        }
    }
}