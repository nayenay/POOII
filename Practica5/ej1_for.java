package Practica5;

import java.util.Scanner;
public class ej1_for {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        System.out.println("Ingrese el número de estidiantes: ");
        int num= scan.nextInt(); 
        
        int[] calif= new int[num];
        for (int i=0; i<num; i++){
            System.out.println("Ingrese la calificación del estudiante "+(i+1)+": ");
            calif[i]= scan.nextInt();
        }
        NotasEstudiantes grupo1= new NotasEstudiantes(calif, num);
        grupo1.notita();
    }
}

class NotasEstudiantes{
    int[] calif;
    int num;
    
    public NotasEstudiantes(int[] calif, int num){
        this.calif=calif;
        this.num= num;
    }
    public void notita(){    
        int suma=0; 
        for (int i=0; i<num; i++){
            suma=suma+calif[i];
        }
        System.out.println(" La suma es: "+suma);
        System.out.println("El promedio es: "+(suma/num));
    }
   
}