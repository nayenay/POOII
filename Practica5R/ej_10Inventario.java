// Ejercicio 10: Inventario
// 01/09/2025
// Escribe un programa que permita al usuario ingresar una lista de productos con su nombre, precio y cantidad en inventario.
// Luego, muestra el inventario completo y calcula el valor total del inventario. Además, indica si algún producto necesita reabastecimiento (cantidad menor a 5).



package Practica5R;

import java.util.Scanner; 
import java.util.ArrayList;
public class ej_10Inventario {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in); // sirve para leer datos
        System.out.println("¿Cuántos productos desea agregar? "); // solo es una cadena de texto de salida, para el usuario
        int num= scan.nextInt(); // se lee el número de productos que se van a agregar y lo cuarda en la variable num, aquí es donde puedo ingresar el dato

        ArrayList <String> nombre= new ArrayList <> (); // se crea un arraylist para guardar los nombres de los productos
        ArrayList <Double> precio= new ArrayList<>(); // se crea un arraylist para guardar los precios de los productos
        ArrayList <Integer> cantidad= new ArrayList<>(); // se crea un arraylist para guardar las cantidades de los productos

        for (int i=0; i<num; i++){
            System.out.println("agregue el nombre del producto, precio y cantidad: ");
            nombre.add (scan.next()); // se agrega el nombre del producto al arraylist
            precio.add (scan.nextDouble()); // se agrega el precio del producto al arraylist
            cantidad.add (scan.nextInt()); // se agrega la cantidad del producto al arraylist          
        }
        // crear un objeto
        Inventario productos1= new Inventario(nombre, precio, cantidad, num);
        productos1.mostrarInventario();
    }
}

class Inventario {
    // tengo que guardar los datos de los productos
    // las siguientes tres lineas de código son atributos de la clase Inventario
    ArrayList <String> nombre; 
    ArrayList <Double> precio;
    ArrayList <Integer> cantidad; // por qué rayos integer?? porque es un arraylist, no un arreglo normal
    int num; //aún no sé por que quiero esto

    public Inventario (ArrayList <String> nombre, ArrayList <Double> precio, ArrayList <Integer> cantidad, int num){
        // este es el constructor de la clase Inventario
        // ahora hay que inicializar los atributos de la clase con los parámetros del constructor
        this.nombre= nombre; 
        this.precio= precio; 
        this.cantidad=cantidad;
        this.num=num;
    }
    public void mostrarInventario(){
        System.out.println("Inventario: ");
        for (int i=0; i<num; i++) {
            System.out.println( "producto: " + nombre.get(i) + "precio: " + precio.get(i) + "cantidad: " + cantidad.get(i));
            if (cantidad.get(i)<5){
                System.out.println( "NECESITA REBASTECIMIENTO" );
            }
        }
    }

}