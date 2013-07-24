/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

/**
 *
 * @author ALUMNO-15
 */
public class Pelicula extends Medio{
    private String direccion;
    private String año;
    private String pais;
    private String idioma;
    private String subtitulos;

    public Pelicula(String clave, float precio, String descripcion, String tipo, String titulo, String clasificacion, String genero, String formato, String direccion, String año, String pais, String idioma, String subtitulos,String venta) {
        super (clave,precio,descripcion,tipo,titulo, clasificacion,genero,formato,venta);
        this.direccion = direccion;
        this.año = año;
        this.pais = pais;
        this.idioma = idioma;
        this.subtitulos = subtitulos;
    }
    
    public Pelicula(){
        
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(String subtitulos) {
        this.subtitulos = subtitulos;
    }

}
