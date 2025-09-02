package Practica1;
//import java.util.Scanner;
public class Main{
    //metodo main
    // este cdigo realiza las 4 operaciones basicas con dos numeros enteros
    public static void main(String[] args){
        
        class OperacionesBasicas{
            int num1 = 4;
            int num2 = 4;
            int resultadoSuma = num1 + num2;
            int resultadoResta = num1 - num2;
            int resultadoMulti = num1 * num2;
            int resultadoDivision = num1 / num2;
            
            //metodos
            void Sumar(){
                System.out.println("La suma es: " + resultadoSuma);
            }
            void Restar(){
                System.out.println("La resta es: " + resultadoResta);
            }
            void Multiplicar(){
                System.out.println("El producto es: " + resultadoMulti);
            } 
            void Dividir(){
                System.out.println("El cociente es: " + resultadoDivision);
            }
        }    
        
        OperacionesBasicas metodo = new OperacionesBasicas();
        
        
        metodo.Sumar();
        metodo.Restar();
        metodo.Multiplicar();
        metodo.Dividir();
        
    }
}
//fin main
//fin clase