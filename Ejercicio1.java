package Repositorio_dia_1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double porcentaje_varones, mujeres, varones, total, porcentaje_mujeres;

        System.out.print("Ingrese la cantidad de varones: ");
        varones = sc.nextInt();
        System.out.print("Ingrese la cantidad de mujeres: ");
        mujeres = sc.nextInt();

        total = varones + mujeres;

        porcentaje_varones = (varones / total) * 100;
        porcentaje_mujeres = (mujeres / total) * 100;

        System.out.println("El porcentaje de varones es: " + porcentaje_varones + "%");
        System.out.println("El porcentaje de mujeres es: " + porcentaje_mujeres + "%");

        sc.close();
    }
}


