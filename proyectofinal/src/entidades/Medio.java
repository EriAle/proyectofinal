/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

/**
 *
 * @author ALUMNO-15
 */
public class Medio extends Articulo{
    private String titulo;
    private String clasificacion;
    private String genero;
    private String formato;
    private String venta;

    public Medio(String clave, float precio, String descripcion, String tipo, String titulo, String clasificacion, String genero, String formato,String venta) {
        super (clave,precio,descripcion,tipo);
        this.titulo = titulo;
        this.clasificacion = clasificacion;
        this.genero = genero;
        this.formato = formato;
        this.venta = venta;
    }
    
    public Medio(){
        
    }

    public String getVenta() {
        return venta;
    }

    public void setVenta(String venta) {
        this.venta = venta;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
