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
public class Eva2_17_Ineterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Persona perso = new Persona("Axel Hernandez", 18);
       perso.imprimirDatos();
       
       Computadora com = new Computadora("Intel 17", 12, 2500, "www");
       
    }
    
}
