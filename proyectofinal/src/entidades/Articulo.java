/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

/**
 *
 * @author ALUMNO-15
 */
public class Articulo {
    private String clave;
    private float precio;
    private String descripcion;
    private String tipo;

    public Articulo(String clave, float precio, String descripcion, String tipo) {
        this.clave = clave;
        this.precio = precio;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }
    
    public Articulo(){
        
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
