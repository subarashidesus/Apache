/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositoria;

import java.util.Scanner;

/**
 *
 * @author Gusta
 */
public class Prueba {
    
    /*Elaborar un algoritmo que permita ingresar el nombre del trabajador, su sueldo básico y el número de hijos, 
     se deberá mostrar su bonificación y el sueldo final. Tenga en cuenta que la empresa está dando una bonificación del 7% 
    del sueldo básico sólo en el caso el trabajador tuviese hijos./*
    */
    
    public static void main(String[] args) {
        Scanner sce = new Scanner(System.in);
        
        String nombre;
        double sueldo, bonificasion = 0, total = 0;
        int hijos;
        
        System.out.print("Ingrese su nombre: ");
        nombre = sce.next();
        System.out.print("Ingrese su sueldo: ");
        sueldo = sce.nextDouble();
        System.out.print("Ingrese su hijos");
        hijos = sce.nextInt();
        
        //proceso
        if ( hijos > 0){
            bonificasion = 0.07 * sueldo;
        }
        
        total = bonificasion + sueldo;
        
        // salida 
        System.out.println("El trabajador: " + nombre + "\n" + 
                "Su sueldo es: " + sueldo);
        
    }
    
}
