/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

/**
 *
 * @author ALUMNO-15
 */
public class Empleado  extends Persona{
    private String cargo;

    public Empleado(String nombre, String apellidos, String direccion, String telefono, String cargo,String sucursal) {
        super(nombre,apellidos,direccion,telefono, sucursal);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
 
    public Empleado(){
        
    }    

}
