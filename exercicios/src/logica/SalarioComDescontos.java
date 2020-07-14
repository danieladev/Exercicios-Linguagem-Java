package logica;

import java.util.Scanner;

public class SalarioComDescontos {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor da sua hora: ");
        double valorHora = scan.nextDouble();

        System.out.println("Informe o número de horas trabalhadas no mês: ");
        double horas = scan.nextInt();

        double salarioBruto = valorHora * horas;
        double descIR = 0.11 * salarioBruto;
        double descINSS = 0.08 * salarioBruto;
        double descSind = 0.05 * salarioBruto;
        double salarioLiq = salarioBruto - (descIR + descINSS + descSind);

        System.out.println("Salário Bruto: R$ " + salarioBruto + " - IR (11%): R$ " + descIR + " - INSS (8%): R$ "
                + descINSS + " - Sindicato (5%): R$" + descSind + " = Salário Líquido: R$ " + salarioLiq);

    }
}