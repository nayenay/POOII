package Practica4;
import java.util.Scanner;
public class ej4_6Estudiante {
    public static void main (String[] argas){
        // para ingresar datos
        Scanner scan= new Scanner(System.in);
        System.out.print("Ingresa tu nombre Luisito: ");
        String nombre= scan.nextLine();
        System.out.print("Ingresa tu calificación (0-100): ");
        int calificacion= scan.nextInt();

        // crear objeto
        Estudiante Luisito1= new Estudiante(nombre, calificacion);
        //mandar a llamar el método retroalimentación
        Luisito1.retroalimentacion();
    }
}

class Estudiante{
    String nombre; 
    int calificacion;
    
    public Estudiante(String nombre, int calificacion){
        this.nombre= nombre;
        this.calificacion= calificacion;
    }
    public void retroalimentacion(){
        switch(calificacion){
            case 0, 10, 20, 30, 40, 50:
                System.out.println(nombre + " te equivocaste de carrera, estudia psicología");
                break;
            case 60:
            System.out.println(nombre + " no te rindas, tú no te quivocaste de carrera");
                break;
            case 70: 
            System.out.println("Todabía puedes más " + nombre +", tengo fe en ti <3");
                break;
            case 80:
            System.out.println("¡Muy bien "+nombre+", ya casi eres un ingeniero exitoso!");
                break;
            case 90:
            System.out.println("¿No serás el próximo Bill Gates, no? :O");
                break;
            case 100: 
                System.out.println("EL ORGULLO DE MÉXICO!!!! CHINGÓN "+nombre+" <3 <3 <3");
                break;
            default: 
                System.out.println("Calificación no válida");
                break;
        }
        
    }
}