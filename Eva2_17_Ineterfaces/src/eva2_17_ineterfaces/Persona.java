/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_17_ineterfaces;

/**
 *
 * @author priet
 */
public class Persona implements MostrarDatos{
    private String Nombre;
    private int Edad;
    
    public Persona(){
        Nombre = "";
        Edad = -1;
    }

    public Persona(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + Edad);
    }
    
    
}
