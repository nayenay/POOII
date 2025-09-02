package Practica5;
//Esta no es una practica, es un ejemplo de clase
//Realiza un programa en java que obtenga loos valores de un conjunto de números y que además convierte un conjunto de nombres a mayusculas. 
//28/08/2025
import java.util.Arrays;
public class ex1_for {
    public static void main(String[] args) {
        Numeros n=new Numeros();
        n.getCuadrado();
        n.getNombres();
    }
}

class Numeros{
    int[] numeros= {1,2,3,4,5,6,7,8,9,10};
    String[] nombres= {"Ana", "Luis", "Pepe", "Maria", "Mharta"};

    // Método para obtener los valores del conjunto de números al cuadrado

    public void getCuadrado(){
        for(int i=0; i<numeros.length; i++){
            numeros[i]= numeros[i]*numeros[i];
        }
        System.out.println("Cuadrado de los números: "+Arrays.toString(numeros));
    }
    public void getNombres(){
        for (int i=0; i<nombres.length; i++){
            nombres[i]= nombres[i].toUpperCase();
        }
        System.out.println("Nombres en mayúsciulas: "+ Arrays.toString(nombres));
    }
}
