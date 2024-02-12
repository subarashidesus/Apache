package Repositorio_dia_1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double numero, porcentaje;
        
        System.out.print("Ingrese un numero entero: ");
        numero = sc.nextDouble();
        
        
        porcentaje = numero * 0.20;
        
        
        System.out.println("El 20% de el numero es: " + porcentaje);
        
        
        
        
    }
    
}
