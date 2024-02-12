
import java.util.Scanner;

public class AreadelCirculoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un radio");
        double radio = sc.nextDouble();
        
        // Formula area circulo, usamos algunos de los métodos de Math
        double area = Math.PI * Math.pow(radio, 2);
        
        System.out.println("El area del circulo es: " + area);
        
    }
    
}
