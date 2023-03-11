/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_1_uml;

/**
 *
 * @author priet
 */
public class Eva2_1_UML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MisCLases.Persona perso = new MisCLases.Persona();
        
        perso.imprimirDatos();
        
        MisCLases.Vehiculo car = new MisCLases.Vehiculo();
        
        car.imprimirDatos();
        
        MisCLases.Tv tv = new MisCLases.Tv();
        
        tv.imprimirDatos();
    }
    
}
