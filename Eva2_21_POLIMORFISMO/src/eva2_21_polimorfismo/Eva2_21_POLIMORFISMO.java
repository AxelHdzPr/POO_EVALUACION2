/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_21_polimorfismo;

/**
 *
 * @author priet
 */
public class Eva2_21_POLIMORFISMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estu = new Estudiante("22550999","JUAN", "PEREZ", 22);
        estu.imprimirDatos();
        
        
        Docentes doc = new Docentes();
        doc.setNombre("Axel");
        doc.setApellido("Hernandez");
        doc.setEdad(29);
        doc.setPlaza("2020200202");
        doc.imprimirDatos();
        //
        //
        //
        //
        Persona Perso = estu;
        //Estpy generalizando (Simplificando)
        Persona perso2 = doc;
        Persona perso3 = new Persona();
        //Es imposible converti una persona en un etudiante
        //No podemos agregar cosas, simplemente ocultamos cosas 
        
       
        
    }
    
}
