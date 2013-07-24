/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

/**
 *
 * @author ALUMNO-15
 */
public class Persona {
    private String clave;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String sucursal;

    public Persona(String nombre, String apellidos, String direccion, String telefono,String sucursal) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sucursal =  sucursal;
    }
    
    public Persona(){
        
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    


}
