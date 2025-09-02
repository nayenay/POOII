// 21 de agosto de 2025
// pimer ejercicio de POO de hoy 
import java.util.Scanner;
public class Prueba {
    double num1;
    double num2; 
    
    void pedirDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();
    }
    void Suma() {
        double resultado = num1 + num2;
        System.out.println("La suma es: " + resultado);
    }

    // public static void main(String[] args) {
    //     Prueba calculadora = new Prueba();
    //     calculadora.pedirDatos();
    //     calculadora.Suma();
    }
}
