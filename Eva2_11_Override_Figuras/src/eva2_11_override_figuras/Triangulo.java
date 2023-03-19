/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_11_override_figuras;

/**
 *
 * @author priet
 */
public class Triangulo extends Figura{
    private double Base;
    private double Altura;

    public Triangulo(double Base, double Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }

    
    public double getBase() {
        return Base;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
    
    @Override
    public double calcularArea(){
        return (Base * Altura) / 2;
    }
    @Override
    public double calcularPerimetro(){
        return Base + Base + Base;
    }
}
