/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

/**
 *
 * @author ALUMNO-15
 */
public class Venta {
    private String noTransaccion;
    private Articulo articulo;
    private int cantidad;
    private float total;

    public Venta(String noTransaccion, Articulo articulo, int cantidad, float total) {
        this.noTransaccion = noTransaccion;
        this.articulo = articulo;
        this.cantidad = cantidad;
        this.total = total;
    }

    Venta() {
        
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNoTransaccion() {
        return noTransaccion;
    }

    public void setNoTransaccion(String noTransaccion) {
        this.noTransaccion = noTransaccion;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    private void calcularTotal (){
        total = articulo.getPrecio()*cantidad;
    }

    public String toString() {
        return "\nArticulo: " + articulo.getClave()+"\nDescripcion: "+ articulo.getDescripcion() + "\nCantidad: " + cantidad + "\nTotal: " + total ;
    }


}
