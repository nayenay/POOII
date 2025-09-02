import java.util.Scanner;
public class ej3_7TrianguloRectangulo {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        System.out.print("Ingrese el primer cateto del triángulo rectángulo: ");
        double base= scan.nextDouble();
        System.out.print("Ingrese el segundo cateto del triángulo rectángulo: ");
        double altura= scan.nextDouble(); 

        //crear objeto
        TrianguloRectangulo triangulo1= new TrianguloRectangulo(base, altura);
        triangulo1.calcularHipotenusa();
        System.out.println("La hipotenusa del triángulo es: " + triangulo1.calcularHipotenusa());
        triangulo1.esIsosceles();
        
    }
    
}
class TrianguloRectangulo{
    double base;
    double altura;

    public TrianguloRectangulo(double base, double altura){
        this.base= base;
        this.altura= altura;
    }
    
    public double calcularHipotenusa(){
        double hipotenusa= Math.sqrt((base*base)+(altura*altura));
        return hipotenusa;
    }

    public void esIsosceles(){
        if (base==altura){
            System.out.println("El triángulo es isósceles");
        } else {
            System.out.println("El triángulo es escaleno");
        }
    }
}
