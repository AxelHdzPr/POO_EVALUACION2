/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_18_interfaces_herencia;

/**
 *
 * @author priet
 */
public class Eva2_18_Interfaces_Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
interface intA{
    public abstract void A();
}
interface intB{
    void B();//implicitamente esta incluido public abstrtact
}
interface intC extends intA, intB{
    public abstract void C();
}
class prueba implements intC{

    @Override
    public void C() {
        
    }

    @Override
    public void A() {
        
    }

    @Override
    public void B() {
      
    }
    
}