/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

/**
 *
 * @author ALUMNO-15
 */
public class Videojuego extends Medio{
    private String plataforma;
    private String noJugadores;

    public Videojuego(String clave, float precio, String descripcion, String tipo, String titulo, String clasificacion, String genero, String formato, String plataforma, String noJugadores,String venta) {
        super (clave,precio,descripcion,tipo,titulo, clasificacion,genero,formato,venta);
        this.plataforma = plataforma;
        this.noJugadores = noJugadores;
    }
    
    public Videojuego(){
        
    }

    public String getNoJugadores() {
        return noJugadores;
    }

    public void setNoJugadores(String noJugadores) {
        this.noJugadores = noJugadores;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

}
