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
public class Eva2_11_Override_Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo circu = new Circulo(10);
        System.out.println("CIRCULO");
        System.out.println("Area Circulo: " + circu.calcularArea());
        System.out.println("Perimetro Circulo: " + circu.calcularPerimetro());
        
        Triangulo tria = new Triangulo(14,18);
        System.out.println("TRIANGULO");
        System.out.println("Area Triangulo: " + tria.calcularArea());
        System.out.println("Perimetro Triangulo: " + tria.calcularPerimetro());
    }
    
}
