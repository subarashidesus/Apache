package Repositorio_dia2;

import java.util.Scanner;

public class Aprobados_y_desaprobados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double aprobados, desaprobados, total, porcentaje1, porcentaje2;
        
        
        System.out.print("Ingrese la cantidad de alumnos aprobados: ");
        aprobados = sc.nextDouble();
        System.out.print("Ingrese la cantidad de alumnos desaprobados: ");
        desaprobados = sc.nextDouble();
        
        
        total = aprobados + desaprobados;
        porcentaje1 = (aprobados / total) * 100;
        porcentaje2 = (desaprobados / total) * 100;
        
        
        System.out.println(aprobados + " aprobados representa el " + porcentaje1 + "% del salon");
        System.out.println(desaprobados + " desaprobados representa el " + porcentaje2 + "% del salon");
    }
    
}
