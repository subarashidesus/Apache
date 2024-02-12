package Repositorio_dia2;

import java.util.Scanner;

public class Farenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double centigrado, farenheit;
        
        System.out.print("Ingrese los grados centigrados: ");
        centigrado = sc.nextDouble();
        
        
        farenheit = centigrado * 9/5 + 32;
        
        System.out.println("Los grados en farenheit es: " + farenheit);
    }
    
}
