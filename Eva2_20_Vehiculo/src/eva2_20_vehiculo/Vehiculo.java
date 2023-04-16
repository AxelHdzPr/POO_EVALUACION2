/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_20_vehiculo;

/**
 *
 * @author priet
 */
public class Vehiculo implements ControlVelocidad {
    private int velocidad;
    private int detener;

    public Vehiculo(int velocidad, int detener) {
        this.velocidad = velocidad;
        this.detener = detener;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getDetener() {
        return detener;
    }

    public void setDetener(int detener) {
        this.detener = detener;
    }

    @Override
    public int Velocidad() {
        
    }

    @Override
    public int Detener() {
       
    }
    
    
}
