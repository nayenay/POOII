public class Main {
    public static void main(String[] args) {
        Nombre datos = new Nombre(); 
        datos.nombre = "Juan"; 
        datos.edad = 25; 
        datos.estatura = 1.75f; 

        
        // System.out.println("Nombre: " + datos.nombre);
        // System.out.println("Edad: " + datos.edad);
        // System.out.println("Estatura: " + datos.estatura + " m");
    }
}

class Nombre{
    String nombre; 
    //private int maria; experiminto social
    int edad; 
    float estatura; 


    void monstratInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura + " m");
    }
}