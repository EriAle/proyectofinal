/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;



/**
 *
 * @author ALUMNO-15
 */
public class Cliente extends Persona{
    private String tipo;
    private String inicio;
    private String adeudo;

    public Cliente(String nombre, String apellidos, String direccion, String telefono, String tipo, String inicio,String sucursal) {
        super(nombre, apellidos, direccion, telefono,sucursal);
        this.tipo = tipo;
        this.inicio = inicio;
        adeudo = "no";
    }

    public Cliente(){
        
    }
    
            

    public String getAdeudo() {
        return adeudo;
    }

    public void setAdeudo(String adeudo) {
        this.adeudo = adeudo;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    

}
