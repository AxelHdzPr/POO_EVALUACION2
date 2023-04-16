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
public class Triangulo implements Figuras{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    Triangulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
         return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
    double hip = Math.hypot(base, altura);
    return base + altura + hip;
      
    }
    public void imprimirDatos(){
        System.out.println("Triangulo");
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Area: "+ calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }
  
}
