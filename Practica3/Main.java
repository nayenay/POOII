package Practica3;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //int d; int diaSemana; 
        ejemploSwitch d= new ejemploSwitch();
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un número del 1 al 7 para saber el día de la semana: ");
    }
}

class ejemploSwitch {
    public static void main(String[] args){
        String dia;
        int num;
        switch (num){   
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miércoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sábado"); break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("Día no válido"); break;
    }
}
}