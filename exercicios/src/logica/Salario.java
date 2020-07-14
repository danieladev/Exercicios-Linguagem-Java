package logica;

import java.util.Scanner;

public class Salario {
    
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe o valor da sua hora: ");
        double valorHora = scan.nextDouble();
        
        System.out.println("Informe o número de horas trabalhadas: ");
        double horas = scan.nextInt();
        
        double salario = valorHora * horas;
        
        System.out.println("Seu salario é de: " + salario);
        
    }
}