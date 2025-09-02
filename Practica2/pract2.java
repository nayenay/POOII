package Practica2;
import java.util.Scanner;

public class pract2 {

    public static void main(String[] args) {
        Triangulo tr = new Triangulo();
        tr.pedirDatos();     
        tr.calcularCateto(); // Calcula el otro cateto y lo muestra
    }
}

class Triangulo {
    double hipotenusa;
    double catetoUno;
    double catetoDos;

    void pedirDatos() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el valor de la hipotenusa: ");
        hipotenusa = scan.nextDouble();
        System.out.print("Ingrese el valor del cateto: ");
        catetoUno = scan.nextDouble();
        
        // Mostrar los datos ingresados
        System.out.println("Hipotenusa ingresada: " + hipotenusa);
        System.out.println("Cateto ingresado: " + catetoUno);
        
        
    }

    void calcularCateto() {
        
        catetoDos = Math.sqrt((hipotenusa * hipotenusa) - (catetoUno * catetoUno));
        System.out.println("El otro cateto es: " + catetoDos);
    }
}
