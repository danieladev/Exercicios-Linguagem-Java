package classes.calculadora;

import java.util.Scanner;

public class TesteCalculo {

    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);
        
        int num;
        
        do {
            System.out.println("Informe o número: ");
            num = scan.nextInt();
        } while (num < 0);
       
        imprimirResultado(Operacoes.fatorialRecursivo(num));
        imprimirResultado(Operacoes.somar(1, 2));
        imprimirResultado(Operacoes.subtrair(4, 3));
        imprimirResultado(Operacoes.mutiplicar(8, 2));
        imprimirResultado(Operacoes.dividir(4, 2));
        imprimirResultado(Operacoes.potencia(2, 3));
    }
    
    static void imprimirResultado(int num) {
        System.out.println(num);
    }
}