package segunda;

import java.util.Scanner;

public class Segunda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b , c;
        
        System.out.print("Ingrese un numero: ");
        a = sc.nextInt();
        System.out.print("Ingrese un numero mayor: ");
        b = sc.nextInt();
        
        c = b - a;
        
        if(c < 0){
            System.out.println("El numero es negativo: " + c);
        }else{
            System.out.println("El numero es postivo: " + c);
        }

    }
    
}
