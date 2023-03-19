/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_super2;

/**
 *
 * @author priet
 /*Clase derivada extends Clase Base,*/
public class Estudiante extends Persona {
    private String noControl;

    public Estudiante(String noControl) {
        this.noControl = noControl;
    }

    public Estudiante(String noControl, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.noControl = noControl;
    }

    
    
    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
    
    @Override //OCULTA LEL METODO (CON LA MISMA FIRMA LA SUPERCLASE) EN ESTE CASO
              // REMPLAZA A IMPRIMIRDATOS() DE LA CLASE PERSONA
    public void imprimirDatos(){
    /*System.out.println("Nombre: " + getNombre());
    System.out.println("Apellido: " + getApellido());
    System.out.println("Edad: " + getEdad());
    System.out.println("No.Control: " + getNoControl());*/
    super.imprimirDatos();//viene de la clase persona
    System.out.println("No.Control: " + getNoControl());
}
}
