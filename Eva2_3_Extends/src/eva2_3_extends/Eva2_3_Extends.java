/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_3_extends;


/**
 *
 * @author priet
 */
public class Eva2_3_Extends {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estu = new Estudiante();
        estu.setNombre("Axel");
        estu.setApellido("Hernandez");
        estu.setEdad(18);
        estu.setNoControl("22550328");
        
        System.out.println("Datos");
        System.out.println("Nombre:" + estu.getNombre());
        System.out.println("Apellido: " + estu.getApellido());
        System.out.println("Edad: "+ estu.getEdad());
        System.out.println("NoControl: " + estu.getNoControl());
       
        Proveedores pro = new Proveedores();
        pro.setNombre("Juan");
        pro.setApellido("Marquez");
        pro.setEdad(26);
        pro.setRfc("aswhfuh");
        
        System.out.println("Datos Proveedor: ");
        System.out.println("Nombre:" + pro.getNombre());
        System.out.println("Apellido: " + pro.getApellido());
        System.out.println("Edad: "+ pro.getEdad());
        System.out.println("NoControl: " + pro.getRfc());
    }
}
