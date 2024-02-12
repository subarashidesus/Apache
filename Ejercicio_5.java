package Repositorio_dia_1;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double metros, centimetro, milimetro;
        
        System.out.print("Ingrese el valor en metros: ");
        metros = sc.nextDouble();
        
        centimetro = metros * 100;
        milimetro = metros * 1000;
        
        System.out.println(metros + " metros en centimetros es: " + centimetro);
        System.out.println(metros + " metros en milimetros es: " + milimetro);
    }
    
}
