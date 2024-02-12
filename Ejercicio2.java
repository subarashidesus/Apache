package Repositorio_dia_1;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        double dinero, laMar, abancay,julio,aviacion, tacna;
        
        
        System.out.print("Ingrese el monto de dinero destinado a la reparación: ");
        dinero = sc.nextDouble();
        
        laMar = dinero * 0.35;
        abancay = dinero * 0.25;
        julio = dinero * 0.10;
        aviacion = dinero * 0.15;
        tacna = dinero - (laMar + abancay + julio + aviacion);
        
        System.out.println("El dinero destinado a Avenida La Mar es: " + laMar + "soles");
        System.out.println("El dinero destinado a Avenida Abanacay es: " + abancay + "soles");
        System.out.println("El dinero destinado a Avenida 28 de julio es: " + julio + "soles");
        System.out.println("El dinero destinado a Avenida Aviacion es: " + aviacion + "soles");
        System.out.println("El dinero destinado a Avenida Tacna es: " + tacna + "soles");
        
        sc.close();
    }
}
