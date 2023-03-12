/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_8_super;

/**
 *
 * @author priet
 */
public class Eva2_8_Super {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        animal animal = new animal("Drako", 20);
        mamifero mamifero = new mamifero("negro", "Drako", 35);
        perros perros = new perros();
    }
    
}


class animal{
private String nombre;
private int peso;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

public animal(){
    System.out.println("Its a live: ");
    
}

    public animal(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
        System.out.println("Its a live constructor 2 ");
    }
public void respirar(){
    System.out.println("Estoy respirando");
}
}



class mamifero extends animal{
    private String colorPelo;

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public mamifero(String colorPelo, String nombre, int peso) {
        super(nombre, peso);//llamada al constructor de la super clase
        this.colorPelo = colorPelo;
        System.out.println("Soy un mamifero constructor 2");
    }
    
    
    public mamifero(){
        //Super --> apuntador a la superclase 
        //lo primero a llamar a un constructir es llamar
        //al constructor de la superficie
        super();//llamada al constructor default
        System.out.println("Soy un mamifero");
    }
}

class perros extends mamifero{

    public perros() {
        super();
        System.out.println("Soy un perro");
    }
    
}