package Repositorio_dia2;

public class Valor_de_la_verdad {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        int c = 20;
        
        
        boolean verdad1, verdad2, verdad_final;
        
        verdad1 = (a < b);
        verdad2 = (b >= c);
        
        verdad_final = verdad1 || verdad2;
        
        
        System.out.println("Los resultados son los siguientes: " + "\n" + 
                "10 < 12 : " + verdad1 + "\n" + 
                "12 >= 20 : " + verdad2 + "\n" +
                "El valor de la verdad es: " + verdad_final);
    }
    /*Elaborar un algoritmo que permita ingresar el nombre del trabajador, su sueldo básico y el número de hijos, 
     se deberá mostrar su bonificación y el sueldo final. Tenga en cuenta que la empresa está dando una bonificación del 7% 
    del sueldo básico sólo en el caso el trabajador tuviese hijos./*
}
