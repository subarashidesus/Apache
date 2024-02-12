package Repositorio_dia2;

import java.util.Scanner;

public class Abuelitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        double entrada_general, entrada_mayores, entrada_menores;
        double total_1, total_2, total_3, total;
        
        
        System.out.print("Ingrese la cantidad de personas para [ Entrada General ]: ");
        entrada_general = sc.nextDouble();
        System.out.print("Ingrese la cantidad de personas para [ Entrada Mayores ]: ");
        entrada_mayores = sc.nextDouble();
        System.out.print("Ingrese la cantidasd de personas para [ Entrada Menores de edad ]: ");
        entrada_menores = sc.nextDouble();
        
        total_1 = entrada_general * 150;
        total_2 = entrada_mayores * 50;
        total_3 = entrada_menores * 80;
        
        total = total_1 + total_2 + total_3;
        
        
        System.out.println("Las ganancias son las siguientes: " + "\n" + 
                "Entrada general: " + total_1 + " Soles" + "\n" + 
                "Entrada para mayores de 65: " + total_2 + " Soles" +"\n" + 
                "Entrada para menores de edad: " + total_3 + " Soles"+ "\n" + 
                "La ganancia total es: " + total + " Soles");
        
    }
    
}
