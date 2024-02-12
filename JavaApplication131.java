package javaapplication131;

import java.util.Scanner;

public class JavaApplication131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a;
        System.out.print("Ingrese su nombre: ");
        a = sc.next();
        
        if(a.equals("Rodolfo")){
            System.out.println("20521635");
        }else{
            System.out.println("75869641");
        }
    }
    
}
