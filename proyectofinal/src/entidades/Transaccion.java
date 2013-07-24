/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ALUMNO-15
 */
public class Transaccion {
    private String nombreUsuario;
    private String fecha;
    private String noMembresia;
    private String sucursal;
    private String artTotal;
    private String total;
    private List <Venta> ventas;
    private List <Renta> rentas;

    public Transaccion(String nombreUsuario, String fecha, String noMembresia, String sucursal, String artTotal, String total) {
        this.nombreUsuario = nombreUsuario;
        this.fecha = fecha;
        this.noMembresia = noMembresia;
        this.sucursal = sucursal;
        this.artTotal = artTotal;
        this.total = total;
        ventas = new ArrayList<Venta>();
        rentas = new ArrayList<Renta>();
    }

    public String getArtTotal() {
        return artTotal;
    }

    public void setArtTotal(String artTotal) {
        this.artTotal = artTotal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNoMembresia() {
        return noMembresia;
    }

    public void setNoMembresia(String noMembresia) {
        this.noMembresia = noMembresia;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }


    public void setRentas(Renta nueva) {
        rentas.add(nueva);
    }


    public void setVentas(Venta nueva) {
        ventas.add(nueva);
    }
    public String mostrarVentas (){
        String resultado = "";
        Iterator iter = ventas.iterator();
        Venta aux = new Venta();
        while (iter.hasNext()){
            aux = (Venta) iter.next();
            resultado = "Venta \n " + aux.toString();
        }
        return resultado;
    }
    public String mostrarRentas (){
        String resultado = "";
        Iterator iter = rentas.iterator();
        Renta aux = new Renta();
        while (iter.hasNext()){
            aux = (Renta) iter.next();
            resultado = "Renta \n " + aux.toString();
        }
        return resultado;
    }
}
