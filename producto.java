package Repositorio_dia2;

import java.util.Scanner;

public class producto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        double precio, IGV, total;
        
        System.out.print("Ingrese el precio base del producto: ");
        precio = sc.nextDouble();
        
        
        IGV = precio * 0.19;
        
        total = precio + IGV;
        
        
        System.out.println("Los montos a pagar son los siguientes: " + "\n" + 
                "IGV: " + IGV + " Soles" + "\n" +
                "Total: " + total + " Soles");
    }
    
}
