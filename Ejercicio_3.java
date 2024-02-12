package Repositorio_dia_1;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double num1, num2, suma, producto;
        
        System.out.print("Ingrese el primer numero: ");
        num1 = sc.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        num2 = sc.nextDouble();
        
        suma = num1 + num2;
        producto = num1 * num2;
        
        
        System.out.println("La suma de los dos numeros es: " + suma);
        System.out.println("La multiplicacion de los numeros es: " + producto);
        
    }
    
}
