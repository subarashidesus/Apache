package Repositivo;

import java.util.Scanner;

public class Fernando {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nombre = "Gustavo", a;
        
        
        System.out.print("Ingrese su nombre: ");
        a = scanner.next();
        
        if(a.equals(nombre)){
            System.out.println("Bienvenido al sistema Gustavo");
        }scanner.close();
        
        
    }
    
}
