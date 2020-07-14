package logica;

import java.util.Scanner;

public class ConversorTemperatura {
    
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Informe a temperatura em Farenheit: ");
        double tempFaren = scan.nextDouble();
        
        double tempCel = (5 * (tempFaren - 32) / 9);
        
        System.out.println(tempFaren + "ºF é " + tempCel + "ºC");
        
    }
}