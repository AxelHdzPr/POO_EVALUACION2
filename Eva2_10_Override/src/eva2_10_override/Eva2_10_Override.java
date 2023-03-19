/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_10_override;

/**
 *
 * @author priet
 */
public class Eva2_10_Override {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = new Persona();
        Persona perso2 = new Persona("Axel Hernandez", 18);
        System.out.println(perso);
        System.out.println(perso2);
        
    }
}
class Persona{
    private String Nombre;
    private int edad;
    
    public Persona() {
        this.Nombre = "------";
        this.edad = -1;
    }
    public Persona(String Nombre, int edad) {
        this.Nombre = Nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
   
    @Override
    public String toString(){
    //NO ESTAMOS INVOCANDO AL METODO SOBREESCRITO DE LA SUPERCLASE
    //AQUI ESTAMOS REMPLAZANDO TOTALMENTE A toString DE LA SUPERCLASE
        String cade = "Datos: \n"+
                      "Nombre: " + Nombre + "\n" +
                      "Edad: " + edad;
        return cade;
                      
    }
    
}