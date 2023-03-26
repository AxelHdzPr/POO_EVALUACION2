/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_19_interfaces_figuras;

/**
 *
 * @author priet
 */
public class Eva2_19_Interfaces_Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo cir = new Circulo(134);
        cir.imprimirDatos();
        //System.out.println("CIRCULO");
        //System.out.println("Area Circulo: " + cir.calcularArea());
        //System.out.println("Perimetro Circulo: " + cir.calcularPerimetro());
        
        Triangulo trian = new Triangulo(22,22);
        trian.imprimirDatos();
        //System.out.println("TRIANGULO");
        //System.out.println("Area Triangulo: " + trian.calcularArea());
        //System.out.println("Perimetro Triangulo: " + trian.calcularPerimetro());
    }
    
}
