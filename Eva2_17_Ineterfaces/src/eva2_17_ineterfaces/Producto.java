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
public class Producto {
    private double Precio;
    private String Nombre;

    public Producto(){
        Precio = 0;
        Nombre = "ss";
    }
    public Producto(double Precio, String Nombre) {
        this.Precio = Precio;
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
}
