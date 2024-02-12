package Repositorio_dia2;

import java.util.Scanner;

public class Cifras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        
        double cifra_1, cifra_2, cifra_3, numero;
        
        
        System.out.print("Ingrese un numero: ");
        numero = sc.nextDouble();
        
        
        cifra_1 = Math.floor(numero / 100);
        cifra_2 = (Math.floor(numero / 10) % 10);
        cifra_3 = numero % 10;
        
        System.out.println("Las cifras del numero son las siguientes: " + "\n" +
                "Cifra 1: " + cifra_1 + "\n" + 
                "Cifra 2: " + cifra_2 + "\n" +
                "Cifra 3: " + cifra_3 );
        
    }
    
}
