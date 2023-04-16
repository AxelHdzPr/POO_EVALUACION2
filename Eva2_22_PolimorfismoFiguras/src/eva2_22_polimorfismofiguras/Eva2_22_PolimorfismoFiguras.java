/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_22_polimorfismofiguras;

import java.util.Scanner;

/**
 *
 * @author priet
 */
public class Eva2_22_PolimorfismoFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo[] circulos = new Circulo[10];
        //un arreglo de java va de una posicion 0 a la N-1
        //N es la cantidad de elementos del arreglo
       // for (Circulo circulo : circulos) {
            //circulos[1] = new Circulo(5);//creamos cada uno de los objetos
            //circulos[1].imprimirDatos();
       //con el scanner capturamos por el teclado la cantidad de figuras a utilizar
       
        Figuras[] figuras;
        Scanner input = new Scanner(System.in);
        System.out.println("¿Cuantas figuras quieres capturar?");
        int cant = input.nextInt();//nos permite capturar
        figuras = new Figuras[cant];//creamos el arreglo con la cantidad de figuras que quiera el usuario
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Captura el tipo de figura:");
            System.out.println("1. Circulo, 2. Triangulo");
            int figu = input.nextInt();
            if(figu == 1){//circulo
                Circulo cir = new Circulo();
                System.out.println("Introduce el radio: ");
                cir.setRadio(input.nextDouble());
                figuras[i] = cir;
            }else{//Triangulo
                Triangulo tri = new Triangulo();
                System.out.println("Introduce la Altura: ");
                tri.setAltura(input.nextDouble());
                System.out.println("Introduce la Base: ");
                tri.setBase(input.nextDouble());
                figuras[i] = tri;
            }
            //imprimir los resultados
            for (int j = 0; i < figuras.length; i++) {
                if(figuras[i] instanceof Circulo){
                    System.out.println("Circulo: ");
                }else{
                    System.out.println("Triangulo: ");
                }
                System.out.println("Figuras: " + i);
                System.out.println("Area: " + figuras[i].calcularArea());
                System.out.println("Perimetro: " + figuras[i].calcularPerimetro());
            }
        }
    }
    
}
