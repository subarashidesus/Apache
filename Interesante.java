package Estudios;

import java.util.Scanner;

public class Interesante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String biblia;
        System.out.print("Ingrese el tipo biblia: ");
        biblia = sc.next();
        
        if(biblia.equals("Latinoamerica")){
            System.out.println("71 libros");
        }else if(biblia.equals("Apocalipsi")){
            System.out.println("7 Bienaventuransas");
        }
    }
    
}
