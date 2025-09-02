//crea una clase Numero que reciba un numero entero en su constrcuctor. Usa if para indifcar si es positivo, negativo o cero.
//package Practica3R;

//importar libreria de Scanner para leer datos
import java.util.Scanner;


// clase Numero, aquí ocurre la magia:
//   - intascia de la variable numero
// 
class Numero {
    int numero; 
    public Numero(int numero){
        this.numero=numero;
    }
    public void verificarNum(){
        if (numero>0){
            System.out.println("positivo");
        } else if (numero<0){
            System.out.println("negativo");
        } else {
            System.out.println("cero");
        }
    }
}



public class ej3_5Numero {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int num = scan.nextInt();
        Numero numero1= new Numero(num);
        numero1.verificarNum();
    }
}
