/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_9_super2;

/**
 *
 * @author priet
 */
public class Eva2_9_Super2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estu = new Estudiante("22550328", "Axel", "Hernandez", 18);
        estu.imprimirDatos();
        System.out.println("No. Control: " + estu.getNoControl());
        
        Docentes doce = new Docentes("273889", "Axel", "Hernandez", 28);
        doce.imprimirDatos();
        System.out.println("Plaza: " + doce.getPlaza());
        
        Proveedores pro = new Proveedores("AXLO8384792", "Axel", "Hernandez", 22);
        pro.imprimirDatos();
        System.out.println("RFC: " + pro.getRfc());
    }
    
}
