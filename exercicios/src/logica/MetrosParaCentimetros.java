package logica;

import java.util.Scanner;

public class MetrosParaCentimetros {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        
            System.out.println("Digite o valor em metros: ");
            float valorMetro = scan.nextFloat();
            
            float valorCent = valorMetro * 100;
            
            System.out.println(valorMetro + "m é igual a " + valorCent + "cm");
        
        }
    }