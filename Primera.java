package primera;

import java.util.Scanner;

public class Primera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b , c;
        
        System.out.println("Ingrese un numero ");
        a = sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        b = sc.nextInt();
        
        c = a - b;
        System.out.println("La suma es: " + c);
    }
}
