/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

/**
 *
 * @author ALUMNO-15
 */
public class Usuario extends Empleado{
    private String nombreUsuario;
    private String password;

    public Usuario(String nombre, String apellidos, String direccion, String telefono, String cargo, String nombreUsuario, String password,String sucursal) {
        super(nombre, apellidos, direccion, telefono, cargo, sucursal);
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Usuario(){
        
    }
    

}
