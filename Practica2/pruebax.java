package Practica2; 
import java.util.Scanner;
public class pruebax {
    

    
    public static void main(String[] args) {
        double num2;
        int num1;
        double suma;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("ingrese el primer numero entero: ");
        num1 = scan.nextInt();
        System.out.print("ingrese el segundo numero (decimal): ");   
        num2 = scan.nextDouble();
        suma = num1 + num2;

        System.out.println("la suma es: " + suma); 
    }
    
}




