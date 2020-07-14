package logica;

import java.util.Scanner;

public class AreaCirculo {
    
    public static void main(final String[] args) {

        final Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor correspondente ao raio do círculo: ");
        final float raio = scan.nextFloat();

        final double area = Math.PI * Math.pow(raio, 2);
            
            System.out.println("O valor da área do círculo é: " + area);
        
        }
    }