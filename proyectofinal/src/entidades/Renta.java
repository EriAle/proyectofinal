/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidades;

/**
 *
 * @author ALUMNO-15
 */
public class Renta {
    private String noTransaccion;
    private Articulo articulo;
    private String inicio;
    private String entrega;
    private float total;

    public Renta(String noTransaccion, Articulo articulo, String inicio, String entrega) {
        this.noTransaccion = noTransaccion;
        this.articulo = articulo;
        this.inicio = inicio;
        this.entrega = entrega;
        this.total = articulo.getPrecio();
    }

    Renta() {
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
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

    public void setTotal() {
        this.total = articulo.getPrecio();
    }

}
