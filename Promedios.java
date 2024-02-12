package Repositorio_dia2;

import java.util.Scanner;

public class Promedios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        double nota1, nota2, nota3, nota4, promedio;
        
        System.out.print("Ingrese la nota 1: ");
        nota1 = sc.nextDouble();
        System.out.print("Ingrese la nota 2: ");
        nota2 = sc.nextDouble();
        System.out.print("Ingrese la nota 3: ");
        nota3 = sc.nextDouble();
        System.out.print("Ingrese la nota 4: ");
        nota4 = sc.nextDouble();
        
        promedio = (nota1 + nota2 + nota3 + nota4) / 4;
        
        
        System.out.println("El promedio de las 4 notas es: " + promedio);
        
        sc.close();
    }
    
}
