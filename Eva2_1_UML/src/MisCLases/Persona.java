/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisCLases;

/**
 *
 * @author priet
 */
public class Persona {
    private int ID;
    private String Nombre;
    private int Edad;
        
        
    public int getID(){
        return ID;
    }
    public String getNombre(){
        return Nombre;
    }
    public int getEdad(){
        return Edad;
    }
    public void setID(int Id){
        ID = Id;
    }
    public void setEdad(int edad){
        Edad = edad;
    }
    public void setNombre(String Name){
        Nombre = Name;
    }
        public void imprimirDatos(){
        System.out.println("Persona:");
        System.out.println("ID: " + ID);
        System.out.println("Nombre: " + Nombre);
        System.out.println("Edad: " + Edad);
}
}
