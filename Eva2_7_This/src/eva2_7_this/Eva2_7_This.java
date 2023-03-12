/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_7_this;

/**
 *
 * @author priet
 */
public class Eva2_7_This {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //this no se puede usar e un contexto estatico
    }
    public void imprimir(){
        //aqui tambien es visible this  
        
    }
    
}
//this es una referencia a una instancia de la clase
//todos los objetos tienen this 
//pueden usar this en cualquier clase
//this solo existe internamente dentro del objeto
class persona{
    private String nombre;

    
    public persona(String nombre){
        this.nombre = nombre;
        //this.nombre es el atributo de la clase
        //nombre es la vaiable (parametro) declarado en el metodo
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void imprimirDatos(){
        System.out.println("El nombre es: " + this.nombre);
    }
    
}