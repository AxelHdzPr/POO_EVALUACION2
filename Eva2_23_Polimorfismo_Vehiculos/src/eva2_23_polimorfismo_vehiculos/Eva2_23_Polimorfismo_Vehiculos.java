/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_23_polimorfismo_vehiculos;

/**
 *
 * @author priet
 */
public class Eva2_23_Polimorfismo_Vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
interface DatosVehiculo{
    public abstract void acelerar (int cambio);
    void tablero();
}
class Vehiculos{
    String marca;
    protected int velocidad;
   
    public Vehiculos(){
        this.marca = "-------";
        this.velocidad = -1;
    }

    public Vehiculos(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    //la velocidad se modifica en acelerar
    public int getVelocidad() {
        return velocidad;
    }
    
}

class Automovil extends Vehiculos implements DatosVehiculo{
    private String modelo;
    private int año;

    
    public Automovil() {
        super();
        this.modelo = "---------";
        this.año = -1;
    }
    
    public Automovil( String modelo, int año) {
        super(marca, velocidad);
        this.modelo = modelo;
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public void acelerar(int cambio) {
    int cambioVel = velocidad  + cambio;
    if ((velocidad += cambio)){
        velocidad += cambio;
        }
    }
    
@Override
public void tablero() {
    System.out.println("Velocidad del Automovil");
    }
    
}


class Bicicleta extends Vehiculos{
    private String tipo;
    private String rodada;

    public Bicicleta(String tipo, String rodada) {
        this.tipo = tipo;
        this.rodada = rodada;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRodada() {
        return rodada;
    }

    public void setRodada(String rodada) {
        this.rodada = rodada;
    }

public void Acelerar(int cambio) {
    int cambioVel = velocidad  + cambio;
    if ((velocidad += cambio)>=0)
       velocidad += cambio;
    }
    
public void tablero() {
    System.out.println("La velocidad de la bicicleta");
    }  
}