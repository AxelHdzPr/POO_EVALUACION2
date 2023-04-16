/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_22_polimorfismofiguras;

/**
 *
 * @author priet
 */
public class Circulo implements Figuras {
    private double Radio;
    
    public Circulo(){
        
    }

    public Circulo(double Radio) {
        this.Radio = Radio;
    }

    
    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }
    @Override
    public double calcularArea(){
        return Math.PI * Radio;
    }
    @Override
    public double calcularPerimetro(){
        return Math.PI * (Radio * 2);
    }
    public void imprimirDatos(){
        System.out.println("Circulo: ");
        System.out.println("Radio: " + Radio);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }
}
