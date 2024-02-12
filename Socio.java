package Repositorio_dia2;

import java.util.Scanner;

public class Socio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double dinero, socio_A, socio_B, socio_C;
        System.out.print("Ingrese el monto de dinero: ");
        dinero = sc.nextDouble();
        
        
        socio_A = dinero * 0.30;
        socio_B = dinero * 0.20;
        socio_C = dinero * 0.50;
        
        
        System.out.println("El dinero correspondiente para cada socio es el siguiente: " + "\n" +
                "Socio A: " + socio_A + " Soles"  + "\n" + 
                "Socio B: " + socio_B + " Soles" + "\n" + 
                "Socio C: " + socio_C + " Soles");
        
    }
    
}
