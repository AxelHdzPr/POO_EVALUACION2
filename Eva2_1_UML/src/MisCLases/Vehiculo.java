/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisCLases;

/**
 *
 * @author priet
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    
    public String getMarca(){
        return marca;
    }
    public void setMarca(String valor){
        marca = valor;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String valor){
        modelo = valor;
    }
    public int getAnio(){
        return anio;
    }
    public void setAnio(int valor){
        anio = valor;
    }
    public void imprimirDatos(){
        System.out.println("Los datos del vehiculo son: ");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Anio: " + anio);
    }
}
