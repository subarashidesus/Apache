package Repositorio_dia2;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double pc1, pc2, pc3, ef, peso1, peso2, peso3, peso4, promedio;
        String nombre;
        
        
        System.out.print("¿Cual es su nombre?: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese la nota de la PC01: ");
        pc1 = sc.nextDouble();
        System.out.print("Ingrese la nota de la PC02: ");
        pc2 = sc.nextDouble();
        System.out.print("Ingrese la nota de la PC03: ");
        pc3 = sc.nextDouble();
        System.out.print("Ingrese la nota del Examen Final: ");
        ef = sc.nextDouble();
        
        
        peso1 = pc1 * 0.10;
        peso2 = pc2 * 0.20;
        peso3 = pc3 * 0.30;
        peso4 = ef * 0.40;
        promedio = peso1 + peso2 + peso3 + peso4;
        
        
        System.out.println("El promedio del estudiante: " + nombre + " es " + promedio );
        
        
    }
    
}
