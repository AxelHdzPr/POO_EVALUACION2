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
public class Tv {
    private int volumen;
    private int canal;
    private boolean poder;

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public boolean isPoder() {
        return poder;
    }

    public void setPoder(boolean poder) {
        this.poder = poder;
    }
    public void imprimirDatos(){
        System.out.println("El estado de la Tv es: ");
        System.out.println("Canal: " + canal);
        System.out.println("Volumen: " + volumen);
        System.out.println("Power: " + poder);
    }
}
