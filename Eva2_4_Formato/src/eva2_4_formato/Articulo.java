/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_formato;

/**
 *
 * @author priet
 */
public class Articulo extends Documentos {
    private String editorial;
    private int numPublicacion;

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumPublicacion() {
        return numPublicacion;
    }

    public void setNumPublicacion(int numPublicacion) {
        this.numPublicacion = numPublicacion;
    }
    
}
