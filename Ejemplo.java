package Repositoria;

import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        String nombre, mensaje;
        
        System.out.print("Ingrese su nombre: ");
        nombre = sc.next();
        
        if ( nombre.equals("Flor")){
            mensaje = "Ella tiene 18 años";
        }else if ( nombre.equals("Gustavo")){
            mensaje = "El tiene 18 años";
        }else {
            mensaje = "Error";
        }
        
        System.out.println("El resultado es: " + mensaje);
                
        
    }
    
}
