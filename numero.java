package Repositorio_dia2;

import java.util.Scanner;

public class numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        double numero, porciento;
        
        
        System.out.print("Ingrese un numero: ");
        numero = sc.nextDouble();
        
        porciento = numero * 0.66;
        
        System.out.println("El numero: " + numero + " su 66% es: " + porciento);
    }
    
}
