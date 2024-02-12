package Repositivo;
public class Mayor_numero {
    public static void main(String[] args) {
        int numero1, numero2;
        
        numero1 = 4;
        numero2 = 6;
        
        
        if(numero1 > numero2){
            System.out.println("El numero mayor es el primero.");
        }else if( numero2 > numero1 ){
            System.out.println("El numero mayor es el segundo.");
        }else{
            System.out.println("Los dos numeros son iguales.");
        }
    }
}
