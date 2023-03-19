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
public class Proveedores extends Persona {
    private String rfc;

    public Proveedores(String rfc) {
        this.rfc = rfc;
    }

    public Proveedores(String rfc, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.rfc = rfc;
    }
    
    
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    
}
