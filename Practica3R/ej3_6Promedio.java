// Crea una clase Promedio con tres calificaciones recibidas en el contructor, Claculo y usa if para indicar si el estudiante aprobó o reprobó (promedio >= 60 es aprobado)
import java.util.Scanner;

public class ej3_6Promedio {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese la primera calificación: ");
        double calif1= scan.nextDouble();
        System.out.print("Ingrese la segunda calificación: ");
        double calif2= scan.nextDouble();
        System.out.print("Ingrese la tercera calificación: ");
        double calif3= scan.nextDouble();

        Promedio promedio1= new Promedio(calif1, calif2, calif3);
        System.out.println("El promedio es: " + promedio1.calcularPromedio());
        promedio1.esAprobado();
    }
}

class Promedio{
    double calif1;
    double calif2;
    double calif3;

    public Promedio(double calif1, double calif2, double calif3){
        this.calif1= calif1; // esta linea hace que la variable calif1 de la clase tome el valor del parametro calif1
        this.calif2= calif2;
        this.calif3= calif3;
    }
    public double  calcularPromedio(){
        double promedio= (calif1 + calif2 + calif3)/3;
        return promedio; //con este compa el método debe ser double y no void
        //System.out.println("El promedio es: " + promedio);
        
    } 
    public void esAprobado(){
        if (calcularPromedio() >= 60){
            System.out.println("APROBADO c:");
        } else {
            System.out.println("REPROBADO :(");
        }    
    }
    
}