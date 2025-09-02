package Practica3;

class Libro {
    String titulo;
    String autor;
    int anio; 

    public Libro (String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }
    public void MostrarInfo(){
        System.out.println("título: " + titulo);
        System.out.println("autor: " + autor);
        System.out.println("año: " + anio);
    }
    public void EsAntiguo(){
        if (anio <2000){
            System.out.println("El libro es antiguo"); 
        }else{
            System.out.println("El libro está actualizado");
        }
        
    }
    public boolean EsAntiguo2(){
        if (anio <2000){
            return true; 
        }else{
            return false; 
        }
     }

    }
public class ej2Libro {
    public static void main(String[] args){
        Libro libro1= new Libro("El Quijote", "Miguel de Cervantes", 1605);
        
        libro1.MostrarInfo();
        libro1.EsAntiguo();
    }
}