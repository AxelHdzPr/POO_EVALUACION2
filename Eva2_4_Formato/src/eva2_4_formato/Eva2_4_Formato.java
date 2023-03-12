/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_4_formato;

/**
 *
 * @author priet
 */
public class Eva2_4_Formato {

    /**
     * @param args the command line arguments
     /*Libros, Articulos, informe, sitio web, crear superclase que se llame documento; heredar de documento
     autor, titulo, año , mes, dia, ciudad, Sitio web URL agregar 2 capos distintivos de 
     articulo, informe, sitio web*/
    public static void main(String[] args) {
        // TODO code application logic here
        
        Documentos doc = new Documentos();
        doc.setAño(2013);
        doc.setCiudad("Chihuahua, Chihuahua");
        doc.setDia(17);
        doc.setMes("Junio");
        doc.setTitulo("Entre la vida y la muerte");
        
        System.out.println("DOCUMENTO");
        System.out.println("Titulo: " + doc.getTitulo());
        System.out.println("Ciudad: " + doc.getCiudad());
        System.out.println("Año:  " + doc.getAño());
        System.out.println("Mes: " + doc.getMes());
        System.out.println("Dia: " + doc.getDia());
        
        Articulo Art = new Articulo();
        doc.setAño(2006);
        doc.setCiudad("Chihuahua, Chihuahua");
        doc.setDia(17);
        doc.setMes("Diciembre");
        doc.setTitulo("La vida es un riesgo");
        Art.setEditorial("Alba");
        Art.setNumPublicacion(193);
        
        System.out.println("ARTICULO");
        System.out.println("Titulo: " + doc.getTitulo());
        System.out.println("Ciudad: " + doc.getCiudad());
        System.out.println("Año:  " + doc.getAño());
        System.out.println("Mes: " + doc.getMes());
        System.out.println("Dia: " + doc.getDia());
        System.out.println("Edititorial: " + Art.getEditorial());
        System.out.println("Numero de Publicacion: " + Art.getNumPublicacion());
        

        Libro Lib = new Libro();
        doc.setAño(2022);
        doc.setCiudad("Chihuahua, Chihuahua");
        doc.setDia(17);
        doc.setMes("Junio");
        doc.setTitulo("La Creacion");
        Lib.setAutor("Axel Hernandez");
        Lib.setEditorial("ALba");
        
        System.out.println("LIBRO");
        System.out.println("Titulo: " + doc.getTitulo());
        System.out.println("Ciudad: " + doc.getCiudad());
        System.out.println("Año:  " + doc.getAño());
        System.out.println("Mes: " + doc.getMes());
        System.out.println("Dia: " + doc.getDia());
        System.out.println("Autor: " + Lib.getAutor());
        System.out.println("Editorial: " + Lib.getEditorial());
        
        Informe inf = new Informe();
        doc.setAño(2004);
        doc.setCiudad("Chihuahua, Chihuahua");
        doc.setDia(17);
        doc.setMes("Marzo");
        doc.setTitulo("El misterio del oceano");
        inf.setPaginas(58);
        inf.setTipoInforme("Expositivo");
        
        System.out.println("INFORME");
        System.out.println("Titulo: " + doc.getTitulo());
        System.out.println("Ciudad: " + doc.getCiudad());
        System.out.println("Año:  " + doc.getAño());
        System.out.println("Mes: " + doc.getMes());
        System.out.println("Dia: " + doc.getDia());
        System.out.println("Paginas: " + inf.getPaginas());
        System.out.println("Tipo de Informe: " + inf.getTipoInforme());
        
        SitioWeb sw = new SitioWeb();
        doc.setAño(1995);
        doc.setCiudad("Chihuahua, Chihuahua");
        doc.setDia(17);
        doc.setMes("Junio");
        doc.setTitulo("Noticias NFL");
        sw.setNombreDelSitio("Noticias del Futbol Americano");
        sw.setURL("www.NFA.com.mx");
        
        System.out.println("SITIO WEB");
        System.out.println("Titulo: " + doc.getTitulo());
        System.out.println("Ciudad: " + doc.getCiudad());
        System.out.println("Año:  " + doc.getAño());
        System.out.println("Mes: " + doc.getMes());
        System.out.println("Dia: " + doc.getDia());
        System.out.println("Nombre del Sitio: " + sw.getNombreDelSitio());
        System.out.println("URL: " + sw.getURL());
        
    }
    
}
